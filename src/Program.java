import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess the word:");
        while(true) {
            String stopWord = scanner.nextLine();
            if(stopWord.equals(StopWords.SPRING.getStopWord())) {
                System.out.println("You are guess");
                break;
            } else if(stopWord.equals(StopWords.END.getStopWord())) {
                System.out.println("Bye");
                break;
            } else {
                System.out.println("Try again");
            }
        }
    }
}
