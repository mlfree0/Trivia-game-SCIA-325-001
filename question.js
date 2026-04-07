class Question {
  constructor(name = "", category = "", correctAnswer = "", wrongAnswer1 = "", wrongAnswer2 = "", wrongAnswer3 = "") {
    this.name = name;
    this.category = category;
    this.correctAnswer = correctAnswer;
    this.wrongAnswer1 = wrongAnswer1;
    this.wrongAnswer2 = wrongAnswer2;
    this.wrongAnswer3 = wrongAnswer3;
  }

  getName() {
    return this.name;
  }

  setName(name) {
    this.name = name;
  }

  getCategory() {
    return this.category;
  }

  getCorrectAnswer() {
    return this.correctAnswer;
  }

  setCorrectAnswer(correctAnswer) {
    this.correctAnswer = correctAnswer;
  }

  getWrongAnswer1() {
    return this.wrongAnswer1;
  }

  setWrongAnswer1(wrongAnswer1) {
    this.wrongAnswer1 = wrongAnswer1;
  }

  getWrongAnswer2() {
    return this.wrongAnswer2;
  }

  setWrongAnswer2(wrongAnswer2) {
    this.wrongAnswer2 = wrongAnswer2;
  }

  getWrongAnswer3() {
    return this.wrongAnswer3;
  }

  setWrongAnswer3(wrongAnswer3) {
    this.wrongAnswer3 = wrongAnswer3;
  }
}

// Makes the class available in browser scripts
window.Question = Question;
