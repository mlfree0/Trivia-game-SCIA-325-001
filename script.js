let selectedCategory = null;

// Load categories on page load
window.onload = function () {
  const categories = startGame();
  const buttons = document.querySelectorAll(".category-btn");

  buttons.forEach((btn, index) => {
    btn.textContent = categories[index];
    btn.onclick = () => {
      selectedCategory = categories[index];
      document.querySelectorAll(".category-btn").forEach(b => b.classList.remove("selected"));
      btn.classList.add("selected");
    };
  });
};

// Start question button
document.getElementById("begin-btn").onclick = function () {
  const wagerInput = document.getElementById("wager").value;

  if (!selectedCategory || !wagerInput) {
    alert("Select a category and enter a wager!");
    return;
  }

  setWager(wagerInput);

  const data = chooseCategory(selectedCategory);

  // Switch screens
  document.getElementById("start-screen").style.display = "none";
  document.getElementById("question-screen").style.display = "block";

  // Set question + category
  document.getElementById("selected-category").textContent = "Category: " + data.category;
  document.getElementById("question-text").textContent = data.question;

  const answerButtons = document.querySelectorAll(".answer-btn");

  answerButtons.forEach((btn, index) => {
    btn.textContent = data.answers[index];
    btn.onclick = () => checkAnswer(data.answers[index]);
  });
};

// Answer logic
function checkAnswer(answer) {
  const result = submitAnswer(answer);

  document.getElementById("question-screen").style.display = "none";
  document.getElementById("result-screen").style.display = "block";

  if (result.correct) {
    document.getElementById("result-message").textContent = "Correct!";
  } else {
    document.getElementById("result-message").textContent =
      "Incorrect! Correct answer: " + result.correctAnswer;
  }

  document.getElementById("updated-score").textContent =
    "Score: " + result.score;
}

// Play again
document.getElementById("play-again-btn").onclick = function () {
  location.reload();
};