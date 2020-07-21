package Exercicio2;

public class TesteTriangulo {
	
	public static void main(String[] args) {
	
		//Objeto1
		Triangulo triangulo1;
		triangulo1 = new Triangulo();
		triangulo1.setAltura(10);
		triangulo1.setBase(5);
		System.out.println(triangulo1.calcularAreaTriangulo(triangulo1.getAltura(), triangulo1.getBase()));
		
		//Objeto2
		Triangulo triangulo2;
		triangulo2 = new Triangulo();
		triangulo2.setAltura(45);
		triangulo2.setBase(23);
		System.out.println(triangulo2.calcularAreaTriangulo(triangulo2.getAltura(), triangulo2.getBase()));
		
		//Objeto3
		Triangulo triangulo3;
		triangulo3 = new Triangulo();
		triangulo3.setAltura(2);
		triangulo3.setBase(90);
		System.out.println(triangulo3.calcularAreaTriangulo(triangulo3.getAltura(), triangulo3.getBase()));
	
	}

}
