
public class Diretor extends Funcionario {

	private double beneficios;

	Diretor(String nome, double salario, double beneficios) {
		super(nome, salario);
		this.beneficios = beneficios;
	}

	// Implementação do método abstrato para calcular salário para diretores
	@Override
	double calcularSalario() {
		// TODO Auto-generated method stub
		return getSalario() + beneficios;
	}

	// Sobrescrita do método exibirInformacoes() para incluir informações
	// específicas de diretores
	void exibirInformacoes() {
		super.exibirInformacoes(); // Chama o método exibirInformacoes() da superclasse
		System.out.println("Benefícios: " + beneficios);
	}
}
