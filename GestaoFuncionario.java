package empresa;

import java.util.ArrayList;
import java.util.Scanner;

public class GestaoFuncionario {
	public static final Scanner scanner = new Scanner(System.in);
	private ArrayList<Funcionario> funcionarios;
	
	public GestaoFuncionario() {
		this.funcionarios = new ArrayList<>();
	}
	
	public void iniciar() {
		int opcao = 0;
		
		do {
			System.out.println("\n========== Menu ==========");
			System.out.println("1 - Adicionar gerente");
			System.out.println("2 - Adicionar Desenvolvedor");
			System.out.println("3 - Visualizar detalhes dos funcionários");
			System.out.println("4 - Calcular salario");
			System.out.println("5 - Sair");
			System.out.println("Escolha uma opção: ");
			opcao = scanner.nextInt();
			scanner.nextLine();
			
			switch (opcao) {
				case 1:
					System.out.println("Adicionando gerente");
					break;
				case 2:
					System.out.println("Adicionando gerente");
					break;
				case 3:
					System.out.println("Adicionando gerente");
					break;
				case 4:
					System.out.println("Adicionando gerente");
					break;
				case 5:
					System.out.println("Adicionando gerente");
					break;
				default:
					System.out.println("Opção inválida. Tente novamente");
			}
		} while(opcao != 5);
	}
}
