package array;

public class CopyArrayTest {

	public CopyArrayTest() {
		int num1[]= {10,20,30};
		int num2[]= {40,50,60};
		num2=num1;
		num2[2]=200;
		System.out.println("1 v:");
		
		for(int i:num1)
			System.out.println(i+" ");
		
		System.out.println("2 v:");
		for(int i:num2)
			System.out.println(i+" ");
		int num3[]= {100,200,300};
		int num4[]= {400,500,600};
		
		for (int i=0;i<num3.length;i++) 
			num4[i]=num3[i];
			
			num4[2]=999;
			
			System.out.println("3 v:");
			for(int i:num3)
				System.out.println(i+" ");
			
			System.out.println("3 v:");
			for(int i:num3)
				System.out.println(i+" ");
			
		
	}

}
