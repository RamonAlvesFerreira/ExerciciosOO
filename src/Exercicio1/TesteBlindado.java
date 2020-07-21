package Exercicio1;



public class TesteBlindado {
	
	public static void main(String[] args) {
		
		//Objeto 1
		Blindado blindado1;
		blindado1 = new Blindado();
		blindado1.setName("EE9 Cascavel");
		blindado1.setArmour(12);
		blindado1.setVelocity(100);
		blindado1.setFirePower(90);
		blindado1.isWalk(blindado1.getName(), blindado1.getVelocity());
		
		
		//Objeto 2
		Blindado blindado2;
		blindado2 = new Blindado();
		blindado2.setName("EE11 Urutu");
		blindado2.setArmour(12);
		blindado2.setVelocity(100);
		blindado2.setFirePower(12);
		blindado2.isWalk(blindado2.getName(), blindado2.getVelocity());
		
		//Objeto 3
		Blindado blindado3;
		blindado3 = new Blindado();
		blindado3.setName("VBTP-MR Guarani");
		blindado3.setArmour(30);
		blindado3.setVelocity(110);
		blindado3.setFirePower(30);
		blindado3.inFire(blindado3.getName(), blindado3.getFirePower());
	}

}
