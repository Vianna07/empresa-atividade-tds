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
		default:
			break;
		}
	}
	
	public void visualizarDetalhesFuncionarios() {
		if (funcionarios.isEmpty()) {
			System.out.println("Nenhum funcionário encontrado na lista");
		}
		
		for (Funcionario funcionario : funcionarios) {
			funcionario.exibirDetalhes();
			System.out.println();
		}
	}
	
	public double calcularSalarios(Cargo cargo) {
		double salarios = 0;
	
		if (cargo.equals(Cargo.TODOS)) {			
			for (Funcionario funcionario : funcionarios) {
				salarios += funcionario.calcularSalario();
			}
		} else {			
			for (Funcionario funcionario : funcionarios) {
				if ((funcionario.getClass().getSimpleName().toUpperCase()).equals(cargo.name()))
					salarios += funcionario.calcularSalario();
			}
		}


		return salarios;
	}
	
	public void menuSalarios() {
		int opcao = 0;
		
		do {
			System.out.println();
			System.out.println("\n===== Menu Salários =====");
			System.out.println("1 - Ver a soma dos salários dos gerentes");
			System.out.println("2 - Ver a soma salários dos desenvolvedores");
			System.out.println("3 - Ver a soma de todos os salários");
			System.out.println("4 - Sair");
			System.out.println("Escolha uma opção: ");
			opcao = scanner.nextInt();
			scanner.nextLine();
			System.out.println();
			
			switch (opcao) {
				case 1:
					System.out.println("Soma dos salários dos gerentes: " + calcularSalarios(Cargo.GERENTE));
					break;
				case 2:
					System.out.println("Soma dos salários dos gerentes: " + calcularSalarios(Cargo.DESENVOLVEDOR));
					break;
				case 3:
					System.out.println("Soma de todos os salários: " + calcularSalarios(Cargo.TODOS));
					break;
				case 4:
					System.out.println("Saindo do menu...");
					break;
				default:
					System.out.println("Opção inválida. Tente novamente");
			}
		} while(opcao != 5);
	}
	
	public void menuPrincipal() {
		int opcao = 0;
		
		do {
			System.out.println("\n===== Menu Principal =====");
			System.out.println("1 - Adicionar gerente");
			System.out.println("2 - Adicionar Desenvolvedor");
			System.out.println("3 - Visualizar detalhes dos funcionários");
			System.out.println("4 - Calcular salários");
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
					System.out.println("Calculando salários...");
					menuSalarios();
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
