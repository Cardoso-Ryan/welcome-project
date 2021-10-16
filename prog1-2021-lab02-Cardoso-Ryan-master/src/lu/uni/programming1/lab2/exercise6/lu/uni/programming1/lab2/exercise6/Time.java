package lu.uni.programming1.lab2.exercise6;

import java.util.Scanner;

/**
 * Class for Exercise 6
 */
public class Time {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int format, hours, minutes, seconds;

		System.out.print("What format 12hr or 24hr? [12,24]: ");
    	format = scan.nextInt();
    	System.out.print("Enter the hours: ");
    	hours = scan.nextInt();
    	System.out.print("Enter the minutes: ");
    	minutes = scan.nextInt();
    	System.out.print("Enter the seconds: ");
    	seconds = scan.nextInt();

		seconds = 5 + seconds;

		// Format 24h
		if (format == 24)
		{
			if (seconds > 59){
				minutes += 1;
				seconds = seconds - 60;
				if (minutes > 59){
					minutes = 0;
					hours += 1;
					if (hours > 23){
						hours = 0;
					}
				}
			}
			if (hours < 10 && minutes < 10 && seconds < 10){
				System.out.print("0" + hours + ":0" + minutes + ":0" + seconds);
			}
			else if (hours < 10 && minutes < 10){
				System.out.print("0" + hours + ":0" + minutes + ":" + seconds);
			}
			else if (hours < 10){
				System.out.print("0" + hours + ":" + minutes + ":" + seconds);
			}
			else System.out.print(hours + ":" + minutes + ":" + seconds);
		}
		// Format 12h
		if (format == 12)
		{
			if (seconds > 59){
				minutes += 1;
				seconds = seconds - 60;
				if (minutes > 59){
					minutes = 0;
					hours += 1;
					if (hours > 11){
						hours = 0;
					}
				}
			}
			if (hours < 10 && minutes < 10 && seconds < 10){
				System.out.print("0" + hours + ":0" + minutes + ":0" + seconds);
			}
			else if (hours < 10 && minutes < 10){
				System.out.print("0" + hours + ":0" + minutes + ":" + seconds);
			}
			else if (hours < 10){
				System.out.print("0" + hours + ":" + minutes + ":" + seconds);
			}
			else System.out.print(hours + ":" + minutes + ":" + seconds);
		}

		scan.close();
	}
}