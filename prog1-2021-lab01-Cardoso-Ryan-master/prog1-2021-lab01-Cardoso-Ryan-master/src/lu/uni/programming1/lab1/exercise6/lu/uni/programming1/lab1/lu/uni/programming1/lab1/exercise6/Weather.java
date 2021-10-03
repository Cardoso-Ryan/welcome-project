import java.util.Scanner;

public class Weather {

    public static void main(String[] args) {
        
    double Tf, Tc;
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter temperature in Celsius : ");
    Tc = scan.nextDouble();
    Tf = (Tc*9/5)+32;
    System.out.print("The temperature in Fahrenheit is : "+Tf);
    scan.close();

        
    }

}
