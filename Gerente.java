package empresa;

public class Gerente extends Funcionario {
	private double bonus;
	
	public Gerente() {
		super("GERENTE");
	}
	
	public Gerente(String nome, double salarioBase, double bonus) {
		super(nome, salarioBase, "GERENTE");
		this.setBonus(bonus);
	}
	
	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public double calcularSalario() {
		return this.getSalarioBase() + this.getBonus();
	}
	
	@Override
	public void exibirDetalhes() {
		super.exibirDetalhes();
		System.out.println("Bônus: " + this.getBonus());
		System.out.println("Salário Total: " + this.calcularSalario());
		System.out.println("================================");
	}
	
	public Funcionario cadastrarFuncionario() {
		Gerente funcionario = new Gerente();
		funcionario = (Gerente) super.cadastrarFuncionario(funcionario);
		
		System.out.print("|== Bônus: ");
		funcionario.bonus = GestaoFuncionario.scanner.nextDouble();
		System.out.println("================================");

		return funcionario;
	}
}
