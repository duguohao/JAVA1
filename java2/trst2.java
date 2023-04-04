import java.util.Scanner;

public class trst2 {

	public trst2() {
		// TODO Auto-generated constructor stub
		Scanner stdin=new Scanner(System.in);
		
		System.out.println("请输入");
		int cla=stdin.nextInt();
		int cla2=stdin.nextInt();
		
		
		int temp=0;
		int sum=0;
		if(cla>cla2){
			temp=cla;
			cla=cla2;
			cla2=temp;
		}
		while(cla<=cla2) {
			if(cla2%2==1) {
			sum+=cla;
			cla= cla+1;
			System.out.println(sum);
			}
			
		}
	
		
	}
	public static void main(String[]args) {
		new trst2();
	}

}
