import java.util.Scanner;

import jdk.internal.util.xml.impl.Input;

public class Main {

    public static void main(String args[]) {
        String question = "what is 1+1";
        String choiceOne = "1";
        String choiceTwo = "2";
        String choiceThree = "3";

        String correctAnswer = choiceTwo;

        // Write a print statement asking the question
        System.out.println(question);
        // Write a print statement giving the answer choices
        System.out.println("2,3,4?");

        // Have the user input an answer
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        // Retrieve the user's input
        if (correctAnswer.equals(input)) {
            System.out.println("you did it");
        } else {
            System.out.println("I am ashamed, the correct answer was " + correctAnswer);
        }

        // If the user's input matches the correctAnswer...
        // then the user is correct and we want to print out a congrats message to the user.

        // If the user's input does not match the correctAnswer...
        // then the user is incorrect and we want to print out a message saying that the user is incorrect as well as what the correct choice was.

    }

}
