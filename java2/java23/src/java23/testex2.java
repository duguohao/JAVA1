package java23;

import java.util.Scanner;

public class testex2 {

 public static void main(String[]args) {
	 
		Scanner stdin=new Scanner(System.in);
		System.out.println("import score");
		int grade=stdin.nextInt();
		
		if(grade>0) {
			System.out.println("zheng");
		}
		else if(grade==0) {
			System.out.println("0");
		}
		else if(grade <0) {
			System.out.println("-");
		}
 }
}
