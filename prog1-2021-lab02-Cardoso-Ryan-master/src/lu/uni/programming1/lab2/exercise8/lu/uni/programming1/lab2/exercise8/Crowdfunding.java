package lu.uni.programming1.lab2.exercise8;

import java.util.Scanner;

/**
 *  Class for Exercise 8
 */
public class Crowdfunding {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int Pledge;

		System.out.println("Hello, you can support us by pledging : 10€, 20€, 50€, 100€, 200€ or 500€.");
		System.out.println("10€  : Beer with TAs.");
		System.out.println("20€  : Your name in ASCII art.");
		System.out.println("50€  : You get a public display of your donation on Moodle.");
		System.out.println("100€ : Uni.lu USB Stick of 128GB.");
		System.out.println("200€ : Uni.lu Smartphone cover & Keychain << I love Programming 1 >>.");
		System.out.println("500€ : Autograph of your professors & Five free lunches at the Food house.");

		System.out.println("Enter the amount of money you want to give: " + "€");
		Pledge = scan.nextInt();

		
		switch (Pledge) {
  			case 10:
    			System.out.println("You get a beer with TAs");
   				break;
  			case 20:
   				System.out.println("You get your name in ASCII art & the previous rewards.");
    			break;
  			case 50:
    			System.out.println("You get a public display of your donation on Moodle & the previous rewards.");
    			break;
  			case 100:
    			System.out.println("You get an Uni.lu USB Stick of 128GB & the previous rewards.");
    			break;
  			case 200:
    			System.out.println("You get an Uni.lu Smartphone cover & Keychain : I love Programming 1 & the previous rewards.");
    			break;
  			case 500:
    			System.out.println("You get an autograph of your professors & Five free lunches at the Food house & the previous rewards.");
    			break;
		}
		if ( Pledge != 10 || Pledge != 20 || Pledge != 50 || Pledge !=100 || Pledge != 200 || Pledge != 500) {
			System.out.println(Pledge +"€ donations are not allowed!");
		}

		scan.close();
	}
}