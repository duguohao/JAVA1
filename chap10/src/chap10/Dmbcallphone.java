package chap10;

public class Dmbcallphone  extends callphone{
	int channel;
		String model;
		String color;
	
		Dmbcallphone(String model,String color,int channel){
		this.model=model;
		this.color=color;
		this.channel=channel;
	}
	
	void turnOnDmb() {
		System.out.println(channel);
	}
	
	void changeChannelDmb(int channel) {
		this.channel=channel;
		System.out.println(channel);
	}
	void thrnoffmb() {
		System.out.println("Dmv and of br");
	}
}
