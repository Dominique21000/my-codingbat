package codingbat.warmup_1;

public class Diff21 {

	/**
	 * Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(diff21(19)); // → 2
		System.out.println(diff21(10)); // → 11
		System.out.println(diff21(21)); // → 0	

	}
	
	public static int diff21(int n) {
	  int diff = Math.abs(21-n);
	  if (n > 21)
	    diff = diff *2;
	  return diff;
	}
}