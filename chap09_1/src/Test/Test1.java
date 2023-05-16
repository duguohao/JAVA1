package Test;

public class Test1 {
	

	
	
	class add{
		private int a;
		private int b;
		public void setA(int a,int b) {
			this.a=a;
			this.b=b;
		}
		public int getA(){
			return a+b;
		}
		
	}
	class sub{
		private int a;
		private int b;
		public void setA(int a,int b) {
			this.a=a;
			this.b=b;
		}
		public int getA(){
			return a-b;
		}
		
	}
	class mul{
		private int a;
		private int b;
		public void setA(int a,int b) {
			this.a=a;
			this.b=b;
		}
		public int getA(){
			return a;
		}
		
	}
	class div{
		private int a;
		private int b;
		public void setA(int a,int b) {
			this.a=a;
			this.b=b;
		}
		public int getA(){
			return a;
		}
		
	}
	
	
	public static void main(String[]args) {
		Test1.sub c=NEW Test1.sub new sub();
		c.getA();
		
		
	}
}
