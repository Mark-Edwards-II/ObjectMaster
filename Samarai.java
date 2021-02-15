import java.lang.Math;
public class Samarai extends Human {
	
	private static int numberOfSamarai = 0;
	
	public Samarai() {
		this.health = 200;
		numberOfSamarai++;
	}
	
	public void deathBlow(Human target) {
		target.health = 0;
		System.out.println(this.health);
		this.health = Math.floorDiv(this.health, 2);
		System.out.println(this.health);
	}
	
	public void meditate() {
		this.health += Math.floorDiv(intelligence, health);
	}
}
