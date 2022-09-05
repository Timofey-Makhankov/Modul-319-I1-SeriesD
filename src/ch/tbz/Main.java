// Defines package
package ch.tbz;

// Imports libraries
import static java.lang.System.*;   // System-IO Library for abbriviation purpose to static functions
import static java.lang.Math.*;     // Mathematic Library for abbriviation purpose to static functions
import java.util.*;                 // Random is part of this library

// Imports Input functions
import static ch.tbz.lib.Input.*;       // All the functions can be used now!

//Every program must be placed in a class ...
public class Main {
    // Our main function which runs the program12
    public static void main(String[] args ) {
        Random rand = new Random();
        int result = 0;
        boolean is_running = true;
        while (is_running) {
            char user_input = inputChar("What do you want to train? +, - or * ?");
            int randomInt1 = rand.nextInt(101);
            int randomInt2 = rand.nextInt(101);
            if (user_input == '+') {
                result = Addition(randomInt1, randomInt2);
            } else if (user_input == '-') {
                result = Subtraction(randomInt1, randomInt2);
            } else{
                result = Multiplication(randomInt1, randomInt2);
            }
            System.out.println(randomInt1 + " " + user_input + " " + randomInt2 + " = ?");
            int answer = inputInt("Enter the result:");
            if (answer != result) {
                out.println("WRONG: The Result is " + result);
            } else {
                out.println("CORRECT, The Result is " +  result);
            }
            String decision = inputString("Do you want to test again? Yes or no?");
            if (decision.equals("no")) {
                out.println("Okay, goodbye");
                is_running = false;
            }

        }
    }
    static int Addition(int num1, int num2){
        return num1 + num2;
    }
    static int Subtraction(int num1, int num2){
        return num1 - num2;
    }
    static int Multiplication(int num1, int num2){
        return num1 * num2;
    }
}
