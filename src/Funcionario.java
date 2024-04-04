
abstract class Funcionario {

	// Atributos comuns a todos os funcionários
	private String nome;
	private double salario;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	// Construtor
	Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	// Método para exibir informações sobre o funcionário
	void exibirInformacoes() {
		System.out.println("Nome: " + nome);
		System.out.println("Salário: " + salario);
	}

	// Método abstrato para calcular salário
	abstract double calcularSalario();
}
