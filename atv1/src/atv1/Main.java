package atv1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double c1, c2, h;
		
		System.out.println("Informe o cateto 1");
		c1 = scan.nextDouble();
		
		System.out.println("Informe o cateto 2");
		c2 = scan.nextDouble();
		
		TrianguloRetangulo triangulo = new TrianguloRetangulo();
		
		System.out.printf("Hipotenusa: %.2f%n \n", triangulo.CalculaHipotenusa(c1, c2));
		System.out.printf("Area: %.2f%n \n", triangulo.CalculaArea());
		
		scan.close();
	}

}

