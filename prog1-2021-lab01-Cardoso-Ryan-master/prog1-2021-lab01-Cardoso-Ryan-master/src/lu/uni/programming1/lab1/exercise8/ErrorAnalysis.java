public class ErrorAnalysis {
	public static void main(String[] args) {
		// 1.syntax
		int a, d;
		a = 200;
	   
		// 2.Syntax
		System.out.println((a+2)-3);

		// 3.Sematic
		double e = 0.1;

		// 4.Sematic
		d = (int) (e + 1);
		System.out.print("The answer for d is: " +d);
	}
}		