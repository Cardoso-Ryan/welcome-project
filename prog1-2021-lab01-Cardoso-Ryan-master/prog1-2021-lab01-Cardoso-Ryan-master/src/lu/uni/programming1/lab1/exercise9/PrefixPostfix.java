public class PrefixPostfix {
	
	public static void main(String[] args) {
		int i = 0, j, k;

		i++;
		System.out.println("i = " + i); //1
		++i;
		System.out.println("i = " + i); //2
		System.out.println("i = " + ++i); //3
		System.out.println("i = " + i++); //3
		System.out.println("i = " + i); //4

		j = i++; System.out.println("i = " + i + ", j = " + j); // i=5, j=4
		j = ++i; System.out.println("i = " + i + ", j = " + j); // i=6, j=6

		k = i++ + ++j;
		System.out.println("i = " + i++ + ", j = " + ++j + ", k = " + k++); // i=7, j=8, k=13
		k = ++i + j++;
		System.out.println("i = " + i + ", j = " + j + ", k = " + k); // i=9, j=9, k=17
	}
}	