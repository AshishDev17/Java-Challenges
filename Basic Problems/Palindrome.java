
public class Palindrome {

	public static void main(String[] args) {
		System.out.println(Palindrome.checkPalindrome("malayalam"));
		System.out.println(Palindrome.checkPalindrome("abcdbca"));
		System.out.println(Palindrome.checkPalindrome("abcdcba"));
		System.out.println(Palindrome.checkPalindrome("ABCDCBA"));
		System.out.println(Palindrome.checkPalindrome("ABCDcba"));
	}
	
	public static boolean checkPalindrome(String str) {
		int length = str.length() - 1;
		String lowerCaseStr = str.toLowerCase();
		for(int i = 0; i <= length; i++) {
			if(lowerCaseStr.charAt(i) != lowerCaseStr.charAt(length - i)) {
				return false;
			}		
		}
		
		return true;
	}
}
