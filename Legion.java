package model;
public class Legion{
	private String name;
	private Angel[] angels;
	private int posAngel=0;
	
public Legion(String name, int posAngel){
	this.name=name;
	this.angels=new Angel[7];
	this.posAngel=posAngel;
}

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
	
	public void addAngel(String name, String type, String image, Date celebrationDate, String power, String color, int size, String essence, int luminisenceGrade){
		
		angels[posAngel]=new Angel(name, type, image, celebrationDate, power);
		angels[posAngel].addCandle(color, size, essence, luminisenceGrade);
		posAngel++;
	}	
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
public String showCelebrationAllAngel(){	
	String infoCelebrationAllAngel=("");
	for(int i=0;i<=angels.length-1;i++)
	{
		infoCelebrationAllAngel=infoCelebrationAllAngel+angels[i].getName()+angels[i].getCelebrationDate().getMonth()+angels[i].getCelebrationDate().getDay();
		
		
	}
	return infoCelebrationAllAngel;
}	
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