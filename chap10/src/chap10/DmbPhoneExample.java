package chap10;

public class DmbPhoneExample {
	public static void main(String[]args) {
		Dmbcallphone dmb=new Dmbcallphone("java phon","black",10);
	System.out.println("model"+dmb.model);
	System.out.println("color"+dmb.color);
	System.out.println("channel"+dmb.channel);
	
	dmb.poweron();
	dmb.bell();
	dmb.sendVoice("asd");
	dmb.receiVoice("sbc");
	dmb.hangUp();
	dmb.thrnoffmb();
	dmb.changeChannelDmb(12);
	
	}
}
