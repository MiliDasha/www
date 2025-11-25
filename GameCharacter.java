public class GameCharacter{

	protected String name; //имя персонажа
	protected int level; //уровень
	protected double health; //здоровье
	protected double mana; //мана
	protected boolean isAlive; //жив ли персонаж
	
	private static int totalCharacters = 0;
	public static final int MAX_LEVEL = 100;
	
	public GameCharacter(){
		this("Вова", 20, 100, 10, true);
	}
	
	public GameCharacter(String name, int level, double health, double mana, boolean isAlive){
		this.name = name;
		if (level > MAX_LEVEL) {
			this.level = (int) MAX_LEVEL; // Приводим double к int
		} else {
			this.level = level;
		}
		this.health = health;
		this.mana = mana;
		this.isAlive = health > 0;
		totalCharacters++;
	}
	
	public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public double getHealth() {
        return health;
    }

    public double getMana() {
        return mana;
    }

    public boolean isAlive() {
        return isAlive;
    }
	
	public void setHealth(double health) {
        this.health = health;
        this.isAlive = health > 0;
    }

    public void setMana(double mana) {
        this.mana = mana;
    }
	
	public void displayInfo(){ //отобразить информацию о персонаже 
		System.out.println(name + level + health + mana + isAlive);
	}
	
	public void useSpecialAbility(){ //использовать особую способность
		System.out.println(name + "использует способность");
	}
	
	public void attack(){ //атаковать 
		System.out.println(name + "атакует ...");
	}
	
	public void takeDamage(double damage){ //получить урон
		health -= damage;
        if (health <= 0) {
            health = 0;
            isAlive = false;
		}
		System.out.println(health + "получить урон...");
	}
	
	public void heal(double amount){ //восстановить здоровье
		if (isAlive) {
            health += amount;
			System.out.println(name + "восстановил  здоровье...");
		}else {
            System.out.println(name + " не может лечиться — он мертв!");
        }
	}
	
	public static int getTotalCharacters(){
		return totalCharacters;
	}
}