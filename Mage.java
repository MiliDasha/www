public class Mage extends GameCharacter{
		protected double intelligence; //интеллект
		protected double spellPower; //сила заклинаний 
		protected String element; //стихия (огонь, лед, молния)
		
		public Mage(){
			super();
			this.intelligence = 0;
			this.spellPower = 15;
			this.element = "лед";
		}
		
		public Mage(String name, int level,double health, double mana, double intelligence, double spellPower, String element){
			super(name, level, health, mana, health > 0);
			this.intelligence = intelligence;
			this.spellPower = spellPower;
			this.element = element;
		}
		
		public double getintelligence(){
			return intelligence;
		}
		
		public double getspellPower(){
			return spellPower;
		}
		
		public String getelement(){
			return element;
		}
		
		@Override
		public void useSpecialAbility() {
			System.out.println(getName() + " использует Магический щит ");
		}
		
		@Override
		public void displayInfo(){
			System.out.println(intelligence + spellPower + element);
		}
		
		public void castSpell(String spellName){
			System.out.println(getName() + " произносит заклинание ");
		}
		
		public void meditate(){
			System.out.println(getName() + " медитирует для восстановления маны ");
		}
}