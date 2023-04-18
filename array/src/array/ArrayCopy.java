package array;

import java.util.Arrays;

public class ArrayCopy {

	public ArrayCopy() {
		int num1[]= {10,20,30};
		int num2[]= {40,50,60};
		String str3[]= {"java","array","copy"};
		String str4[]=new String[10];
		
		for(int i:num1)
			System.out.println(i+" ");
		
		System.arraycopy(str3, 0, str4, 0, 3);
		
		
		for(String value:str4)
			System.out.print(value+" ");
		
		System.out.print("\n"+"str5:");
		String str5[]=Arrays.copyOf(str3, 2);
		for(String value:str5)
			System.out.print('\n'+value);
		
		System.out.print("\n"+"str6:");
		String str6[]=Arrays.copyOf(str3, 4);
		for(String value:str6)
			System.out.print('\n'+value);
	}
	public static void main(String[]args) {
		new ArrayCopy();
	}

}
