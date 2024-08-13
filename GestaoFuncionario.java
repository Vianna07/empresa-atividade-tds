package empresa;

import java.util.ArrayList;
import java.util.Scanner;

public class GestaoFuncionario {
	public static final Scanner scanner = new Scanner(System.in);
	private ArrayList<Funcionario> funcionarios;
	
	public GestaoFuncionario() {
		this.funcionarios = new ArrayList<>();
	}
	
	public void adicionarFuncionario(Cargo cargo) {
		switch (cargo) {
			case DESENVOLVEDOR: 
				funcionarios.add((new Desenvolvedor().cadastrarFuncionario()));
				break;
			case GERENTE:
				funcionarios.add((new Gerente().cadastrarFuncionario()));
				break;
		}
	}
	
	public void visualizarDetalhesFuncionarios() {
		if (funcionarios.size() == 0) {
			System.out.println("Nenhum funcionário encontrado na lista");
		}
		
		for (Funcionario funcionario : funcionarios) {
			funcionario.exibirDetalhes();
			System.out.println();
		}
	}
	
	public void iniciar() {
		int opcao = 0;
		
		do {
			System.out.println("\n========== Menu ==========");
			System.out.println("1 - Adicionar gerente");
			System.out.println("2 - Adicionar Desenvolvedor");
			System.out.println("3 - Visualizar detalhes dos funcionários");
			System.out.println("4 - Calcular salário");
			System.out.println("5 - Sair");
			System.out.println("Escolha uma opção: ");
			opcao = scanner.nextInt();
			scanner.nextLine();
			System.out.println();
			
			switch (opcao) {
				case 1:
					System.out.println("Adicionando gerente");
					this.adicionarFuncionario(Cargo.GERENTE);
					break;
				case 2:
					System.out.println("Adicionando desenvolvedor");
					this.adicionarFuncionario(Cargo.DESENVOLVEDOR);
					break;
				case 3:
					System.out.println("Visualizando detalhes dos funcionários");
					this.visualizarDetalhesFuncionarios();
					break;
				case 4:
					System.out.println("Calculando salário");
					break;
				case 5:
					System.out.println("Saindo do sistema");
					break;
				default:
					System.out.println("Opção inválida. Tente novamente");
			}
		} while(opcao != 5);
	}
}
