package empresa;

public abstract class Funcionario {
	private String nome;
	private double salarioBase;
	private String cargo;
	
	public Funcionario(String nome, double salarioBase, String cargo) {
		this.nome = nome;
		this.salarioBase = salarioBase;
		this.cargo = cargo;
	}
	
	public Funcionario(String cargo) {
		this.cargo = cargo;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSalarioBase() {
		return salarioBase;
	}
	
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public abstract double calcularSalario();
	public abstract Funcionario cadastrarFuncionario();
	
	public void exibirDetalhes() {
		System.out.println("================================");
		System.out.println("Nome: " + this.nome);
		System.out.println("Salario: " + this.salarioBase);
		System.out.println("Cargo: " + this.cargo);
	}
	
	public Funcionario cadastrarFuncionario(Funcionario funcionario) {
		System.out.println("|== CADASTRANDO " + funcionario.cargo + " ==|");
		System.out.print("|== Nome: ");
		funcionario.nome = GestaoFuncionario.scanner.nextLine();
		System.out.print("|== Salario Base: ");
		funcionario.salarioBase = GestaoFuncionario.scanner.nextDouble();
		
		return funcionario;
	}
}
