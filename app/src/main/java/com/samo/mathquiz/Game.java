package com.samo.mathquiz;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<AdditionQuestion> questions;
    private int numberCorrect;
    private int numberIncorrect;
    private int totalQuestions;
    private int score;
    private AdditionQuestion currentQuestion;

    public Game() {
        numberCorrect = 0;
        numberIncorrect = 0;
        totalQuestions = 0;
        score = 0;
        currentQuestion = new AdditionQuestion(10);
        questions = new ArrayList<AdditionQuestion>();
    }

    public void makeNewQuestion(){
        currentQuestion = new AdditionQuestion(totalQuestions = 2 + 5);
        totalQuestions++;
        questions.add(currentQuestion);
    }
    public boolean checkAnswer(int submittedAnswer){
        boolean isCorrect;
        if (currentQuestion.getAnswer() == submittedAnswer){
            numberCorrect++;
            isCorrect = true;
        }else {
            numberIncorrect++;
            isCorrect = false;
        }
        score = numberCorrect * 10 - numberIncorrect * 20;
        return isCorrect;
    }

    public List<AdditionQuestion> getQuestions() {
        return questions;
    }

    public void setQuestions(List<AdditionQuestion> questions) {
        this.questions = questions;
    }

    public int getNumberCorrect() {
        return numberCorrect;
    }

    public void setNumberCorrect(int numberCorrect) {
        this.numberCorrect = numberCorrect;
    }

    public int getNumberIncorrect() {
        return numberIncorrect;
    }

    public void setNumberIncorrect(int numberIncorrect) {
        this.numberIncorrect = numberIncorrect;
    }

    public int getTotalQuestions() {
        return totalQuestions;
    }

    public void setTotalQuestions(int totalQuestions) {
        this.totalQuestions = totalQuestions;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public AdditionQuestion getCurrentQuestion() {
        return currentQuestion;
    }

    public void setCurrentQuestion(AdditionQuestion currentQuestion) {
        this.currentQuestion = currentQuestion;
    }
}
