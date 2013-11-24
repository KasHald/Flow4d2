package THEPackage;

import java.util.ArrayList;

public class Game {
    
    private ArrayList<WordPair> pairs;
    private String quizName, questionButtonText, answerButtonText, lookupButtonText, questionLabelText, answerLabelText;
    
    public Game(String quizName, String questionButtonText, String answerButtonText, String lookupButtonText, String questionLabelText, String answerLabelText){
        this.quizName = quizName;
        this.questionButtonText = questionButtonText;
        this.answerButtonText = answerButtonText;
        this.lookupButtonText = lookupButtonText;
        this.questionLabelText = questionLabelText;
        this.answerLabelText = answerLabelText;
    }
    
    public String getQuizName(){
        return this.quizName;
    }
    
    public String getQuestionButtonText(){
        return this.questionButtonText;
    }
    
    public String getAnswerButtonText(){
        return this.answerButtonText;
    }
    
    public String getLookupButtonText(){
        return this.lookupButtonText;
    }
    
    public String getQuestionLabelText(){
        return this.questionLabelText;
    }
    
    public String getAnswerLAbelText(){
        return this.answerLabelText;
    }
    
    public ArrayList<WordPair> getPairs(){
        return pairs;
    }
    
    public void addWordPair(WordPair wp){
        
    }
}