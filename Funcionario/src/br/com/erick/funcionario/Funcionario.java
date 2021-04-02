package br.com.erick.funcionario;

/**
 * Crie um programa que simula um cadastro de um funcionário.
 * @author Erick Freire
 * @version 1 - Criado em 02-04-2021 as 15:42
 */

public class Funcionario {
	
	private String nome;
	private String sobrenome;
	private double salarioMensal = 0.0;
	
	public Funcionario(String n, String sb, double sal) {
	    nome = n;
	    sobrenome = sb;
	    
	    if(sal >= 0.0)
	       salarioMensal = sal;
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

	public double getSalarioMensal() {
		return salarioMensal;
	}

	public void setSalarioMensal(double salarioMensal) {
		this.salarioMensal = salarioMensal;
	}
	
	

}
