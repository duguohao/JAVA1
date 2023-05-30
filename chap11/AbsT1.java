package chap11;

abstract class Shape1{
	abstract void draw();
	abstract void computerArea(double a,double b);
}
class Rectangle extends Shape1{
	void draw() {
		System.out.println("사각형");
	}
	void computerArea(double h,double v) {
		System.out.println(""+(h*v));
	}
}

class Triangle extends Shape1{
	void draw() {
		System.out.println("사각형");
	}
	void computerArea(double a,double h) {
		System.out.println(""+(a*h/2));
	}
}
public class AbsT1 {
	public static void main(String[]args) {
		Shape1 s=new Rectangle();
		s.draw();
		s.computerArea(5.0, 10.0);
		s=new Triangle();
		s.draw();
		s.computerArea(5.0, 10.0);
	}
}
