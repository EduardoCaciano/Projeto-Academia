package br.senai.sp.jandira.model;
import java.time.LocalDate;

import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;


public class Cliente {
	
	private String nome;
	private LocalDate dataDeNascimento;
	private char sexo;
	private double peso;
	private double altura;
	private int nivelDeAtividade;
	
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
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
		else {
			System.out.println("Feminino");
		}
	}
	
	public char getSexo(){
		return this.sex;
	}
	
	
	
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getPeso() {
		return this.peso;
	}
	
	
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getAltura() {
		return this.altura;
	}
	
	
	
	public void setNivelDeAtividade(int nivelDeAtividade) {
		this.nivelDeAtividade = nivelDeAtividade;
	}
	public int getNivelDeAtividade() {
		return this.nivelDeAtividade;
	}
	
	
	
	
	public double getCalcularImc() {
		return this.peso / Math.pow(this.altura, 2);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
