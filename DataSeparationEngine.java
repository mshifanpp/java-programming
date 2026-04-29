import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class DataSeparationEngine {
    public static void main(String[] args) {

        // 1. Establish File Pointers
        File inputFile = new File("numbers.txt");
        File evenFile = new File("even.txt");
        File oddFile = new File("odd.txt");

        System.out.println("-> Initiating Tokenization Sequence...");

        // Multi-Stream Try-With-Resources
        try (
            Scanner sc = new Scanner(inputFile);
            PrintWriter evenWriter = new PrintWriter(evenFile);
            PrintWriter oddWriter = new PrintWriter(oddFile)
        ) {

            int count = 0;

            // Read integers from file
            while (sc.hasNextInt()) {

                int number = sc.nextInt();
                count++;

                // Check parity
                if (number % 2 == 0) {
                    evenWriter.println(number); // Write even numbers
                } else {
                    oddWriter.println(number);  // Write odd numbers
                }
            }

            System.out.println("Result: Successfully processed " + count + " integers.");
            System.out.println("Output written to 'even.txt' and 'odd.txt'.");

        } catch (FileNotFoundException e) {
            System.err.println("FATAL I/O ERROR: 'numbers.txt' not found.");
            System.err.println("Fix: Create 'numbers.txt' and add integers to it.");
        }
    }
}
