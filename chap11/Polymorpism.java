package chap11;

class Shape{
	public Shape next;
	public Shape() {
		next=null;
	}
	public void draw() {
		System.out.println("Shape");
}
}
	class Line extends Shape{
		public void draw() {
			System.out.println("Line");
		}
		}
	class Rect extends Shape{
		public void draw() {
			System.out.println("Rect");
		}
	}
	class Circle extends Shape{
		public void draw() {
			System.out.println("Circle");
		}
	}
	

public class Polymorpism {
	static void paint(Shape p) {
		p.draw();
	}
	public static void main(String[]args) {
		Line line =new Line();
		paint(line);
		paint(new Shape()); 
		paint(new Rect());
		paint(new Circle());
		
	}

}
