package model;
public class Candle{
	//atributos
	private String color;
	private int size;
	private String essence;
	private int luminisenceGrade;
	//metodo constructor
public Candle(String color, int size, String essence, int luminisenceGrade){
	this.color=color;
	this.size=size;
	this.essence=essence;
	this.luminisenceGrade=luminisenceGrade;
}
	//getters and setters
	public String getColor(){
		return color;
	}
	public void setColor(String color){
		this.color=color;
	}	
	public int getSize(){
		return size;
	}
	public void setSize(int size){
		this.size=size;
	}
	public String getEssence(){
		return essence;
	}
	public void setEssence(String essence){
		this.essence=essence;
	}
	public int getLuminisenceGrade(){
		return luminisenceGrade;
	}
	public void setLuminisenceGrade(int luminisenceGrade){
		this.luminisenceGrade=luminisenceGrade;
	}
	//metodo analizador mostrar informacion de la vela
	public String showInfoCandle(){
		String infoCandle=("color candle"+color+"size candle"+size+"essence candle"+essence+"luminisence grade candle"+luminisenceGrade);
			return infoCandle;
	}		
			
}	