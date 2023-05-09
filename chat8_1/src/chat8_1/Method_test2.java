package chat8_1;

public class Method_test2 {
public static void main(String[]args) {
	car car=new car();
	Calculator calculator= new Calculator();
	Claculation claculation=new Claculation();
	
	claculation.println("asdas");
	claculation.execute();
	System.out.println("\n");
	
	
	
	calculator.powerOn();
	int result1 =calculator.plus(5, 6);
	System.out.println(result1);
	
	byte x=10,y=4;
	double result2 =calculator.divide(x, y);
	System.out.println(result2);
	calculator.powerOff();
	
	int[] values= {1,2,3};
	int result3 =calculator.sum1(values);
	System.out.println(result3);
	

	int result4 =calculator.sum2(new int[] {1,2,3,4,5,6});
	System.out.println("result4"+"\t"+result4);
	
	
	
	int result5 =calculator.sum2(new int[] {1,2,3});
	System.out.println("result5"+"\t"+result5);
	
	car.setGas(5);
	car.run();
	car.kto();
	if(car.isLeftGas()) {
		System.out.println("2");
	}else {
		System.out.println("3");
	}
	car.run2();
}




}
