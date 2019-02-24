import java.util.Arrays;

//This challenge requires you to alphabetically sort the characters in a string.

public class AlphabetSoup {

	public static void main(String[] args) {
		System.out.println(AlphabetSoup.sorted("1co80der24c22b!yte45"));
		System.out.println(AlphabetSoup.sorted("bdgthea"));
		System.out.println(AlphabetSoup.sorted("45626189"));
		System.out.println(AlphabetSoup.sorted("abcdefgh"));
	}
	
	public static String sorted(String str) {
		char[] chrArray = str.toCharArray();
		Arrays.sort(chrArray);
		
		return new String(chrArray);
	}
}
