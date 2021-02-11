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

	// Nome
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	// Altura
	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getAltura() {
		return this.altura;
	}

	// Peso
	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getPeso() {
		return this.peso;
	}

	// Data de Nascimento
	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public LocalDate getDataDeNascimento() {
		return this.dataDeNascimento;
	}

	// Sexo
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public char getSexo() {
		return this.sexo;
	}

	// Nivel de Atividade
	public void setNivelDeAtividade(String nivelDeAtividade) {
		this.nivelDeAtividade = nivelDeAtividade;
	}

	public String getNivelDeAtividade() {
		return this.nivelDeAtividade;
	}

	// Nivel de atividade Masculino
	public static final String LEVEMASC = ("1.5");
	public static final String MODERADAMASC = ("1.8");
	public static final String INTENSAMASC = ("2.1");

	// Nivel de atividade Feminino
	public static final String LEVEFEM = ("1.6");
	public static final String MODERADAFEM = ("1.6");
	public static final String INTENSAFEM = ("1.8");

	public int getIdade() {
		LocalDate dataDeHoje = LocalDate.now();
		Period comparacaoData = Period.between(dataDeNascimento, dataDeHoje);
		return comparacaoData.getYears();
	}

//	Calcular IMC do Cliente
	public double getCalcularImc() {
		return this.peso / Math.pow(this.altura, 2);
	}

	public String getStatusImc() {
		if (this.getCalcularImc() < 18.5) {
			return "Abaixo do peso";
		} else if (this.getCalcularImc() > 18.6 && this.getCalcularImc() < 24.9) {
			return "Peso ideal";
		} else if (this.getCalcularImc() > 25 && this.getCalcularImc() < 29.9) {
			return "Levemente acima do peso";
		} else if (this.getCalcularImc() > 30 && this.getCalcularImc() < 34.9) {
			return "Obesidade grau I";
		} else if (this.getCalcularImc() > 35 && this.getCalcularImc() < 39.9) {
			return "Obesidade grau II";
		} else {
			return "Obesidade III (Morbita)";
		}
	}

//	Calculo NCD Masculino
	public double getNcdM() {
		if (this.sexo == 'M') {

			// NCD atravéz da idade Masculina
			if (this.getIdade() >= 18 && this.getIdade() < 30) {
				return 15.3 * this.peso + 679;
			} else if (this.getIdade() >= 31 && this.getIdade() <= 60) {
				return 11.6 * this.peso + 879;
			} else {
				return 13.5 * this.peso + 487;
			}
		}
		
		//Atividades fisicas do cliente masculino
		if (this.sexo)
		
		
		
	}
	
		

//	Calculo NCD Masculino
	public double getNcdF() {
		if (this.sexo == 'F') {

			// NCD atravéz da idade Feminina
			if (this.getIdade() >= 18 && this.getIdade() < 30) {
				return 14.7 * this.peso + 496;
			} else if (this.getIdade() >= 31 && this.getIdade() <= 60) {
				return 8.7 * this.peso + 829;
			} else {
				return 10.5 * this.peso + 596;
			}
		}

	}

}
