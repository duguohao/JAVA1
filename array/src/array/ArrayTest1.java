package array;

import java.util.Scanner;

public class ArrayTest1 {
	
	

	public ArrayTest1() {
		Scanner stdin=new Scanner(System.in);
		int i;
		double sum=0.0,avg;
		double drum[]=new double[5];
		System.out.println("±æÀÌ"+drum.length);
		System.out.println("drum°ª"+drum);
		
		for(i=0;i<drum.length;i++)
			System.out.println(drum[i]);
		System.out.println();
		
		
		for(i=0;i<drum.length;i++) {
			System.out.println("drum["+i+"]");
			drum[i]=stdin.nextDouble();
		}
		
		for(i=0;i<drum.length;i++) {
			sum=sum+drum[i];
			System.out.println("sum"+sum);
			
			avg=sum/drum.length;
			System.out.println("avg"+avg);
			
			
		}
	}
}

	
	
	
	
	

	
	
	
	
	






