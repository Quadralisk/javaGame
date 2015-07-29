
public class stats {
	static lives playerLife = new lives();
	static armor playerArmor = new armor();
	static luck playerLuck = new luck();
	static intellect playerIntel = new intellect();
	static strength playerAttack = new strength();
	static mana playerMana = new mana();
	
	public static String playerClass;
	
	public void displayStats(){		
		System.out.println("Class:\t" + playerClass);
		playerLife.displayLife();
		playerArmor.displayArmor();
		playerLuck.displayLuck();
		playerIntel.displayInt();
		playerAttack.displayStrenth();
		playerMana.displayMana();
	}
	public static void wipeStats(){		
		playerLife.setZero();
		playerArmor.setZero();
		playerLuck.setZero();
		playerIntel.setZero();
		playerAttack.setZero();
		playerMana.setZero();
	}
	
	public void setClass(String Class){
		stats.wipeStats();
		
		switch(Class){
		case "1":
		case "warrior": 
			playerClass = "warrior";
			armor.mainArmor=5;
			playerLife.gainLife(25);
			luck.Luck=5;
			intellect.intel=0;
			strength.AD=10;
			mana.maxMp=0;
			mana.mp=0;
			break;
		case "2":
		case "mage":
			playerClass = "mage";
			armor.mainArmor=1;
			playerLife.gainLife(20);
			luck.Luck=5;
			intellect.intel=12;
			strength.AD=1;
			mana.maxMp=20;
			mana.mp=20;
			break;
		case "3":
		case "rogue":
			playerClass = "rogue";
			break;
		case "4":
		case "cleric":
			playerClass = "cleric";
			armor.mainArmor=0;
			playerLife.gainLife(20);
			luck.Luck=5;
			intellect.intel=10;
			strength.AD=5;
			mana.maxMp=30;
			mana.mp=30;
			break;
		}
	}
}


class armor {
	static int mainArmor = 0;
	public void gainArmor(int change){
		mainArmor+=change;
	}
	public void loseArmor(int change){
		mainArmor-=change;
	}
	public void displayArmor(){
		System.out.println("Armor:\t"+mainArmor);
	}
	public void setZero(){
		mainArmor = 0;
	}
}


class lives
{
	public static int lp = 0;
	public void gainLife(int change){
		lp+=change;
	}
	public void loseLife(int change){
		lp-=change;
	}
	public void displayLife(){
		System.out.println("Health:\t"+lp);
	}
	public void setZero(){
		lp = 0;
	}
}

class luck{
	public static int Luck = 0;
	public void gainLuck(int change){
		Luck+=change;
	}
	public void loseLuck(int change){
		Luck-=change;
	}
	public void displayLuck(){
		System.out.println("Luck:\t"+Luck);
	}
	public void setZero(){
		Luck = 0;
	}
}

class strength{
	public static int AD = 0;
	public void gainStrength(int change){
		AD+=change;
	}
	public void loseStrength(int change){
		AD-=change;
	}
	public void displayStrenth(){
		System.out.println("AD:\t"+AD);
	}
	public void setZero(){
		AD = 0;
	}
}
	
class intellect{
	public static int intel = 0;
	public void gainInt(int change){
		intel+=change;
	}
	public void loseInt(int change){
		intel-=change;
	}
	public void displayInt(){
		System.out.println("Int:\t"+intel);
	}
	public void setZero(){
		intel = 0;
	}
}

class mana{
	public static int mp = 0;
	public static int maxMp = 0;
	public void setZero(){
		mp = 0;
		maxMp=0;
	}
	public void gainMana(int change){
		if(mp+change<=maxMp){
			mp+=change;
		}
		else{
			mp=maxMp;
		}
	}
	public void loseMana(int change){
		if(mp-change>=0){
			mp-=change;
		}
		else{
			mp=0;
		}
	}
	public void displayMana(){
		System.out.println("Mana: "+mp+"/"+maxMp);
	}
}
