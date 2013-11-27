package THEPackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class QuizControl implements QuizControlInterface {

    private ArrayList<Game> games;
    private int currentGame;
    private PrintWriter pw;
    private Scanner scan;

    public QuizControl() {
        currentGame = 0;
        games = new ArrayList();
    }

    @Override
    public boolean loadGames() {
        try {
            int counter = 0;
            Game tempGame = null;
            scan = new Scanner(new File("games.txt"));
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                System.out.println(counter + " : " +  line);
                if (line.contains("GAME::")) {
                    String[] temp = line.split("::");
                    tempGame = new Game(temp[1], temp[2], temp[3], temp[4], temp[5], temp[6]);
                    System.out.println("New quiz");
                } else if (line.contains(",")) {
                    String[] temp = line.split(",");
                    WordPair tempWP = new WordPair(temp[0], temp[1]);
                    if (tempGame != null) {
                        tempGame.addWordPair(tempWP);
                        System.out.println("Wordpair added");
                    }
                } else if (line.contains("GAMEEND")) {
                    this.games.add(tempGame);
                    System.out.println("Quiz added to array");
                }
                counter++;
            }
            return true;
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
            return false;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    @Override
    public String[] getGameNames() {
        String[] temp = new String[this.games.size()];
        for (int x = 0; x < temp.length; x++) {
            temp[x] = this.games.get(x).getQuizName();
        }
        return temp;
    }

    @Override
    public void selectGame(String gameName) {
        for (int x = 0; x < this.games.size(); x++) {
            if (this.games.get(x).getQuizName().equals(gameName)) {
                this.currentGame = x;
            }
        }
    }

    @Override
    public String getSelectedGameName() {
        return this.games.get(currentGame).getQuizName();
    }

    @Override
    public String getQuestionLabelText() {
        return this.games.get(currentGame).getQuestionLabelText();
    }

    @Override
    public String getAnswerLabelText() {
        return this.games.get(currentGame).getAnswerLabelText();
    }

    @Override
    public String getQuestionButtonText() {
        return this.games.get(currentGame).getQuestionButtonText();
    }

    @Override
    public String getAnswerButtonText() {
        return this.games.get(currentGame).getAnswerButtonText();
    }

    @Override
    public String getLookupButtonText() {
        return this.games.get(currentGame).getLookupButtonText();
    }

    @Override
    public void addQuizz(String quizzName, String questionButtonText, String answerButtonText, String lookupButtonText, String questionLabelText, String answerLabelText) {
        Game temp = new Game(quizzName, questionButtonText, answerButtonText, lookupButtonText, questionLabelText, answerLabelText);
        games.add(temp);
    }

    @Override
    public boolean saveQuizz() {
        try {
            pw = new PrintWriter("games.txt");
            for (int x = 0; x < this.games.size(); x++) {
                pw.write("GAME::" + this.games.get(x).getQuizName());
                ArrayList<WordPair> temp = this.games.get(x).getPairs();
                for (int y = 0; y < temp.size(); y++) {
                    pw.write(temp.get(y).getQuestion() + "," + temp.get(y).getAnswer());
                    if (y != temp.size() - 1) {
                        pw.println("\n");
                    }
                }
                pw.write("GAMEEND\n");
            }
            pw.close();
            return true;
        } catch (FileNotFoundException ex) {
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public Game currentGame() {
        return games.get(currentGame);
    }
}