public class Warrior extends GameCharacter{
	protected double strength; //сила
	protected double armor; //броня
	protected String weaponType; //тип оружия 
	
	public Warrior() {
        super();
        this.strength = 15.0;
        this.armor = 10.0;
        this.weaponType = "Меч";
    }
	
	public Warrior(String name, int level,double health, double mana, double strength, double armor, String weaponType){
		super(name, level, health, mana, health > 0);
		this.strength = strength;
        this.armor = armor;
        this.weaponType = weaponType;
	}
	
	public double getStrength() {
        return strength;
    }

    public double getArmor() {
        return armor;
    }

    public String getWeaponType() {
        return weaponType;
    }
	
	@Override
    public void displayInfo() {
        System.out.println(strength + armor + weaponType);
	}	
	
	@Override
    public void useSpecialAbility() {
        System.out.println(getName() + " использует Берсерк ");
    }
	
	@Override
    public void attack() {
        System.out.println(getName() + " атакует с помощью " + weaponType);
    }

    public void attack(String weapon) {
        System.out.println(getName() + " атакует с помощью " + weapon);
    }
}
		
	
	
	