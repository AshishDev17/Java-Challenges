enum Type { 
    lc,
    up;
} 

enum Change {
	encrypt,
	decrypt;
}

public class CaesarsCipher {
	public static void main(String[] args) {
		//CaesarsCipher.printChar("char");
		System.out.println(CaesarsCipher.changeLetters("char", 1, Type.lc, Change.encrypt));
		System.out.println(CaesarsCipher.changeLetters("CHAR", 1, Type.up, Change.encrypt));
		System.out.println(CaesarsCipher.changeLetters("dibs", 1, Type.lc, Change.decrypt));
		System.out.println(CaesarsCipher.changeLetters("DIBS", 1, Type.up, Change.decrypt));
	}
	
	public static StringBuffer changeLetters(String str, int shift, Type type, Change change) {
		int length = str.length();
		StringBuffer newStr = new StringBuffer();
		int unicodeOfA = 0;
		
		if(type == Type.lc) {
			unicodeOfA = "a".codePointAt(0);
		} else if(type == Type.up) {
			unicodeOfA = "A".codePointAt(0);
		}
		
		for(int i = 0; i < length; i++) {
			int unicodeOfI = str.codePointAt(i);
			if(change == Change.encrypt) {
				unicodeOfI = unicodeOfA + ((unicodeOfI - unicodeOfA + shift) % 26);
			} else if(change == Change.decrypt) {
				unicodeOfI = unicodeOfA + ((unicodeOfI - unicodeOfA + (26 - shift)) % 26);
			}
			
			newStr.append((char)unicodeOfI);
		}
		
		return newStr;		
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
