package atv2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		String nome;
		String sobrenome;
		int idade;
		double altura;
		double peso;
		double imc;
		
		System.out.println("Informe o seu nome: ");
		nome = scan.nextLine();
		
		System.out.println("Informe o seu sobrenomenome: ");
		sobrenome = scan.nextLine();
		
		System.out.println("Informe a sua idade: ");
		idade = scan.nextInt();
		
		System.out.println("Informe a sua altura: ");
		altura = scan.nextDouble();
		
		System.out.println("Informe o seu peso: ");
		peso = scan.nextDouble();
		
		Pessoa pessoa = new Pessoa();
		
		pessoa.setSobrenome(nome);
		pessoa.setSobrenome(sobrenome);
		pessoa.setAltura(altura);
		pessoa.setIdade(idade);
		pessoa.setPeso(peso);
		
		imc = pessoa.CalculaIMC();
		
	pessoa.InformaObesidade(imc);
		
		scan.close();
	}

}
