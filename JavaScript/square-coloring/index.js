function addSquare(event) {
  event.preventDefault();
  let colorContainer = document.createElement("div");
  colorContainer.classList.add("square-container");
  let colorInput = document.createElement("input");
  colorInput.setAttribute("type", "text");
  colorInput.classList.add("color");
  colorContainer.appendChild(colorInput);
  colorContainer.appendChild(document.createElement("br"));
  document.getElementById("main-container").appendChild(colorContainer);
}