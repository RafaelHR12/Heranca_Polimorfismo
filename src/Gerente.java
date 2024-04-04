
public class Gerente extends Funcionario {

	// Atributo adicional específico para gerentes
	private double bonus;

	// Construtor
	Gerente(String nome, double salario, double bonus) {
		super(nome, salario);
		this.bonus = bonus;
	}

	// Implementação do método abstrato para calcular salário para gerentes
	@Override
	double calcularSalario() {
		// TODO Auto-generated method stub
		return getSalario() + bonus;
	}

	// Sobrescrita do método exibirInformacoes() para incluir informações
	// específicas de gerentes
	@Override
	void exibirInformacoes() {
		super.exibirInformacoes(); // Chama o método exibirInformacoes() da superclasse
		System.out.println("Bonus: " + bonus);
	}

}
