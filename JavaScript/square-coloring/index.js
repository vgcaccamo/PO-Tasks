function addSquare(e) {
  e.preventDefault();

  let colorContainer = document.createElement("div");
  colorContainer.classList.add("square-container");

  let colorInput = document.createElement("input");
  colorInput.setAttribute("type", "text");
  colorInput.classList.add("color");

  colorContainer.appendChild(colorInput);
  colorContainer.appendChild(document.createElement("br"));

  document.getElementById("main-container").appendChild(colorContainer);
}

function calculateColoringTime(colors) {
  let sum = colors.length * 2;
  if (colors.length > 1) {
    for (let i = 1; i < colors.length; i++) {
      let last = colors[i - 1];
      let current = colors[i];
      if (last != current) {
        sum++;
      }
    }
  }
  return sum;
}

document.getElementById("form").addEventListener("submit", (e) => {
  e.preventDefault();

  //returns array of HTML elements
  let colors = Array.from(document.getElementsByClassName("color"));

  //gets values from elements
  for (let i = 0; i < colors.length; i++) {
    colors[i] = colors[i].value.toLowerCase();
  }

  //removes empty entries
  colors = colors.filter((n) => n);

  result = calculateColoringTime(colors);

  document.getElementById("result").innerText = result + " seconds";
});
