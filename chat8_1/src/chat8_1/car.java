package chat8_1;

class Calculator {
	 void powerOn() {
		 System.out.println("power On");
	 }
	 int plus(int x,int y) {
		 int result= x+y;
		 return result;
	 }
	 double divide(int x,int y) {
		 double result= (double)x/(double)y;
		 return result;
	 }
	 void powerOff() {
		 System.out.println("power Off");
	 }
	 int sum1(int[] values) {
		 int sum=0;
		 for(int i=0;i<values.length;i++) {
			 sum+=values[i];
		 }
		 return sum;
	 }
	 
	 int sum2(int[] values) {
		 int sum=0;
		 for(int i=0;i<values.length;i++) {
			 sum+=values[i];
		 }
		 return sum;
	 }
	
}



public class car {
int gas;
int speed;

void setGas(int gas) {
	this.gas=gas;
}
boolean isLeftGas() {
	if(gas == 0) {
		System.out.println("no gas");
		return false;
	}
	System.out.println(" gas");
	return true;
	
}

void run(){
	
while(true) {
	if(gas>0) {
		System.out.println(gas);
		gas-=1;
	}else {
		System.out.println(gas);
		return;
	}
}	
	
}
int getSpeet() {
	return speed;
}
void kto() {
	System.out.println("54511ada");
}
void run2() {
	for(int i=10;i<=50;i+=10) {
		speed=i;
		System.out.println(speed);
	}
}

public static void main(String[]args) {
	
car car=   new car();
car.run();
car.run2();
}

}
