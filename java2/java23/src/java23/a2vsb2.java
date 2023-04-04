package java23;

import java.util.Scanner;

public class a2vsb2 {

public static void main(String []args) {
	Scanner stdin=new Scanner(System.in);
	System.out.println("import score");
	int grade=stdin.nextInt();
	
	if(grade>=90) {
		System.out.println("A");
	}else if(grade>=80) {
		System.out.println("B");
	}else if(grade>=70) {
		System.out.println("c");
	}
	else if(grade>=60) {
		System.out.println("d");
	}
	else if(grade<60) {
		System.out.println("f");
	}
}

}
