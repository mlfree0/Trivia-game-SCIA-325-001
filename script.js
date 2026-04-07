class Question {
  constructor(name = "", category = "", correctAnswer = "", wrongAnswer1 = "", wrongAnswer2 = "", wrongAnswer3 = "") {
    this.name = name;
    this.category = category;
    this.correctAnswer = correctAnswer;
    this.wrongAnswer1 = wrongAnswer1;
    this.wrongAnswer2 = wrongAnswer2;
    this.wrongAnswer3 = wrongAnswer3;
  }

  getName() { return this.name; }
  setName(name) { this.name = name; }
  getCategory() { return this.category; }
  getCorrectAnswer() { return this.correctAnswer; }
  setCorrectAnswer(correctAnswer) { this.correctAnswer = correctAnswer; }
  getWrongAnswer1() { return this.wrongAnswer1; }
  setWrongAnswer1(wrongAnswer1) { this.wrongAnswer1 = wrongAnswer1; }
  getWrongAnswer2() { return this.wrongAnswer2; }
  setWrongAnswer2(wrongAnswer2) { this.wrongAnswer2 = wrongAnswer2; }
  getWrongAnswer3() { return this.wrongAnswer3; }
  setWrongAnswer3(wrongAnswer3) { this.wrongAnswer3 = wrongAnswer3; }
}

const allQuestions = [
  new Question("In what year did Star Wars release?", "Movies", "1977", "1980", "1975", "1982"),
  new Question("What team won Superbowl 60?", "Sports", "Seattle Seahawks", "Kansas City Chiefs", "New England Patriots", "Denver Broncos"),
  new Question("How many $500 bills are included in a modern edition of Monopoly?", "Board Games", "40", "20", "30", "25"),
  new Question("In what year did the American Revolution end?", "American History", "1783", "1778", "1780", "1786"),
  new Question("Who is the CEO of Facebook?", "Social Media", "Mark Zuckerberg", "Bill Gates", "Jeff Bezos", "Ted Sarandos"),
  new Question("What videogame contains the famous \"BLJ\" glitch?", "Videogames", "Super Mario 64", "The Legend of Zelda: Ocarina of Time", "Donkey Kong 64", "Crash Bandicoot"),
  new Question("What is the only planet in our solar system to rotate clockwise on its axis?", "Astronomy", "Venus", "Mercury", "Jupiter", "Neptune"),
  new Question("How many states does the Appalachian Trail cross?", "Geography", "14", "8", "10", "16"),
  new Question("M&M’S Fruit Chews would eventually become what popular candy?", "Food", "Starburst", "Skittles", "Hi-Chew", "Dots"),
  new Question("What guitarist performed on the Michael Jackson song \"Beat it\"?", "Music", "Eddie Van Halen", "Jimmy Page", "Randy Rhoades", "Stevie Ray Vaughn"),
  new Question("Which of these Sci-Fi movies did Steven Spielberg not help create?", "Movies", "2001: A Space Odyssey", "Back to the Future", "Ready Player One", "E.T."),
  new Question("What’s the diameter of a basketball hoop in inches?", "Sports", "18 inches", "14 inches", "20 inches", "17 inches"),
  new Question("In what year was the first Scrabble board game sold?", "Board Games", "1948", "1961", "1954", "1966"),
  new Question("Who was the 23rd President of the United States?", "American History", "Benjamin Harrison", "James Buchanan", "Theodore Roosevelt", "Woodrow Wilson"),
  new Question("What is one of the few social media platforms to still have a form of dislikes?", "Social Media", "Reddit", "Instagram", "Blue Sky", "Facebook"),
  new Question("Which videogame series features a half demon who wields a sword and twin pistols?", "Videogames", "Devil May Cry", "Resident Evil", "Kid Icarus", "Persona"),
  new Question("What galaxy is the closest to the Milky Way?", "Astronomy", "Andromeda Galaxy", "Black Eye Galaxy", "Helix Galaxy", "Southern Pinwheel Galaxy"),
  new Question("Which of these countries is landlocked?", "Geography", "Austria", "Germany", "Bulgaria", "Latvia"),
  new Question("What was the first pizza restaurant chain to deliver?", "Food", "Domino's", "Pizza Hut", "Fox's Den", "Little Caesar's"),
  new Question("Which of these bands has a one-armed drummer?", "Music", "Def Leppard", "Metallica", "Van Halen", "Whitesnake")
];

const gameState = {
  score: 0,
  wager: 0,
  categoryChoices: [],
  currentQuestion: null,
  currentAnswers: [],
  selectedCategory: null
};

function shuffleArray(array) {
  const arr = [...array];
  for (let i = arr.length - 1; i > 0; i--) {
    const j = Math.floor(Math.random() * (i + 1));
    [arr[i], arr[j]] = [arr[j], arr[i]];
  }
  return arr;
}

function getThreeUniqueQuestions() {
  const shuffled = shuffleArray(allQuestions);
  const chosen = [];
  const usedCategories = new Set();

  for (const q of shuffled) {
    if (!usedCategories.has(q.getCategory())) {
      chosen.push(q);
      usedCategories.add(q.getCategory());
    }
    if (chosen.length === 3) break;
  }
  return chosen;
}

function startGame() {
  gameState.score = 0;
  gameState.wager = 0;
  gameState.currentQuestion = null;
  gameState.currentAnswers = [];
  gameState.selectedCategory = null;
  gameState.categoryChoices = getThreeUniqueQuestions();
  return gameState.categoryChoices.map(q => q.getCategory());
}

function setWager(amount) {
  const wager = Number(amount);
  gameState.wager = Number.isFinite(wager) && wager > 0 ? wager : 0;
  return gameState.wager;
}

function chooseCategory(categoryName) {
  const selected = gameState.categoryChoices.find(
    q => q.getCategory().toLowerCase() === String(categoryName).toLowerCase()
  );
  if (!selected) return null;

  gameState.currentQuestion = selected;
  gameState.currentAnswers = shuffleArray([
    selected.getCorrectAnswer(),
    selected.getWrongAnswer1(),
    selected.getWrongAnswer2(),
    selected.getWrongAnswer3()
  ]);

  return {
    question: selected.getName(),
    answers: [...gameState.currentAnswers],
    category: selected.getCategory()
  };
}

function submitAnswer(answerText) {
  if (!gameState.currentQuestion) {
    return { error: "No question has been selected yet." };
  }

  const correct = answerText === gameState.currentQuestion.getCorrectAnswer();
  if (correct) {
    gameState.score += gameState.wager;
  } else {
    gameState.score -= gameState.wager;
  }

  return {
    correct,
    correctAnswer: gameState.currentQuestion.getCorrectAnswer(),
    score: gameState.score
  };
}

document.addEventListener("DOMContentLoaded", function () {
  const categoryButtons = document.querySelectorAll(".category-btn");
  const beginBtn = document.getElementById("begin-btn");
  const playAgainBtn = document.getElementById("play-again-btn");
  const wagerInput = document.getElementById("wager");
  const selectedCategoryText = document.getElementById("selected-category");
  const questionText = document.getElementById("question-text");
  const answerButtons = document.querySelectorAll(".answer-btn");
  const resultMessage = document.getElementById("result-message");
  const updatedScore = document.getElementById("updated-score");
  const scoreDisplay = document.getElementById("score");

  const startScreen = document.getElementById("start-screen");
  const questionScreen = document.getElementById("question-screen");
  const resultScreen = document.getElementById("result-screen");

  function loadCategories() {
    const categories = startGame();

    categoryButtons.forEach((btn, index) => {
      btn.textContent = categories[index] || "Category";
      btn.dataset.category = categories[index] || "";
      btn.style.border = "";
      btn.style.backgroundColor = "";
      btn.style.color = "";
      btn.onclick = function () {
        gameState.selectedCategory = this.dataset.category;
        categoryButtons.forEach(b => {
          b.style.border = "";
          b.style.backgroundColor = "";
          b.style.color = "";
        });
        this.style.border = "2px solid #000";
        this.style.backgroundColor = "#333";
        this.style.color = "#fff";
      };
    });

    scoreDisplay.textContent = "Score: 0";
    if (wagerInput) wagerInput.value = "";
  }

  beginBtn.onclick = function () {
    if (!gameState.selectedCategory) {
      alert("Please select a category first.");
      return;
    }

    const wager = setWager(wagerInput.value);
    if (!wager) {
      alert("Please enter a valid wager.");
      return;
    }

    const data = chooseCategory(gameState.selectedCategory);
    if (!data) {
      alert("Could not load the question.");
      return;
    }

    startScreen.style.display = "none";
    questionScreen.style.display = "block";
    resultScreen.style.display = "none";

    selectedCategoryText.textContent = "Category: " + data.category;
    scoreDisplay.textContent = "Score: " + gameState.score;
    questionText.textContent = data.question;

    answerButtons.forEach((btn, index) => {
      btn.textContent = data.answers[index];
      btn.onclick = function () {
        const result = submitAnswer(this.textContent);

        questionScreen.style.display = "none";
        resultScreen.style.display = "block";

        if (result.correct) {
          resultMessage.textContent = "Correct!";
        } else {
          resultMessage.textContent = "Incorrect! Correct answer: " + result.correctAnswer;
        }

        updatedScore.textContent = "Score: " + result.score;
        scoreDisplay.textContent = "Score: " + result.score;
      };
    });
  };

  playAgainBtn.onclick = function () {
    startScreen.style.display = "block";
    questionScreen.style.display = "none";
    resultScreen.style.display = "none";
    loadCategories();
  };

  loadCategories();
});