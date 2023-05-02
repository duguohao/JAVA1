package chat8;

public class car3{
	String comprany="Çö´ë";
	String model;
	String color;
	int maxspeed;
	
	
public car3() {
	
}
public car3(String model){
		this(model,"sda",250);
	}
public car3(String model,String color){
	this(model,color,250);
}
public car3(String model,String color,int maxspeed){
	this.model=model;
	this.color=color;
	this.maxspeed=maxspeed;
}

}
