package br.senai.sp.jandira.model;
import java.time.LocalDate;
import java.time.Period;


public class Cliente {
	
	private String nome;
	private double altura;
	private double peso;
	private LocalDate dataDeNascimento;
	private char sexo;
	private String nivelDeAtividade;
	
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	
	
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getAltura() {
		return this.altura;
	}
	
	
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getPeso() {
		return this.peso;
	}
	
	
	
	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	public LocalDate getDataDeNascimento() {
		return this.dataDeNascimento;
	}
	
	
	
	public void setSexo(char sexo) {
		if (this.sexo == 'M') {
			System.out.println("Masculino");
		}
		if (this.sexo == 'F') {
			System.out.println("Feminino");
		}
	}
	public char getSexo(){
		return this.sexo;
	}
	
	
	
	public void setNivelDeAtividade(String nivelDeAtividade) {
		this.nivelDeAtividade = nivelDeAtividade;
	}
	public String getNivelDeAtividade() {
		return this.nivelDeAtividade;
	}
	
	
//	Calcular IMC do Cliente
	public double getCalcularImc() {
		return this.peso / Math.pow(this.altura, 2);
	}
	public String getStatusImc() {
		if (this.getCalcularImc() < 18.5) {
			return "Abaixo do peso";
		} else if (this.getCalcularImc() > 18.5 && this.getCalcularImc() < 25) {
			return "Peso ideal";
		} else if (this.getCalcularImc() > 25 && this.getCalcularImc() < 30) {
			return "Levemente acima do peso";
		} else if (this.getCalcularImc() > 30 && this.getCalcularImc() < 35) {
			return "Obesidade grau I";
		} else if (this.getCalcularImc() > 35 && this.getCalcularImc() < 40) {
			return "Obesidade grau II";
		} else {
			return "Obesidade III (Morbita)";
		}	
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
