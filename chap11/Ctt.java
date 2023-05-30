package chap11;

	class Parent{
		public void method1() {
			System.out.println("method1");
		}
		
		public void method2() {
			System.out.println("method2");
		}
		
	}
	class Child extends Parent{
		public void method2() {
			System.out.println("method2");
		}
		
		public void method3() {
			System.out.println("method3");
		}
	}
public class Ctt {
	public static void main(String[]args) {
		Child child =new Child();
		Parent parent=child;
		parent.method1();
		parent.method2();
		System.out.println(parent);
		System.out.println(child);
	}

}
