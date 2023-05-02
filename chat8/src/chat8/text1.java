package chat8;

import chat8.car.car2;

public class text1 {
public static void main(String[]args) {
	
	car mycar=new car();
	car.car2 mycar2=new car().new car2();
String a=	mycar.getColor();
String b=	mycar.getComprany();
String c=	mycar.getModel();
int d=	mycar.getMaxspeed();
System.out.println(a+""+b+""+c+""+d);
mycar2.play();

car1 mycar3=new car1(1);
	System.out.println("sad"+mycar3.color);
	car1 mycar4=new car1(1,5);
	System.out.println("sad"+mycar4.color);
	System.out.println("sad"+mycar4.color+""+mycar4.model);
	car1 mycar5=new car1(2,3,5);
	System.out.println("sad"+mycar5.color+mycar5.model+mycar5.maxspeed);
	
	
	car3 mycar6=new car3("chaoba");
	System.out.println(mycar6.color+mycar6.model+mycar6.maxspeed);
	
}
}
