
public class FuncionarioRegular extends Funcionario {

	// Construtor
	FuncionarioRegular(String nome, double salario) {
		super(nome, salario);
	}

	// Implementação do método abstrato para calcular salário para funcionários
	// regulares
	@Override
	double calcularSalario() {
		// TODO Auto-generated method stub
		return getSalario();
	}

}
