public class Archer extends GameCharacter{
		protected double agility; //ловкость
		protected double accuracy; //меткость
		protected String arrowType; //тип стрел
		
		public Archer(){
			super();
			this.agility = 57;
			this.accuracy = 100;
			this.arrowType = "обычные";
		}
		
		public Archer(String name, int level, double health, double mana, double agility, double accuracy, String arrowType){
			super(name, level, health, mana, health > 0);
			this.agility = agility;
			this.accuracy = accuracy;
			this.arrowType = arrowType;
		}
		
		public double getagility(){
			return agility;
		}
		
		public double getaccuracy(){
			return accuracy;
		}
		
		public String getarrowType(){
			return arrowType;
		}
		
		public void displayInfo(){
			System.out.println(agility + accuracy + arrowType);
		}
		
		@Override
		public void useSpecialAbility() {
			System.out.println(getName() + " использует Прицельный выстрел ");
		}
		
		public void attack(){
			System.out.println(getName() + " атакует ");
		}
		
		public void attack(String target, double distance){
			System.out.println(getName() + " аттакует на расстояние ");
		}
}