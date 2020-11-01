package bot;

import java.util.Scanner;

/**
 * Course: JetBrains Academy, Java Developer Track
 * Project: Simple Chatty Bot
 * Purpose: Very basic console chat bot to practice using variables, conditions, loops, and methods.
 *
 * @author Mirek Drozd
 * @version 1.0
 */
public class SimpleBot {
    public static Scanner scanner = new Scanner(System.in);
    final static String ASSISTANT_NAME = "Alice";
    final static String BIRTH_YEAR = "2020";
    
    /**
     * The main method begins execution of the program.
     *
     * @param args not used
     */
    public static void main(String[] args) {
        greet(ASSISTANT_NAME, BIRTH_YEAR);
        remindName();
        guessAge();
        count();
        quiz();
    }


    /**
     * Greets and asks the user about their name.
     *
     * @param assistantName The name of the bot.
     * @param birthYear The year the bot was created.
     */
    static void greet(String assistantName, String birthYear) {
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
    }

    /**
     * Reads user name from standard input and uses the name in response.
     */
    static void remindName() {
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }

    /**
     * Pretends to guess user age on the basis of remainders of dividing their age by 3, 5, and 7 (input by user).
     * Actually, using a special formula, the bot calculates the age with 100% accuracy.
     */
    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Say me remainders of dividing your age by 3, 5 and 7.");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    /**
     * Bot asks user for a number and shows that it can count from 0 to that number.
     */
    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    /**
     * Bot asks user a programming question until the user selects the correct answer.
     * After successful attempt, bot says 'Goodbye' and the program exits.
     */
    static void quiz() {
        System.out.println("Let's test your programming knowledge.");
        // write your code here
        System.out.println("Which of the following isn't a programming concept?");
        System.out.printf("1. Lambda\n" +
                          "2. Currying\n" +
                          "3. Functional decomposition\n" +
                          "4. Duplex\n");
        int answer;
        boolean isTrue;
        do {
            answer = scanner.nextInt();
            if (answer == 4) {
                isTrue = true;
            } else {
                isTrue = false;
                System.out.println("Please, try again.");
            }
        } while (isTrue == false);
        end();
    }

    /**
     * Says 'Goodbye' to user and exits the program.
     */
    static void end() {
        System.out.println("Congratulations, have a nice day!");
    }
}
