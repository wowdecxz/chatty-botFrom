import java.util.Scanner;

public class Chatty_Bot {
    final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        greet("Aid","2022");
        remindName();
        guessAge();
        count();
        test();
        end();
    }
    static void greet(String assistantName, String birthYear) {
        System.out.println("Hello! My name is "+assistantName+".");
        System.out.println("I was created in "+birthYear+".");
        System.out.println("Please, remind me your name.");
    }
    static void remindName() {
        String name = scanner.nextLine();
        System.out.println("What a great name you have, "+name+"!");
    }
    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int number3 = scanner.nextInt();
        int number5 = scanner.nextInt();
        int number7 = scanner.nextInt();
        int yourAge = (number3 * 70 + number5 * 21 + number7 * 15) % 105;
        System.out.println("Your age is " + yourAge + " that's a good time to start programming!");
    }
    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int numberStep = scanner.nextInt();
        for (int a = 0; a <= numberStep; a++) {
            System.out.println(a+"!");
        }
    }
    static void test() {
        System.out.println("Let's test your programming knowledge.\n" +
                "Why do we use methods?\n" +
                "1. To repeat a statement multiple times.\n" +
                "2. To decompose a program into several small subroutines.\n" +
                "3. To determine the execution time of a program.\n" +
                "4. To interrupt the execution of a program.");
        for (int answer = scanner.nextInt(); answer != 2; answer = scanner.nextInt()) {
            System.out.println("Please, try again.");
        }
    }
    static void end() {
        System.out.println("Congratulations, have a nice day!");
    }
}
