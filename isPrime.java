
public class isPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPrime.checkPrime(1));
		System.out.println(isPrime.checkPrime(2));
		System.out.println(isPrime.checkPrime(3));
		System.out.println(isPrime.checkPrime(4));
		System.out.println(isPrime.checkPrime(19));
		System.out.println(isPrime.checkPrime(121));
		System.out.println(isPrime.checkPrime(37));
		System.out.println(isPrime.checkPrime(91));
	}
	
	public static boolean checkPrime(int num) {
		if(num <= 1) { 
			return false;
		}
		
		long sqrtLong = (long) Math.floor(Math.sqrt(num));
		
		for(long i = 2; i <= sqrtLong; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		
		return true;
	}
}
