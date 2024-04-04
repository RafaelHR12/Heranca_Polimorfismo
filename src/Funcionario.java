
abstract class Funcionario {

	 // Atributos comuns a todos os funcionários
    String nome;
    double salario;

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
