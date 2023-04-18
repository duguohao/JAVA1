package array;

public class ArrayRef {

	public ArrayRef() {
	/*	String []str= new String[3];
		str[0]="java";
		str[1]="java";
		str[2]=new String("java");
		System.out.println(str[0]==str[1]);
		System.out.println(str[0]==str[2]);
		System.out.println(str[0].equals(str[2]));
	}
	public static void main(String []args) {
		new ArrayRef();
	}
*/
		
		
	String strv1="java"	;
	String strv2="java"	;
	if(strv1==strv2) {
		System.out.println("sb");
	}else {
		System.out.println("2b");
	}
	
	if(strv1.equals(strv2)) {
		System.out.println("3b");
	}
	
	System.out.println("\n");
	
	String strv3=new String("abcd");
	String strv4=new String("abcd");
	if(strv3==strv4) {
		System.out.println("strv3/4:"+"sb");
	}else {
		System.out.println("strv3/4:"+"2b");
	}
	
	
	if(strv3.equals(strv4)) {
		System.out.println("3b");
	}
		
		
			
	}
	public static void main(String[]args) {
		new ArrayRef();
	}
}
