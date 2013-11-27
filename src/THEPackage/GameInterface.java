package THEPackage;

import java.util.ArrayList;

public interface GameInterface
{
    String getQuizName();
    
    String getQuestionButtonText();
    
    String getAnswerButtonText();
    
    String getLookupButtonText();
    
    String getQuestionLabelText();
    
    String getAnswerLabelText();
    
    ArrayList<WordPair> getPairs();
    
    String getAnswer(int i);
    
    String getQuestion(int i);
    
    String getRandomQuestion();
    
    void addWordPair(WordPair WP);
    
    int size();
    
    boolean checkGuess(String question, String guess);
    
    String Lookup(String question);
}
