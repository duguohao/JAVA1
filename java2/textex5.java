import java.util.Scanner;

/*
 * 输入俩数   求两个数的所有奇数和.
 * #문제분석
 * 变量 first，second,total
 * 
 * #算法
 * 1.정수 입력(first,second)
 * 2.if(第一个小于第二个)
 * 3.反复 for(first,second,first++)
 * total+=first
 * */
public class textex5 {

	public textex5() {
		Scanner stdin=new Scanner(System.in);
		
		
		
		int i=stdin.nextInt();
		
		int j=stdin.nextInt();
		
		int temp,total=0;
		if(i>j){
			temp=i;
			i=j;
			j=temp;
		}	
			while(i<=j) {
				total+=i;
				i=i+1;
				System.out.println(total);
			}
			
			
				
			}
			
		
			
		
		
		
		
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new textex5();
	}

}
