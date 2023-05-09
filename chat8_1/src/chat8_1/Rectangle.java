package chat8_1;

public class Rectangle {
	
	
	double areaRectangle(double width) {
		return width*width;
	}
	double areaRectangle(double width,double heigth) {
		return width*heigth;
	}
	public static void main(String[]agrs) {
		Rectangle r =new Rectangle();
	System.out.println(r.areaRectangle(20));
	System.out.println(r.areaRectangle(50,40));
	}
}
