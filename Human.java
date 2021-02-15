
public class Human {
	
	protected int health = 100;
	private int strength = 3;
	protected int stealth =  3;
	protected int intelligence = 3;
	
	public void attack(Human target) {
		System.out.println("target health before: " + target.health);
		target.health = target.health - this.strength;
		System.out.println("Target health after: "+ target.health);
	}
	
}
