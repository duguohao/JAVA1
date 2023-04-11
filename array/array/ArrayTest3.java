package array;

import java.util.Scanner;

public class ArrayTest3 {

	public ArrayTest3() {
		int inum[]= {8,7,3,6,8,7,0,4,1,2};
		Scanner stdin=new Scanner(System.in);
		System.out.println("input num:");
		int key=stdin.nextInt();
		int cnt=0;
		
		for(int i=0;i<inum.length;i++) {
			if(key==inum[i]) {
				cnt++;
				System.out.println((i+1)+"match");
			}
			
		}
		if(cnt==0) {
			System.out.println(key+"not match");
		}else 
			
				System.out.println(key+"is" +cnt);
			
		
	}
	


}
