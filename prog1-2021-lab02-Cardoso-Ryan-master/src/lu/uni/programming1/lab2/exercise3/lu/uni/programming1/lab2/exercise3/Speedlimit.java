package lu.uni.programming1.lab2.exercise3;

import java.util.Scanner;

/**
 *  Class for Exercises 3.1 and 3.2
 */
public class Speedlimit {

	public static void main(String[] args) {
		// Ex3.1 - Put your speedlimit checking code here
		//         	Hint: We use a "Scanner" as seen in
		//			Exercise3 of Lab01 "Reading User Input"
		// 	        to read from standard input
		double roadTypeId, driverSpeed;
		double per;

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter road type id: ");
        roadTypeId = scan.nextDouble();

        System.out.print("Please enter your traveling speed: ");
        driverSpeed = Math.max(0, scan.nextDouble());

		// Speed limit 130 km/h
        if (roadTypeId == 1) {
			// Driver's speed
			if (driverSpeed > 130) {
                System.out.println("Too fast for motorway road. " + (driverSpeed - 130) + " km/h over the limit.");
            } else if (driverSpeed <= 130) {
                System.out.println("Speed is OK for motorway road.");
            }
			// Fine amount
			per = (driverSpeed - 130) / 130 * 100;
			if (per <=5) {
				System.out.println("There is no fine distribuated.");
			} else if (per > 5 && per <= 30) {
				System.out.println("The fine amount is 50 €");
			} else if (per > 30 && per <= 50) {
				System.out.println("The fine amount is 150 €");
			} else if (per > 50) {
				System.out.println("The fine amount is 500 €");
			}
            
        }
		// Speed limit 90 km/h
        else if (roadTypeId == 2) {
			// Driver's speed
			if (driverSpeed > 90) {
                System.out.println("Too fast for ordinary road. " + (driverSpeed - 90) + " km/h over the limit.");
            } else if (driverSpeed <= 90) {
                System.out.println("Speed is OK for ordinray road.");
            }
			// Fine amount
			per = (driverSpeed - 90) / 90 * 100;
			if (per <=5) {
				System.out.println("There is no fine distribuated.");
			} else if (per > 5 && per <= 30) {
				System.out.println("The fine amount is 50 €");
			} else if (per > 30 && per <= 50) {
				System.out.println("The fine amount is 150 €");
			} else if (per > 50) {
				System.out.println("The fine amount is 500 €");
			}

        }
		// Speed limit 50 km/h
        else if (roadTypeId == 3) {
			// Driver's speed
			if (driverSpeed > 50) {
                System.out.println("Too fast for town road. " + (driverSpeed - 50) + " km/h over the limit.");
            } else if (driverSpeed <= 50) {
                System.out.println("Speed is OK for town road.");
            }
			// Fine amount
			per = (driverSpeed - 50) / 50 * 100;
			if (per <=5) {
				System.out.println("There is no fine distribuated.");
			} else if (per > 5 && per <= 30) {
				System.out.println("The fine amount is 50 €");
			} else if (per > 30 && per <= 50) {
				System.out.println("The fine amount is 150 €");
			} else if (per > 50) {
				System.out.println("The fine amount is 500 €");
			}

        }
		// Speed limit 30 km/h
        else if (roadTypeId == 4) {
			// Driver's speed
			if (driverSpeed > 30) {
                System.out.println("Too fast for calm road. " + (driverSpeed - 30) + " km/h over the limit.");
            } else if (driverSpeed <= 30) {
                System.out.println("Speed is OK for calm road.");
            }
			// Fine amount
			per = (driverSpeed - 30) / 30 * 100;
			if (per <=5) {
				System.out.println("There is no fine distribuated.");
			} else if (per > 5 && per <= 30) {
				System.out.println("The fine amount is 50 €");
			} else if (per > 30 && per <= 50) {
				System.out.println("The fine amount is 150 €");
			} else if (per > 50) {
				System.out.println("The fine amount is 500 €");
			}
        } 
		// If road ID doesn't exist
        else {
            System.out.println("Unknown road type: " + roadTypeId);
        }
        
        scan.close();
    }
}