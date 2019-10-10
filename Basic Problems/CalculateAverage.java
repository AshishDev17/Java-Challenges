import java.util.Arrays;

class AverageMethods{
  public static double findAverageUsingStream(int[] array){
    return Arrays.stream(array).average().orElse(0);
  }
  
  public static double findAverageWithoutUsingStream(int[] array) {
	  double avg;
	  int sum = 0;
	  
	  for(int i : array)
		  sum += i;
	  
	  avg = (double) sum/array.length;
	  return avg;
  }
}

public class CalculateAverage{
	public static void main(String args[]){
		System.out.println(AverageMethods.findAverageUsingStream(new int[]{2, 2, 5, 6}));
		System.out.println(AverageMethods.findAverageWithoutUsingStream(new int[]{2, 3, 5, 8}));
	}
}