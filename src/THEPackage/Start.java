package THEPackage;

public class Start {
    public static void main(String[] args) {
        QuizControlInterface control = new QuizControl();
        
        System.out.println("Load status: " + control.loadGames());
        
        System.out.println(control.getSelectedGameName() + "\n"
                 + control.getQuestionButtonText() + "\n"
                 + control.getAnswerButtonText() + "\n"
                 + control.getLookupButtonText() + "\n"
                 + control.getQuestionLabelText() + "\n"
                 + control.getAnswerLabelText() + "\n");
    }
}