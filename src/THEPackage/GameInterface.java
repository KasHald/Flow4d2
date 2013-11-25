/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package THEPackage;

import java.util.ArrayList;

/**
 *
 * @author Esben
 */
public interface GameInterface
{
    String getQuizName();
    
    String getQuestionButtonText();
    
    String getAnswerButtonText();
    
    String getLookupButtonText();
    
    String getQuestionLabelText();
    
    String getAnswerLabelText();
    
    ArrayList<WordPair> getPairs();
    
    String getAnswer();
    
    String getQuestion();
    
    String getRandomQuestion();
    
    int size();
    
    boolean checkGuess(String question, String guess);
    
    String Lookup(String question);
    
            
           

    
   
}
