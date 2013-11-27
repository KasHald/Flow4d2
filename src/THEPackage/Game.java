package THEPackage;

import java.util.ArrayList;
import java.util.Random;

public class Game implements GameInterface {
    
    private ArrayList<WordPair> pairs;
    private String quizName, questionButtonText, answerButtonText, lookupButtonText, questionLabelText, answerLabelText;
    private Random r;
    
    public Game(String quizName, String questionButtonText, String answerButtonText, String lookupButtonText, String questionLabelText, String answerLabelText){
        this.quizName = quizName;
        this.questionButtonText = questionButtonText;
        this.answerButtonText = answerButtonText;
        this.lookupButtonText = lookupButtonText;
        this.questionLabelText = questionLabelText;
        this.answerLabelText = answerLabelText;
        this.r = new Random();
    }
    
    @Override
    public String getQuizName(){
        return this.quizName;
    }
    
    @Override
    public String getQuestionButtonText(){
        return this.questionButtonText;
    }
    
    @Override
    public String getAnswerButtonText(){
        return this.answerButtonText;
    }
    
    @Override
    public String getLookupButtonText(){
        return this.lookupButtonText;
    }
    
    @Override
    public String getQuestionLabelText(){
        return this.questionLabelText;
    }
    
    @Override
    public String getAnswerLabelText(){
        return this.answerLabelText;
    }
    
    @Override
    public ArrayList<WordPair> getPairs(){
        return pairs;
    }
    
    @Override
    public String getAnswer(int i){
        return pairs.get(i).getAnswer();
    }
    
    @Override
    public String getQuestion(int i){
        return pairs.get(i).getQuestion();
    }
    
    @Override
    public String getRandomQuestion(){
        return getQuestion(r.nextInt(pairs.size()));
    }
    
    @Override
    public void addWordPair(WordPair wp){
        pairs.add(wp);
    }

    @Override
    public int size() {
        return pairs.size();
    }

    @Override
    public boolean checkGuess(String question, String guess) {
        for (int x = 0; x < pairs.size(); x++){
            if (pairs.get(x).getQuestion().equalsIgnoreCase(question)){
                if (pairs.get(x).getAnswer().equalsIgnoreCase(guess)){
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String Lookup(String question) {
        for (int x = 0; x < pairs.size(); x++){
            if (pairs.get(x).getQuestion().equalsIgnoreCase(question)){
                return pairs.get(x).getAnswer();
            }
        }
        return null;
    }
    
    
}