package THEPackage;

public interface QuizzControlInterface {
// rev chu 18-04-2013

/**
 * THA: 31-10-2013: This is a change to the original interface 
* Pre: 
* Post: 
* Loading all games from file: quizzConfigurations.txt 
*/
boolean loadGames();
 
/**
* Pre: 
* Post: 
* Returns a list of names of selectable games 
*/
String[] getGameNames();

/**
* Pre: The name passed corresponds to a selectable game
* Post: The existing collection of word pairs is cleared.
*/
void selectGame(String gameName);

/**
* Pre: 
* Post: 
* Returns the name of the game presently selected. If no game is selected it returns null.
*/
String getSelectedGameName();

/**
* Pre: 
* Post:
* Returns an appropriate text for a label placed next to a â€œquestion fieldâ€� 
* corresponding to the selected game. 
* If no game is selected it returns null
*/
String getQuestionLabelText();
/**
* Pre: 
* Post:
* Returns an appropriate text for a label placed next to an "answer field"
* corresponding to the selected game. 
* If no game is selected it returns null 
*/
String getAnswerLabelText();
/**
* Pre: 
* Post:
* Returns an appropriate text for a button used to request a new random question
* corresponding to the selected game. 
* If no game is selected it returns null
*/
String getQuestionButtonText();

/**
* Pre: 
* Post:
* Returns an appropriate text for a button used to submit an answer (quess)
* corresponding to the selected game. 
* If no game is selected it returns null
*/
String getAnswerButtonText();


/**
* Pre: 
* Post:
* Returns an appropriate text for a button used to lookup an answer
* corresponding to the selected game. 
* If no game is selected it returns null
*/
String getLookupButtonText();


  /**
   * Pre: Post: A new quizz is added to the existing collection of quizzes
   */
void addQuizz(String quizzName, String questionButtonText, String answerButtonText, String lookupButtonText, String questionLabelText, String answerLabelText);

  /**
   * Pre: Post: All the quizzes configuration data are save to the file
   * "quizzConfigurations.txt". Returns true if successfully done. Otherwise false.
   */
void saveQuizz();
}