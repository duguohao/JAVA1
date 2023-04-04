/*
 * 输入这两个
 * */

package java23;
import java.util.*;
public class testex1 {

	public static void main(String[]args) {
		
			Scanner stdin=new Scanner(System.in);
			Scanner stdin2=new Scanner(System.in);
			System.out.println("请输入年龄和职级");
			int cla=stdin.nextInt();
			int age=stdin2.nextInt();
			
			if(cla ==7 && cla==8 ||age>=40) {
				System.out.println("您的年龄是"+age+"您的职级是"+cla+"您的奖金是80%");
			}else if(cla ==5 && cla==6 ||age>=50) {
				System.out.println("您的年龄是"+age+"您的职级是"+cla+"您的奖金是100%");
			}else {
				System.out.println("대상자 아님");
			}
		
	}
	

}
