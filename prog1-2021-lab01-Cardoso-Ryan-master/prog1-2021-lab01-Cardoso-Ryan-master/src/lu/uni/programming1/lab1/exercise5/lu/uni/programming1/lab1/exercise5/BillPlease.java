package lu.uni.programming1.lab1.exercise5;

import java.util.Scanner;
public class BillPlease {

    public static void main(String[] args) {
        
        double tpwvat, vat, tpivat;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter price : ");
        tpwvat = scan.nextDouble();
        System.out.print("Enter the VAT of the article : ");
        vat = scan.nextDouble();
        tpivat = ((vat/100)*tpwvat) ;
        System.out.print("The total price including VAT is : "+(tpivat+tpwvat));
        scan.close();


    }


}
