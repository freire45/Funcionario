package br.com.erick.funcionario;

public class FuncionarioTeste {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("João", "Silva", 1500.00);
		Funcionario f2 = new Funcionario("Maria", "Oliveita", 1000.00);
		
		System.out.printf("O salario anual de %s %s é de: %.2f%n", f1.getNome(), f1.getSobrenome(), f1.getSalarioMensal() * 12);
		System.out.printf("O salario anual de %s %s é de: %.2f%n", f2.getNome(), f2.getSobrenome(), f2.getSalarioMensal() * 12);
		
		double resultado1;
		double resultado2;
		
		resultado1 = f1.getSalarioMensal() * 12;
		resultado2 = f2.getSalarioMensal() * 12;
		
		System.out.printf("%nO salario anual com bonus de 10 porcento de %s %s é de: %.2f%n", f1.getNome(), f1.getSobrenome(), resultado1 + (resultado1 * 0.1));
		System.out.printf("O salario anual com bonus de 10 porcento de %s %s é de: %.2f%n", f2.getNome(), f2.getSobrenome(), resultado2 + (resultado2 * 0.1));
	}

}
