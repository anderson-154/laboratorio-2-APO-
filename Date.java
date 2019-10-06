package model;
public class Date{
	//constantes
	private final String JANUARY="JANUARY";
	private final String FEBRUARY="FEBRUARY";
	private final String MARCH="MARCH";
	private final String APRIL="APRIL";
	private final String MAY="MAY";
	private final String JUNE="JUNE";
	private final String JULY="JULY";
	private final String AUGUST="AUGUST";
	private final String SEPTEMBER="SEPTEMBER";
	private final String OCTOBER="OCTOBER";
	private final String NOVEMBER="NOVEMBER";
	private final String DECEMBER="DECEMBER";
	
	//atributos
	private String month;
	private int day;
	//metodo constructor
public Date(int month, int day){	
	switch(month){
		case 1:
		this.month=JANUARY;
		break;
		
		case 2:
		this.month=FEBRUARY;
		break;
		
		case 3:
		this.month=MARCH;
		break;
		
		case 4:
		this.month=APRIL;
		break;
		
		case 5:
		this.month=MAY;
		break;
		
		case 6:
		this.month=JUNE;
		break;
		
		case 7:
		this.month=JULY;
		break;
		
		case 8:
		this.month=AUGUST;
		break;
		
		case 9:
		this.month=SEPTEMBER;
		break;
		
		case 10:
		this.month=OCTOBER;
		break;
		
		case 11:
		this.month=NOVEMBER;
		break;
		
		case 12:
		this.month=DECEMBER;
		break;
	    }
		this.day=day;
		
		
	}
	//getters and setters
	public String getMonth(){
		return month;
	}	
	public void setMonth(int month){
		switch(month){
		case 1:
		this.month=JANUARY;
		break;
		
		case 2:
		this.month=FEBRUARY;
		break;
		
		case 3:
		this.month=MARCH;
		break;
		
		case 4:
		this.month=APRIL;
		break;
		
		case 5:
		this.month=MAY;
		break;
		
		case 6:
		this.month=JUNE;
		break;
		
		case 7:
		this.month=JULY;
		break;
		
		case 8:
		this.month=AUGUST;
		break;
		
		case 9:
		this.month=SEPTEMBER;
		break;
		
		case 10:
		this.month=OCTOBER;
		break;
		
		case 11:
		this.month=NOVEMBER;
		break;
		
		case 12:
		this.month=DECEMBER;
		break;
		}
		this.day=day;
		
		
	}	
	public int getDay(){	
		return day;
	}	
	public void setDay(int day){
		this.day=day;
	}	
		
		
}