import java.util.Scanner;

public class battle{
	
	static int turnNumber=1;
	static Scanner input = new Scanner(System.in);
	static armor playerArmor = new armor();
	static strength playerAttack = new strength();
	static enemy enemyOne = new enemy();
	static lives playerLife = new lives();
	static spells playerSpell = new spells();
	static mana playerMana = new mana();
	
	
	public static void combatEnemyAttack(){
		if (enemy.enemyAttack-armor.mainArmor>=0){
			playerLife.loseLife(enemy.enemyAttack-armor.mainArmor);
		}
	}
	
	
	public static void combatAttackPhase(){
		String playerMove = input.nextLine();
		switch (playerMove){
		case "enemy info":
			enemyOne.displayEnemyStats();
			turnNumber--;
			break;
		case "attack":
			enemy.enemyLoseHealth(strength.AD);
			battle.combatEnemyAttack();
			break;
		case "heal":
			playerSpell.spellHeal();
			break;
		case "fireball":
			playerSpell.spellFireball();
			break;
		case "ice lance":
			playerSpell.spellIceLance();
			break;
		}
	}

	
	public static void combat(){
		
		//				(Health, armor, attack)
		enemyOne.setEnemy(enemyType.enemyBoss1());

		boolean playerAlive = true;
		boolean enemyAlive = true; 	//if + while loop to repeat combat until one dies

		
		while (playerAlive == true && enemyAlive==true){
			
			
			if (lives.lp<=0){
				playerAlive=false;
				System.out.println("GAME OVER");
			}
			else if(enemy.enemyHealth<=0){
				enemyAlive=false;
				System.out.println("Enemy killed");
					battle.combat();
			}
			else{
				System.out.println("\nTurn: "+turnNumber);
				turnNumber++;
				System.out.println("Player:");
				playerLife.displayLife();
				playerMana.displayMana();
				System.out.println("");
				enemyOne.displayEnemyHealth();
				battle.combatAttackPhase();
			}
					
		}
	}
}
