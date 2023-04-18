package array;

import java.util.Scanner;

public class ArrayTest2 {

	public ArrayTest2() {
		int score[]= {515,452,545,51,15,132};
		int max=score[0];
		for(int i:score) {
			if(i>max) 
				max=i;
			
			
		}
		System.out.println("max v"+max);
	}

}