const nameINPUT = document.getElementById("studentName");
const greetButton = document.getElementById("greetBtn");
const output = document.getElementById("output");

greetButton.addEventListener("click", function() {
    const name = nameINPUT.value.trim();

    if (name !== "") {
        output.textContent = `Hello, ${name}! Welcome to EVENT DRIVEN WEB DEVELOPMENT!`;

    }
});

nameINPUT.addEventListener("input", function() {
    output.textContent = "";
});
