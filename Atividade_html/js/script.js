document.getElementById("formCadastro").addEventListener("submit", function (event) {
    event.preventDefault();

    const dados = {
        nomeCompleto: document.getElementById("nomeCompleto").value,
        cpf: document.getElementById("cpf").value,
        dataNascimento: document.getElementById("dataNascimento").value,
        telefone: document.getElementById("telefone").value,
        email: document.getElementById("email").value,
        numeroPassaporte: document.getElementById("numeroPassaporte").value,
        validadePassaporte: document.getElementById("validadePassaporte").value
    };

    document.getElementById("formCadastro").reset();

    alert("Seja bem-vindo, " + dados.nomeCompleto + "!");

    window.location.href = "TelaInicial.html";
});

document.addEventListener("DOMContentLoaded", function () {
    document.getElementById("btnLogout").addEventListener("click", function () {
        window.location.href = "TelaInicial.html";
    });
});
