import java.util.Scanner;

// import jdk.internal.util.xml.impl.Input;

public class Main {
    public static void main(String args[]) {
        String question = "What is the largest planet in out solar system?";
        String choiceOne = "Earth";
        String choiceTwo = "Jupiter";
        String choiceThree = "Saturn";

        String correctAnswer = choiceTwo;
        
        System.out.println(question);

        System.out.println("Choose one of the following: " + choiceOne + ", " + choiceTwo + ", " + choiceThree + ".");
        
        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();

        scanner.close();

        if (correctAnswer.equals(input.toLowerCase())) {
            System.out.println("you did it");
        } else {
            System.out.println("I am ashamed, the correct answer was " + correctAnswer);
        }
    }
}