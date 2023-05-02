package chat8;

public class car {
	
	
	
	public String getComprany() {
		return comprany;
	}


	public void setComprany(String comprany) {
		this.comprany = comprany;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getColor() {
		return color;
	}


	public void setColodr(String color) {
		this.color = color;
	}


	public int getMaxspeed() {
		return maxspeed;
	}


	public void setMaxspeed(int maxspeed) {
		this.maxspeed = maxspeed;
	}


	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}


	class car2 extends car{
		public void play() {
			System.out.println(comprany+""+model+"n"+color+"n"+maxspeed);
		}
	}
	private String comprany="현대";
	private	String model="그";
	private	String color="검정";
	private	int maxspeed=350;
	private	int speed;
	
	
	
	
}
