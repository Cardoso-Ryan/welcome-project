package lu.uni.programming1.lab2.exercise2;

/**
 *  Class for Exercise 2.1
 */
public class ByteOverflow {

	public static void main(String[] args) {
		
		byte b = 127;
    	++b;
    	System.out.println(b);

		byte a = -128;
		--a;
		System.out.print(a);
		/* By adding 1 the system shows -128 and not 128 and if we sustract 1 from -128 we get 127 */
}}