package model;
public class Candle{
	//atributos
	private String color;
	private int size;
	private String essence;
	private int luminisenceGrade;
	//metodo constructor
		/** metodo constructor candle
		*<p/>des</p>ingresa color, tamaño, esencia, luminisencia de la vela
		*@param color, size, essence y luminisencia de la vela
		*@return este metodo no retorna 
		*/
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
		/** metodo mostrar informacion de la vela
		*<p/>des</p> este metodo toma los atributos de la vela y los concatena para mostrarlos
		*@param este metodo no tiene parametros
		*@return este metodo retorna una cadena de caracteres con los atributos de la vela
		*/
	public String showInfoCandle(){
		String infoCandle=("color candle"+color+"size candle"+size+"essence candle"+essence+"luminisence grade candle"+luminisenceGrade);
			return infoCandle;
	}		
			
}	