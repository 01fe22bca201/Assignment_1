/**
 * The PrimeNumber class takes a range of numbers as input and prints out all the prime numbers within
 * that range.
 */
import java.util.Scanner;
public class FindThePrimeNumber {

   public static boolean isPrime(int num) {
       if (num <= 1) {
           return false;
       }
       for (int i = 2; i <= Math.sqrt(num); i++) {
           if (num % i == 0) {
               return false;
           }
       }
       return true;
   }

   // The `main` method is the entry point of the Java program. It is the method that is executed when
   // the program is run.
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter the range to find prime numbers (start end): ");
       int start = scanner.nextInt();
       int end = scanner.nextInt();

       System.out.println("Prime numbers between " + start + " and " + end + ":");
       for (int i = start; i <= end; i++) {
           if (isPrime(i)) {
               System.out.print(i + " ");
           }
       }
       scanner.close();
   }
}