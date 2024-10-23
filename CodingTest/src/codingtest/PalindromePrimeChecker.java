package codingtest;

import java.util.Scanner;

public class PalindromePrimeChecker {

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while (number > 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return originalNumber == reversedNumber;
    }

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) return false; // 0 and 1 are not prime numbers
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false; // Found a divisor
        }
        return true; // No divisors found, it's prime
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        boolean palindrome = isPalindrome(number);
        boolean prime = isPrime(number);

        if (palindrome && prime) {
            System.out.println(number + " is both a palindrome and a prime.");
        } else if (palindrome) {
            System.out.println(number + " is a palindrome but not a prime.");
        } else if (prime) {
            System.out.println(number + " is a prime but not a palindrome.");
        } else {
            System.out.println(number + " is neither a palindrome nor a prime.");
        }

        scanner.close();
    }
}