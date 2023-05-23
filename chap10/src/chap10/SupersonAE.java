package chap10;

public class SupersonAE {
	public static void main(String[]agrs) {
	SupersonA s=new SupersonA();
	s.fly();
	s.flymode=SupersonA.SUPERSONT;
	s.fly();
	s.flymode=SupersonA.NONAL;
	s.taleoff();
	s.land();
	}
}
