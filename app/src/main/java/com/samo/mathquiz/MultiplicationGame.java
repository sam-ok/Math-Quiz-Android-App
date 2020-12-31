package com.samo.mathquiz;

import java.util.ArrayList;
import java.util.List;

public class MultiplicationGame {
    private List<MultiplicationQuestion> questions;
    private int numberCorrect;
    private int numberIncorrect;
    private int totalQuestions;
    private int score;
    private MultiplicationQuestion currentQuestion;

    public MultiplicationGame() {
        numberCorrect = 0;
        numberIncorrect = 0;
        totalQuestions = 0;
        score = 0;
        currentQuestion = new MultiplicationQuestion(10);
        questions = new ArrayList<MultiplicationQuestion>();
    }

    public void makeNewQuestion(){
        currentQuestion = new MultiplicationQuestion(totalQuestions = 2 + 5);
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

    public List<MultiplicationQuestion> getQuestions() {
        return questions;
    }

    public void setQuestions(List<MultiplicationQuestion> questions) {
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

    public MultiplicationQuestion getCurrentQuestion() {
        return currentQuestion;
    }

    public void setCurrentQuestion(MultiplicationQuestion currentQuestion) {
        this.currentQuestion = currentQuestion;
    }
}
