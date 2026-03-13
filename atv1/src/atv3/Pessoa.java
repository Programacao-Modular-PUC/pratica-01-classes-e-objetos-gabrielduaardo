package atv3;

import java.text.SimpleDateFormat;
import java.util.Calendar;


public class Pessoa {
	Calendar hoje = Calendar.getInstance();
	 
	  
	String nome;
	String sobrenome;
	int idade, ida;
	double altura;
	double peso;
	double imc;
	
	Data data_nascimento;

	
	
	public Data getData_nascimento() {
		return data_nascimento;
	}
	public void setData_nascimento(Data data_nascimento) {
		this.data_nascimento = data_nascimento;
	}
	
	
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
				System.out.printf("Abaixo do peso IMC %.2f",  imc);
			} else if (imc < 24.9) {
				System.out.printf("Peso normal %.2f", imc);
			} else if (imc < 29.9 ) {
				System.out.printf("Sobrepeso %.2f", imc);
			} else if (imc < 34.9 ) {
				System.out.printf("Obesidade grau 1 %.2f", imc);
			}else if (imc < 39.9 ) {
				System.out.printf("Obesidade grau 2 %.2f", imc);
			} else if (imc > 40 ) {
				System.out.printf("Obesidade grau 3 %.2f", imc);
			}
		}	
	
	public int calculaIdade() {
		int dia = hoje.get(Calendar.DAY_OF_MONTH);
		int mes = hoje.get(Calendar.MONTH) + 1;
		int ano = hoje.get(Calendar.YEAR);
		
		if (data_nascimento.getMes() > mes) {
			ida = (ano - data_nascimento.getAno() -1);
			return ida;
		} 
		else if (data_nascimento.getMes() < mes) {
			return ano - data_nascimento.getAno();
		} 
		else if (data_nascimento.getMes() == mes) {
			if (data_nascimento.getDia() > dia) {
				return ano - data_nascimento.getAno() -1;
			} 
			else if (data_nascimento.getDia() < dia) {
				return ano - data_nascimento.getAno();
			}
			else if (data_nascimento.getDia() == dia) {
				return ano - data_nascimento.getAno();
			}
		}
		
		return idade;
	}
}
