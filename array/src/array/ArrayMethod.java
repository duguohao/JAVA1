package array;

import java.util.Arrays;

public class ArrayMethod {

	public ArrayMethod() {
		int[] int1= {8,1,7,3,5,45,56,0,5};
		System.out.println("1"+Arrays.toString(int1));
		
		
		Arrays.fill(int1, 4,5,33);
		System.out.println("2"+Arrays.toString(int1));
		
		Arrays.sort(int1);
		System.out.println("3"+Arrays.toString(int1));
	}
 public static void main(String[]args) {
	 new ArrayMethod();
 }
}
