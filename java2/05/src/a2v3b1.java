
public class a2v3b1 {

	public  a2v3b1(){
		int sum=0,cnt=1;
		while(cnt<=10) {
			sum+=cnt;
			cnt+=1;
			
		}
		System.out.println("while:"+sum); 
		
		
		
		int a=0;
		for( int i=1;i<=10;i++) {
			
			a+=i;
			System.out.println("for:"+a); 
			
		}
		
		int ac=0,av=1;
		do {
			ac+=av;
			av+=1;
			
		}while(av<=10);
		System.out.println("do while:"+ac); 
	}
	

	public static void main(String[]args) {
		new a2v3b1();
	
	

	
}}
