import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

        // Solicitar e receber informações do Funcionário Regular
        System.out.println("Informe o nome do Funcionário Regular:");
        String nomeRegular = sc.nextLine();
        System.out.println("Informe o salário do Funcionário Regular:");
        double salarioRegular = sc.nextDouble();
        sc.nextLine();

        // Solicitar e receber informações do Gerente
        System.out.println("Informe o nome do Gerente:");
        String nomeGerente = sc.nextLine();
        System.out.println("Informe o salário do Gerente:");
        double salarioGerente = sc.nextDouble();
        System.out.println("Informe o bônus do Gerente:");
        double bonusGerente = sc.nextDouble();
        sc.nextLine();

        // Solicitar e receber informações do Diretor
        System.out.println("Informe o nome do Diretor:");
        String nomeDiretor = sc.nextLine();
        System.out.println("Informe o salário do Diretor:");
        double salarioDiretor = sc.nextDouble();
        System.out.println("Informe o benefício do Diretor:");
        double beneficioDiretor = sc.nextDouble();

        // Criar instâncias de FuncionarioRegular, Gerente e Diretor com os dados fornecidos pelo usuário
        FuncionarioRegular funcionarioRegular = new FuncionarioRegular(nomeRegular, salarioRegular);
        Gerente gerente = new Gerente(nomeGerente, salarioGerente, bonusGerente);
        Diretor diretor = new Diretor(nomeDiretor, salarioDiretor, beneficioDiretor);

        // Exibir as informações de cada funcionário
        System.out.println("\nInformações do Funcionário Regular:");
        funcionarioRegular.exibirInformacoes();

        System.out.println("\nInformações do Gerente:");
        gerente.exibirInformacoes();
        System.out.println("Salário total (com bônus): " + gerente.calcularSalario());

        System.out.println("\nInformações do Diretor:");
        diretor.exibirInformacoes();
        System.out.println("Salário total (com benefícios): " + diretor.calcularSalario());
	}

}
