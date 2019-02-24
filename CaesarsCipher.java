
public class CaesarsCipher {
	public static void main(String[] args) {
		//CaesarsCipher.printChar("char");
		System.out.println(CaesarsCipher.rotLowerCase("char", 1));
		System.out.println(CaesarsCipher.rotUpperCase("CHAR", 1));
	}
	
	//all letters in the string are lower case
	public static String rotLowerCase(String str, int shift) {
		int length = str.length();
		StringBuilder newStr = new StringBuilder();
		int unicodeOfA = "a".codePointAt(0);
		
		for(int i = 0; i < length; i++) {
			int unicodeOfI = str.codePointAt(i);
			
			unicodeOfI = unicodeOfA + ((unicodeOfI - unicodeOfA + shift) % 26);
			newStr.append((char)unicodeOfI);
		}
		
		return newStr.toString();		
	}
	
	public static String rotUpperCase(String str, int shift) {
		return CaesarsCipher.rotLowerCase(str.toLowerCase(), shift).toUpperCase();
	}
	
//	public static void printChar(String str) {
//		char[] charArr = str.toCharArray();
//		
//		for(char c : charArr) {
//			System.out.println(c);
//		}
//	}
	
//	public static void printChar(String str) {
//		int length = str.length();
//		
//		for(int i = 0; i < length; i++) {
//			System.out.println((char)str.codePointAt(i));
//		}
//	}
}
