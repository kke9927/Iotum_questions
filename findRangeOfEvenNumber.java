/*
2) Write a function that determines the number of even numbers that appear in a range of integers 0..n, where n is 
supplied as the sole argument to your function.

Example:

even_integers(3)

*/


package Question2;

public class findRangeOfEvenNumber {
	
	public static int even_integers(int n)
	{
		return n/2 + 1;
	}
	
	public static void main(String[] args) {
		
		System.out.println(even_integers(3));
		System.out.println(even_integers(5));
		System.out.println(even_integers(7));
		System.out.println(even_integers(9));
	}
}
