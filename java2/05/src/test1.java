import java.util.Scanner;

public class test1 {

	public test1() {
	
			Scanner stdin=new Scanner(System.in);
			
			System.out.println("请输入");
			int cla=stdin.nextInt();
			int b=0;
			
			for(b=0;b<=1000;b++) {
				if(b%cla==0) {
						  
					System.out.println(b);
				}
			}
			
		}
		
	

public static void main(String [] args) {
	
	new test1();
}
	
}
