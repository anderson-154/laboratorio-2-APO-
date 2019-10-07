package model;
public class Legion{
	//atributos
	
	private String name;
	private Angel[] angels;
	private int posAngel=0;
	
	//constructor	
	/** metodo constructor legion
	*<p/>des</p>este metodo ingresa un nombre y la posicion del angel
	*@param name, posAngel
	*@return este metodo no retrona 
	*/	
public Legion(String name, int posAngel){
	this.name=name;
	this.angels=new Angel[7];
	this.posAngel=posAngel;
}
	//getters and setters
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public int getPosAngel(){
		return posAngel;
	}
	public void setPosAngel(int posAngel){
		this.posAngel=posAngel;
	}
	//metodo de añadir angel
	/** metodo añadit angel
	*<p/>des</p>este metodo agregara un angel en una posicion del arreglo
	*@param name,type,image, celebrationDate, power, color, size, essence, luminisenceGrade
	*@return este metodo no retrona
	*/
	public void addAngel(String name, String type, String image, Date celebrationDate, String power, String color, int size, String essence, int luminisenceGrade){
		
		angels[posAngel]=new Angel(name, type, image, celebrationDate, power);
		angels[posAngel].addCandle(color, size, essence, luminisenceGrade);
		posAngel++;
	}
	//metodo contar angeles	
	/** metodo contar angeles
	*<p/>des</p>este metodo recorrera todo el arreglo contando los angeles que esten en este
	*@param este metodo no tiene paramatros
	*@return este metodo retorna un entero con el numero de angeles agregados
	*/
public int contarAngels(){
	int enterAngels=0;
	for(int i=0;i<=angels.length-1;i++)
	{
		if(angels[i].getName()!=null);
		{
			++enterAngels;
		}
			
	
	}
	return enterAngels;
}
	//metodo mostrar angel buscandolo por el nombre
	/** metodo mostrar informacion del angel buscado por nombre
	*<p/>des</p>este metodo recorrera el arreglo buscando el angel con el nombre que ingreso el usuario
	*@param name
	*@return este metodo retornara la informacion del angel 
	*/
public String showInfoAngelName(String name){
	
	String infoAngelName=("angel not found");
	for(int i=0;i<=angels.length-1;i++)
	{
		if(angels[i].getName().equals(name))
		{
			System.out.println(angels[i].showInfoAngel());
		}	
		
	}
	return infoAngelName;
}	
	//mostrar angel buscandolo por el poder
	/** metodo mostrar informacion del angel cuando se busca por el poder
	*<p/>des</p>este metodo recorrera el arreglo de angeles buscando el angel con el mismo poder que ingreso el usuario
	*@param power	
	*@return este metodo retornara la informacion del angel 
	*/
public String showInfoAngelFromPower(String power){
	String infoAngelNamePower=("angel not found");
	for(int i=0;i<=angels.length-1;i++)
	{
		if(angels[i].getPower().equals(power))
		{
			System.out.println(angels[i].showInfoAngel());
		}
		
	}
	return infoAngelNamePower;
}	
	//mostrar dia de celebracion de un angel buscandolo por el mes
	/** metodo mostrar dia de celebracion de un angel 
	*<p/>des</p>este metodo mostrara la fecha de celebracion del angel buscandola por le mes
	*@param month
	*@return este metodo retorna el nombre, el dia de celebracion del angel y color, esencia de la vela  
	*/
public String showCelebrationAngel(String month){
	String infoCelebrationAngel=("");	
	for(int i=0;i<=angels.length-1;i++)
	{
		if(angels[i].getCelebrationDate().getMonth().equals(month))
		{
			infoCelebrationAngel=infoCelebrationAngel+angels[i].getName()+angels[i].getCelebrationDate()+angels[i].getCandle().getEssence()+angels[i].getCandle().getEssence();
		}	
		
	}
	return infoCelebrationAngel;
}	
	//mostrar la celebracion de todos los angeles
	/** metodo mostrar dia de celebracion de todos los angeles
	*<p/>des</p>este metodo recorrera todo el arreglo para mostrar la informacion de todos los angeles
	*@param este metodo no tiene parametros
	*@return este metodo retornara el dia de celebracion de todos los angeles y el nombre
	*/
public String showCelebrationAllAngel(){	
	String infoCelebrationAllAngel=("");
	for(int i=0;i<=angels.length-1;i++)
	{
		infoCelebrationAllAngel=infoCelebrationAllAngel+angels[i].getName()+angels[i].getCelebrationDate().getMonth()+angels[i].getCelebrationDate().getDay();
		
		
	}
	return infoCelebrationAllAngel;
}	
	//validacion de que el nombre termine en "EL" y no este repetido en el arreglo
	/** metodo de validacion del nombre del angel
	*<p/>des</p>este metodo validara si en el arreglo no hay otro nombre igual en el arreglo y si termina en EL
	*@param name
	*@return este metodo retronara si la validacion fue verdadera o falsa 
	*/
public boolean validationName(String name){
		

	boolean validation1=false;
	String twoLastChar=("");
	
	twoLastChar=""+name.charAt(name.length()-2)+name.charAt(name.length()-1);
	if(twoLastChar.equals("el"))
	{
		for(int i=0;i<=angels.length-1;i++)
		{
			if(angels[i].getName().equals(name))
			{
						
				validation1=true;
			}
		}	
	}	
		return validation1;
}	
	//validacion de que no haya un mismo poder en el arreglo
	/** metodo validacion del poder de un angel
	*<p/>des</p>este metodo validara que en el arreglo no haya dos angeles con el mismo poder
	*@param power
	*@return este metodo retronara si la validacion fue verdadera o falsa 
	*/
public boolean validationPower(String power){
	boolean validationPower=true;
	
	for(int i=0;i<=angels.length-1;i++)
	{
		if(angels[i].getPower().equals(name))
		{
			validationPower=false;
		}
		
	}
	return validationPower;
}


		
}	