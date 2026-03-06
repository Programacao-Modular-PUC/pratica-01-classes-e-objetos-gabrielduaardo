package atv2;

public class Pessoa {

	/*Crie uma classe Pessoa com os seguintes atributos: nome, sobrenome, idade, altura, peso, IMC
N˜ao se esque¸ca de encapsular os dados e criar os m´etodos get, set para cada vari´avel.*/
	
	
	String nome;
	String sobrenome;
	int idade;
	double altura;
	double peso;
	double imc;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getImc() {
		return imc;
	}
	public void setImc(double imc) {
		this.imc = imc;
	}
	
	public double CalculaIMC() {
		return this.peso / (this.altura * this.altura);
	}
	
	public void InformaObesidade(double imc) {
		this.imc = imc;
		 if (imc < 18.5) {
				System.out.println("Abaixo do peso");
			} else if (imc < 24.9) {
				System.out.println("Peso normal");
			} else if (imc < 29.9 ) {
				System.out.println("Sobrepeso");
			} else if (imc < 34.9 ) {
				System.out.println("Obesidade grau 1");
			}else if (imc < 39.9 ) {
				System.out.println("Obesidade grau 2");
			} else if (imc > 40 ) {
				System.out.println("Obesidade grau 3");
			}
		}	
}
