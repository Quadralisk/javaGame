//put enemy types with in this 
public class enemy {
	static int enemyHealth, enemyArmor, enemyAttack;
	public void setEnemy(int[] stat){
		enemyHealth = stat[0];
		enemyArmor = stat[1];
		enemyAttack = stat[2];
	}
	public void displayEnemyHealth(){
		System.out.println("Enemy:\nHealth:\t"+enemyHealth);
	}
	public void displayEnemyStats(){
		System.out.println("Enemy:\nHealth:\t"+enemyHealth+"\nStrength:"+enemyAttack+"\nArmor:\t"+enemyArmor);
	}
	public static void enemyLoseHealth(int damage){
		if (damage-enemyArmor>=0){
			enemyHealth-=(damage-enemyArmor);
		}
	}
	
	
}

class enemyType{
	static int[] enemy1(){
		int stat[] = {5, 0, 3};
		return stat;
	}
	static int[] enemy2(){
		int stat[] = {10, 2, 4};
		return stat;
	}
	static int[] enemyBoss1(){
		int stat[] = {50, 3, 5};
		return stat;
	}
	
}
