package duixiang;

public class fm {

	int add,jian,cheng;
	 
		private String name ="sb";
		private	int age=20;
		private	int tel=50156;
		
		public void Setname() {
			this.name=name;
		}
		public String Getname() {
			return name;
		}
		
		public void Setage() {
			this.age=age;
		}
		public int Getage() {
			return age;
		}
		public void Settel() {
			this.tel=tel;
		}
		public int Gettel() {
			return tel;
		}
		
	
	
	
	public String cheng(int x,int y) {
		cheng=x*y;
		return "sad"+cheng;
		
	}
class dog extends fm{
		public void wan(){
			System.out.println(name+""+age+""+tel);
		}
		
	}

class asd{
	
	public String plus(int x,int y) {
		add=x+y;
		return "sad"+add;
		
	}
	
}
class jianq{
	
	public String plus(int x,int y) {
		jian=x-y;
		return "sad"+jian;
		
	}
	
}
public static void main(String[]args) {
	fm f=new fm();
	fm.dog d2 = new fm().new dog();
	fm.asd s = new fm().new asd();
	fm.jianq j=new fm().new jianq();
	String d=f.cheng(3,5);
	String c=s.plus(50, 60);
	String b=j.plus(50, 60);
	System.out.println(d);
	System.out.println(c);
	System.out.println(b);
	System.out.println(d2.Getname());
	d2.wan();
	System.out.println(f);
	System.out.println(d2);
	System.out.println(s);
	
}
	
	}

