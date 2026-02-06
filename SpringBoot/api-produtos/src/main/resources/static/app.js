const API_URL = "http://localhost:8080/products";

let editingId = null;

document.addEventListener("DOMContentLoaded", () => {
    loadProducts();
});


async function loadProducts() {
    try {
        const response = await fetch(API_URL);
        const products = await response.json();

        const table = document.getElementById("productTable");
        table.innerHTML = "";

        products.forEach(product => {
            table.innerHTML += `
                <tr>
                    <td>${product.id}</td>
                    <td>${product.name}</td>
                    <td>${product.price.toFixed(2)}</td>
                    <td class="text-end">
                        <button class="btn btn-sm btn-primary me-1" onclick="editProduct(${product.id})">
                            <i class="fa fa-edit"></i>
                        </button>
                        <button class="btn btn-sm btn-danger" onclick="deleteProduct(${product.id})">
                            <i class="fa fa-trash"></i>
                        </button>
                    </td>
                </tr>
            `;
        });

        document.getElementById("countBadge").innerText = products.length;
    } catch (error) {
        console.error("Erro ao carregar produtos:", error);
    }
}

async function saveProduct(event) {
    event.preventDefault();

    const name = document.getElementById("name").value;
    const price = parseFloat(document.getElementById("price").value);

    const product = { name, price };

    try {
        if (editingId === null) {
            // CREATE
            await fetch(API_URL, {
                method: "POST",
                headers: { "Content-Type": "application/json" },
                body: JSON.stringify(product)
            });

            showToast("Produto cadastrado com sucesso!");
        } else {
            // UPDATE
            await fetch(`${API_URL}/${editingId}`, {
                method: "PUT",
                headers: { "Content-Type": "application/json" },
                body: JSON.stringify(product)
            });

            showToast("Produto atualizado com sucesso!");
        }

        resetForm();
        loadProducts();
    } catch (error) {
        console.error("Erro ao salvar produto:", error);
    }
}

async function editProduct(id) {
    try {
        const response = await fetch(`${API_URL}/${id}`);
        const product = await response.json();

        document.getElementById("name").value = product.name;
        document.getElementById("price").value = product.price;

        editingId = id;
        document.getElementById("formTitle").innerText = "Editar Produto";
    } catch (error) {
        console.error("Erro ao buscar produto:", error);
    }
}

async function deleteProduct(id) {
    if (!confirm("Deseja realmente excluir este produto?")) return;

    try {
        await fetch(`${API_URL}/${id}`, {
            method: "DELETE"
        });

        showToast("Produto removido com sucesso!");
        loadProducts();
    } catch (error) {
        console.error("Erro ao excluir produto:", error);
    }
}


function resetForm() {
    document.querySelector("form").reset();
    editingId = null;
    document.getElementById("formTitle").innerText = "Novo Produto";
}


function showToast(message) {
    const toastEl = document.getElementById("toast");
    document.getElementById("toastMsg").innerText = message;

    const toast = new bootstrap.Toast(toastEl);
    toast.show();
}
