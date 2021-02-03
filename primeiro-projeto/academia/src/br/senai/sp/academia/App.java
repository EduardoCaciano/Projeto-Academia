package br.senai.sp.academia;


import br.senai.sp.jandira.model.Cliente;

public class App {
	
	public static void main(String args[]) {
		
		Cliente clienteEduardo = new Cliente();
		
		clienteEduardo.setNome("Eduardo da Silva Caciano");
		clienteEduardo.setDataDeNascimento(2000/04/16);
//		clienteEduardo.setSexo("masculino");
		clienteEduardo.setAltura(1.67);
		clienteEduardo.setPeso(68.00);
		
		System.out.println("Nome: " + clienteEduardo.getNome());
		System.out.println("Altura: " + clienteEduardo.getAltura());
		System.out.println("Peso: " + clienteEduardo.getPeso());
		System.out.println("IMC: " + clienteEduardo.getCalcularImc());
		System.out.println("Sexo: " + clienteEduardo.getSexo());
		System.out.println("Idade: " + clienteEduardo.getDataDeNascimento());
	}
	
}
