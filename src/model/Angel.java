package model;
public class Angel{
	//atributos
	
	private String name;
	private String type;
	private String image;
	private Date celebrationDate;
	private String power;
	private Candle candle;
	
	//metodo constructor
		/** metodo constructor
		*<p/>des</p>ingresa un nombre, tipo, imagen dia de celebracion y un poder de un angel
		*@param name,type,image,celebrationDate,power
		*@return no retorna
		*/

public Angel(String name, String type, String image, Date celebrationDate, String power){
	this.name=name;
	this.type=type;
	this.image=image;
	this.celebrationDate=celebrationDate;
	this.power=power;
}
	//getters and setters
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
		//metodo para crear la vela
		/**metodo crear vela
		*<p/>des</p>este metodo creara el objeto vela
		*@param color, size, essence, luminisenceGrade
		*@return este metod no retorna
		*/		
	public void addCandle(String color, int size, String essence, int luminisenceGrade){
		candle=new Candle(color, size, essence, luminisenceGrade);
	
	}
		//metodo para mostrar informacion del angel
		/** metodo mostar informacion del angel
		*<p/>des</p>este metodo toma los atributos del angel y los concatena para mostrarlos
		*@param este metodo no tiene parametros
		*@return retorna una cadena de caracteres con los atributos el angel
		*/
	public String showInfoAngel(){
	String infoAngel=("\nname arcangel: "+name+"\ntype arcangel: "+type+"\nimage arcangel: "+image+"\ncelebration date: "+celebrationDate+"\npower arcangel: "+power);
	candle.showInfoCandle();	
		return infoAngel;
	}
		//metodo para borrar angel
		/** metodo para borrar angeles
		*<p/>des</p>este metodo toma todos los atributos de un angel y los vuelve vacios
		*@param el angel tiene que estar creado
		*@return retorna todos los atributos del angel vacios
		*/
	public void deleteAngel(){
	name=null;
	type=null;
	image=null;
	celebrationDate=null;
	power=null;
	}
}	