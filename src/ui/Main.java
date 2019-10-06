package ui;

import java.util.Scanner;
import model.Date;
import model.Legion;

public class Main{
	
	
	int option;
	Scanner reader = new Scanner(System.in);
	private static Legion legion;
	
	public static void inIt(){
		legion=new Legion("maxima superior");
		name=reader.nextLine();
		type=reader.nextLine();
		image=reader.nextLine();
		celebrationDate=reader.nextLine();
		power=reader.nextLine();
		color=reader.nextLine();
		size=reader.nextLine();
		essence=reader.nextLine();
		luminisenceGrade=reader.nextLine();
		legion.addAngel("Miguel", "arcangel", "https://www.google.com/search?q=arcangel+miguel", "29 SEPTEMBER" ,"PROTECTION", "red", 15 , "vainil", 240 );
		legion.addAngel("Gabriel", "arcangel", "https://www.google.com/search?q=gabriel+arcangel", "27 FEBRUARY", "HEALTH", "blue" , 10, "berries", 150);
		legion.addAngel("Rafael", "arcangel", "https://www.google.com/search?q=arcangel+rafael",  "24 OCTOBER", "ABUNDANCE", "green",  20 , "blackberry", 130 );
		
	}
	
	
	public static void main(String[]args){
		System.out.println=("welcome to the legion maxima superior");
		Ssytem.out.println=("\ntype the option you want to make.\n1enter an angel.\n2count the angels entered.\n3Display information of the archangel given his name.\n4Display information of the archangel given his power.\n5Display the celebrations to be held given one month.\n6Display all the angels celebrations.");
		
		option=new reader.nextInt();


		switch(option)
		{
			case 1:
			System.out.println=("option add angel");
			if(legion.validationName(name)==true)
			{
				legion.addAngel(name, type, image, celebrationDate, power, color, size, essence, luminisenceGrade);	
			}
			break;
			
			case 2:
			System.out.println=("option count all angels");
				legion. contarAngels();
			break;
				
			case 3:
			System.out.pritln=("option Display information of the archangel given his name");
				legion.showInfoAngelName();
			break;
			
			case 4:
			System.out.println=("option Display information of the archangel given his power");
				if(validationPower(power)==true)
				{
					legion.showInfoAngelFromPower(power);
				}
			break;
			
			case 5:
			System.out.println=("option Display the celebrations to be held given one month");
				legion.showCelebrationAngel(month);
			break;
			
			case 6:
			System.out.println=("option Display all the angels celebrations");
				legion.showCelebrationAllAngel();
			break;
			

		}


	}
}	