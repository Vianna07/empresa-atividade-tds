package empresa;

public class Desenvolvedor extends Funcionario {
	private int horasExtras;
	private double valorHoraExtra;

	public Desenvolvedor() {
		super("DESENVOLVEDOR");
	}

	public Desenvolvedor(String nome, double salarioBase) {
		super(nome, salarioBase, "DESENVOLVEDOR");
		this.horasExtras = 0;
		this.valorHoraExtra = 0;
	}
	
	public Desenvolvedor(String nome, double salarioBase, int horasExtras, double valorHoraExtra) {
		super(nome, salarioBase, "DESENVOLVEDOR");
		this.horasExtras = horasExtras;
		this.valorHoraExtra = valorHoraExtra;
	}
	
	public int getHorasExtras() {
		return horasExtras;
	}

	public void setHorasExtras(int horasExtras) {
		this.horasExtras = horasExtras;
	}

	public double getValorHoraExtra() {
		return valorHoraExtra;
	}

	public void setValorHoraExtra(double valorHoraExtra) {
		this.valorHoraExtra = valorHoraExtra;
	}

	@Override
	public double calcularSalario() {
		return this.getSalarioBase() + (this.horasExtras * this.valorHoraExtra);
	}

	@Override
	public void exibirDetalhes() {
		super.exibirDetalhes();
		System.out.println("Horas extras: " + this.getHorasExtras());
		System.out.println("Valor das horas extras: " + this.getValorHoraExtra());
		System.out.println("Salario total: " + this.calcularSalario());
		System.out.println("================================");
	}
	
	
	public Funcionario cadastrarFuncionario() {
		Desenvolvedor funcionario = new Desenvolvedor();
		funcionario = (Desenvolvedor) super.cadastrarFuncionario(funcionario);
		
		System.out.print("|== Horas extras: ");
		funcionario.horasExtras = GestaoFuncionario.scanner.nextInt();
		System.out.print("|== Salario Base: ");
		funcionario.valorHoraExtra = GestaoFuncionario.scanner.nextDouble();
		System.out.println("================================");

		return funcionario;
	}
}
