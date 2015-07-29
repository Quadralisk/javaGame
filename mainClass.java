import java.util.Scanner;



public class mainClass 
{
	public static void main(String[] args) 
	{
		stats playerStats = new stats();
		
		Scanner input = new Scanner(System.in);
		System.out.println("Chose Class: 1) Warrior\t 2) Mage  3) Rogue  4) Cleric");
				
		playerStats.setClass(input.nextLine());
		playerStats.displayStats();
		
		battle.combat();
		input.close();
	}

}
	
