const API_URL = "https://bootcamp-produtos-higoralves-aagac7e6aecyfvb7.brazilsouth-01.azurewebsites.net/products";

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

    const name = document.getElementById("name").value.trim();
    const price = parseFloat(document.getElementById("price").value);

    if (!name) {
        showToast("O nome do produto não pode ficar vazio!");
        return;
    }

    if (isNaN(price) || price <= 0) {
    showToast("O preço deve ser maior que zero!", true);
    return;
    }

    const product = { name, price };

    try {
        if (editingId === null) {

            await fetch(API_URL, {
                method: "POST",
                headers: { "Content-Type": "application/json" },
                body: JSON.stringify(product)
            });

            showToast("Produto cadastrado com sucesso!");
        } else {

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
        showToast("Erro ao salvar produto!");
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


function showToast(message, isError = false) {
    const toastEl = document.getElementById("toast");
    const toastMsg = document.getElementById("toastMsg");

    // limpa tudo
    toastEl.className = "toast align-items-center border-0 text-white";

    // define a cor
    if (isError) {
        toastEl.style.backgroundColor = "#dc3545";
    } else {
        toastEl.style.backgroundColor = "#198754";
    }

    toastMsg.innerText = message;

    bootstrap.Toast.getOrCreateInstance(toastEl).show();
}



