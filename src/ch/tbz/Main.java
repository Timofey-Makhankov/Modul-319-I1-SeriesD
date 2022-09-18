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
        double result = 0;
        boolean is_running = true;
        while (is_running) {

            char user_input = inputChar("What do you want to train? +, - or * ?");
            float randomInt1 = rand.nextInt(101);
            float randomInt2 = rand.nextInt(101);

            if (user_input == '+') {
                randomInt1 += roundAvoid(random(), 1);
                randomInt2 += roundAvoid(random(), 1);
                result = Addition(randomInt1, randomInt2);
            } else if (user_input == '-') {
                randomInt1 += roundAvoid(random(), 1);
                randomInt2 += roundAvoid(random(), 1);
                result = Subtraction(randomInt1, randomInt2);
            } else{
                result = Multiplication(randomInt1, randomInt2);
            }
            result = roundAvoid(result, 1);

            System.out.println(randomInt1 + " " + user_input + " " + randomInt2 + " = ?");

            double answer = inputDouble("Enter the result:");
            answer = roundAvoid(answer, 1);

            if (answer != result) {
                out.println("WRONG: The Result is " + result);
            } else {
                out.println("CORRECT, The Result is " +  result);
            }

            String decision = inputString("Do you want to test again? Yes or no?").toLowerCase();
            
            if (decision.equals("no")) {
                out.println("Okay, goodbye");
                is_running = false;
            }

        }
    }
    static float Addition(float num1, float num2){
        return num1 + num2;
    }
    static float Subtraction(float num1, float num2){
        return num1 - num2;
    }
    static float Multiplication(float num1, float num2){
        return num1 * num2;
    }

    //! Source = https://www.baeldung.com/java-round-decimal-number
    public static double roundAvoid(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }
}
