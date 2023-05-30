package chap11;

class  Rt{
	public int width;
	public int height;
	
	public Rt(int w,int h ) {
		width=w;
		height=h;
	}

	public int compter() {
		// TODO Auto-generated method stub
		return width*height;
	}

	
}
class Cube4 extends Rt{
	public int depth;
	public Cube4(int w,int h,int d) {
		super(w,h);
		depth=d;
		
	}
	public int comp() {
		return super.compter()*depth;
	}
}
public class CastTest2 {
	public static void main(String[]args) {
	Rt r=new Cube4(10,20,30);
	System.out.println("r r"+(r instanceof Rt));
	System.out.println("r c"+(r instanceof Cube4));
	System.out.println("r o"+(r instanceof Object));
	System.out.println(r.compter());
	
	
	Cube4 c=(Cube4) r;
	System.out.println(c.comp());
	System.out.println(c.compter());
	
	}
	
}
