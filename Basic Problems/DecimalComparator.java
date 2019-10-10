public class DecimalComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175));
		System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176));
		System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0));
	}
	
	public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {		
	     String str1 = "" + num1;
	     String str2 = "" + num2;
	     
	     System.out.println("str1 = " + str1);
	     System.out.println("str2 = " + str2);
	     
		 String [] arr1 = str1.split("\\.");
		 String [] arr2 = str2.split("\\.");
		 
	     System.out.println("[] arr1 = " + arr1);
	     System.out.println("[] arr2 = " + arr2);
	     
	     if(DecimalComparator.checkBeforeDecimal(arr1[0], arr2[0]) && DecimalComparator.checkAfterDecimal(arr1[1], arr2[1])) {
	    	 return true;
	     }
	     
	     return false;	     
	 }
	
	public static boolean checkBeforeDecimal(String str1, String str2) {
		int length = str1.length() <= str2.length() ? str1.length() : str2.length();
		
		for(int i = 0; i < length; i++) {
			if(str1.charAt(i) != str2.charAt(i)) {
				return false;
			}
		}
		
		return true;
	}
	
	public static boolean checkAfterDecimal(String str1, String str2) {
		int length = 3;
		
		if(str1.length() < 3) {
			length = str1.length();
		}
		
		if(str2.length() < length) {
			length = str2.length();
		}
		
		for(int i = 0; i < length; i++) {
			if(str1.charAt(i) != str2.charAt(i)) {
				return false;
			}
		}
		
		return true;
	}

}
