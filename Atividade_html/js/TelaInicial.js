document.getElementById("formLogin").addEventListener("submit", function (event) {
    event.preventDefault();

    const email = document.getElementById("emailLogin").value;
    const senha = document.getElementById("senhaLogin").value;

    console.log("Login realizado:", email);

    window.location.href = "Dashboard.html";
});