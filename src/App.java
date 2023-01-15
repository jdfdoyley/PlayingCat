/**
 * Author: Jason D'Oyley
 * Date: Jan 14, 2023
 * Section: 5 Expressions, Statements & More
 * Topic: Coding Exercise 12: Playing Cat
 */

public class App {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 10));     // false
        System.out.println(isCatPlaying(true, 36));     // true
        System.out.println(isCatPlaying(false, 36));    // false
        System.out.println(isCatPlaying(false, 35));    // true
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        boolean output = summer && (temperature >= 25 && temperature <= 45);

        if (!summer && (temperature >= 25 && temperature <= 35)) {
            output = true;
        }

        return output;
    }
}
