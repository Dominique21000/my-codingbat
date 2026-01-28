package codingbat.warmup_2;

public class StringBits {

	/**
	 * Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(stringBits("Hello")); // → "Hlo"
		System.out.println(stringBits("Hi")); // → "H"
		System.out.println(stringBits("Heeololeo"));// → "Hello");

	}
	
	public static String stringBits(String str) {
		  StringBuilder sb = new StringBuilder();
		  for (int i=0;i< str.length(); i++)
		  {
		    if (i%2==0)
		    {
		      sb.append(str.charAt(i));
		    }
		  }
		  return sb.toString();
		}
}