package lu.uni.programming1.lab2.exercise4;

import java.util.Scanner;

/**
 *  Class for Exercise 4
 */
public class DivisibleByThree {

	public static void main(String[] args) {
        int n, sum;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number with at least 4 digits: ");

        n = scanner.nextInt();
        sum = 0;

        for (int i = 0; i < 4; i++) {
            sum += n%10;
            n = n/10;
        }
        System.out.println("Sum of the digits: " + sum);

        final String msg = (sum % 3 == 0)
        ? "The number can be divided by 3" : "The number can't be divided by 3";
        System.out.println(msg);


        scanner.close();
    }
}