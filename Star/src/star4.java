import java.util.Scanner;

public class star4 {

	public star4() {
		Scanner stdin=new Scanner(System.in);
		System.out.println("import score");
		int n=stdin.nextInt();
		 
	        for(int i=0;i<n;i++){

	            for(int k=n-1;k>i;k--){

	                System.out.print(" ");

	            }

	            for(int j=0;j<=i;j++){

	                System.out.print("*");

	            }

	            System.out.println();

	        }
	

	}
	public static void main(String[]args) {
		new star4();
	}

}
