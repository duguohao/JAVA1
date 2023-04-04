package java23;

import java.util.*;

public class a2vbs3 {

	public static void  main(String []args) {
		Scanner stdin=new Scanner(System.in);
		System.out.println("import score");
		int grade=stdin.nextInt();
	
		switch(grade/10){
		case 10:
			
			
		case 9:
			if(grade>=80) {
				System.out.print("a");
				break;
				}
		case 8:
			if(grade>=70) {
				System.out.print("b");
				break;
				}
		case 7:
			if(grade>=60) {
				System.out.print("c");
				break;
				}
		case 6:
			if(grade>=60) {
				System.out.print("d");
				break;
				}
		default:
			
				System.out.print("f");
				break;
				
			
		}
		
		
			
		
	}

	private static void swich(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
