package array;

import java.util.Random;

public class MultArrayTest {

	public MultArrayTest() {
		Random ran=new Random();
		int[][] score=new int[4][4];
		for(int i=0;i<4;i++) 
			for(int j=0;j<4;j++) 
				score[i][j]=ran.nextInt(10);
				
			
		for(int k=0;k<4;k++) {
			int sum=0;
			for(int value:score[k]) {
				System.out.print(value+" ");
				sum+=value;
				
			}
			System.out.println("sum is"+sum);
		}	
		}
		
	}


