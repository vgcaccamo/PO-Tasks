document.getElementById("form").addEventListener("submit", (e) => {
  e.preventDefault();

  let headline = document.getElementById("entry").value.replace(/[^A-Za-z\s]/g, '').split(/\s/g);
  let hashtags = headline.sort((a, b) => b.length - a.length).slice(0, 3);

  let hashString = "";
  for (word of hashtags) {
    hashString += "#" + word + " ";
  }

  document.getElementById("hashtags").innerText = hashString.trim();;
});