package model;
public class Angel{
	private String name;
	private String type;
	private String image;
	private Date celebrationDate;
	private String power;
	private Candle candle;

public Angel(String name, String type, String image, Date celebrationDate, String power){
	this.name=name;
	this.type=type;
	this.image=image;
	this.celebrationDate=celebrationDate;
	this.power=power;
}

	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getType(){
		return type;
	}
	public void setType(String type){
		this.type=type;
	}
	public String getImage(){
		return image;
	}
	public void setImage(String image){
		this.image=image;
	}
	public Date getCelebrationDate(){
		return celebrationDate;
	}
	public void setCelebrationDate(Date celebrationDate){
		this.celebrationDate=celebrationDate;
	}
	public String getPower(){
		return power;
	}
	public void setPower(String power){
		this.power=power;	
	}
	public Candle getCandle(){
		return candle;
	}
	public void setCandle(Candle candle){
		this.candle=candle;
	}	
	public void addCandle(String color, int size, String essence, int luminisenceGrade){
	candle=new Candle(color, size, essence, luminisenceGrade);
	
	}	
	public String showInfoAngel(){
	String infoAngel=("\nname arcangel: "+name+"\ntype arcangel: "+type+"\nimage arcangel: "+image+"\ncelebration date: "+celebrationDate+"\npower arcangel: "+power);
	candle.showInfoCandle();	
		return infoAngel;
	}
	public void deleteAngel(){
	name=null;
	type=null;
	image=null;
	celebrationDate=null;
	power=null;
	}
}	