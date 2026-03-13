package atv3;

import java.util.Calendar;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		String nome, nomeComp;
		String sobrenome;
		int idade, dia, mes, ano;
		double altura;
		double peso;
		double imc;
		
		Data data = new Data();
		Pessoa pessoa = new Pessoa();
		
		Pessoa listaDePessoas[]  = new Pessoa[10];
		
	for (int i = 0; i > listaDePessoas.length; i++) {
		
		
		System.out.println("Informe o seu nome: ");
		nome = scan.nextLine();
		
		System.out.println("Informe o seu sobrenomenome: ");
		sobrenome = scan.nextLine();
		
		
		System.out.println("Informe a sua altura: ");
		altura = scan.nextDouble();
		
		System.out.println("Informe o seu peso: ");
		peso = scan.nextDouble();
		
		System.out.println("Informe um dia: ");
		dia = scan.nextInt();
		data.setDia(dia);
		
		System.out.println("Informe um mes: ");
		mes = scan.nextInt();
		data.setMes(mes);
		
		System.out.println("Informe um ano: ");
		ano = scan.nextInt();
		data.setAno(ano);
		
		pessoa.setData_nascimento(data);
		
		pessoa.setNome(nome);
		pessoa.setSobrenome(sobrenome);
		pessoa.setAltura(altura);

		pessoa.setPeso(peso);
		
		imc = pessoa.CalculaIMC();
		idade = pessoa.calculaIdade();
		
		System.out.printf("idade: \n%d", idade);
		
		pessoa.InformaObesidade(imc);
	
		
	}
		
		
		
		scan.close();
	}

}


