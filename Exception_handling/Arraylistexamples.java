package Assignments;
import java.util.ArrayList;
public class Arraylistexamples {

        public static void main(String[] args) {
            // Create an ArrayList of integers
            ArrayList<Integer> numbers = new ArrayList<>();

            // Add 10 numbers to the ArrayList
            for (int i = 1; i <= 10; i++) {
//            numbers.add(i);
                System.out.println(i);
            }

            // Print the numbers using a for-each loop
            for (int number : numbers) {
                System.out.println(number);
            }
        }
    }

