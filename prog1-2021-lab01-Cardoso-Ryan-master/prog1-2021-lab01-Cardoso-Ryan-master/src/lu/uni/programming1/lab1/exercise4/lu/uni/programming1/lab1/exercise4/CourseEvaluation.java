package lu.uni.programming1.lab1.exercise4;

import java.util.Scanner;
public class CourseEvaluation {

    public static void main(String args[]) 
    {
        double mt1, mt2, fe, average;
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Midterm 1 : ");
        mt1 = Math.max(0, Math.min(20, scan.nextDouble()));
        System.out.print("Enter Midterm 2 : ");
        mt2 = Math.max(0, Math.min(20, scan.nextDouble()));
        System.out.print("Enter Final Exam : ");
        fe = Math.max(0, Math.min(20, scan.nextDouble()));

        average = mt1*0.2 + mt2*0.2 + fe*0.6 ; 
        System.out.print("The average is: " +average);
        scan.close();
    }
}
