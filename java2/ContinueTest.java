import java.util.Scanner;

public class ContinueTest {

	public ContinueTest() {
		
		Scanner stdin=new Scanner(System.in);
		
		System.out.println("请输入");
		int num=stdin.nextInt();
		int i=0;
		int sum=0;
		
		while (i<=100) {
			i++;
			if(i%num!=0) 
				continue;
				
			sum+=i;	
			
			
		}
		System.out.println(sum);
		
	}

	public static void main(String[] args) {
		new ContinueTest();

	}

}
