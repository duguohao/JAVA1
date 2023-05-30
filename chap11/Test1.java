package chap11;
abstract class abs{
	
	abstract void abs(int a,int b);
	
	
}
class add extends abs {
	void abs(int a,int b) {
		System.out.println(a+b);
	}
}
class sub extends abs {
	void abs(int a,int b) {
		System.out.println(a-b);
	}
}
class mul extends abs{
	void abs(int a,int b) {
		System.out.println(a*b);
	}
	
}
class div extends abs{
	void abs(int a,int b) {
		System.out.println(a/b);
	}
	
}
public   class Test1 {
	public static void main(String[]args) {
		abs s=new add();
		s.abs(50, 50);
		s=new sub();
		s.abs(50, 50);
		s=new mul();
		s.abs(50, 50);
		s=new div();
		s.abs(50, 50);
		
	}

}
