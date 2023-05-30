package chap11;
abstract class abs{
	
	public  abstract int add(int a,int b);
	public  abstract int sub(int a,int b);
	public  abstract double avg(int[]a);
}
class Goodcale extends abs {
	public int add(int a,int b) {
		return a+b;
	} 
	public int sub(int a,int b) {
		return a-b;
	}
	public double avg(int[]a) {
		double sum=0;
		for(int i=0;i<a.length;i++)
			sum+=a[i];
		return sum/a.length;
	}


}
	

public   class Test1 {
	public static void main(String[]args) {
		Goodcale g=new Goodcale();
		g.add(50, 50);
	
	}
}

