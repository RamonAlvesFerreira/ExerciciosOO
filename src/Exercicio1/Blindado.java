package Exercicio1;

public class Blindado {
	
	private String name;
	private double armor;
	private double velocity;
	private double firePower;

	
	//METHODs
	public void isWalk(String name, double velocity)
	{
		System.out.println(name + " esta se movendo a " + velocity + "km/h");
	}
	public void inFire(String name, double firePower)
	{
		System.out.println(name + " disparou canhão de " + firePower + "mm");
	}
	
	//SETs
	public String setName(String nameToSet) {
		return this.name = nameToSet;
	}
	public double setArmour(double armourToSet) {
		return this.armor = armourToSet;
	}
	public double setVelocity(double velocityToSet) {
		return this.velocity = velocityToSet;
	}
	public double setFirePower(double firePowerToSet) {
		return this.firePower = firePowerToSet;
	}
	
	//GETs
	public double getVelocity() {
		return this.velocity;
	}
	public double getFirePower() {
		return this.firePower;
	}
	public String getName() {
		return this.name;
	}
}
