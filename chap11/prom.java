package chap11;



class a{}
class b extends a{}
class c extends a{}
class d extends b{}
class e extends c{}
public class prom {
	public static void main(String[]args) {
	b b=new b();
	c c=new c();
	d d=new d();
	e e=new e();
	a a1=b;
	a a2=c;
	a a3=d;
	a a4=e;
	
	b b1=d;
	c c1=e;
	System.out.println(c1);
	System.out.println(b1);
	
	}
	
}
