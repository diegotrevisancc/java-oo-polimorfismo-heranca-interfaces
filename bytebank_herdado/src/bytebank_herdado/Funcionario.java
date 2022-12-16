package bytebank_herdado;

public abstract class Funcionario { //Funcionário é apenas uma classe genérica pra ser herdada, ela não deve gerar instâncias, por isso é abstrata.
	private static String empresa = "Byte-Bank";
	private String nome;
	private String cpf;
//	protected double salario; É uma boa prática utilizarmos os métodos getters e setters da superclass nas classes filhas no lugar de mudar a visibilidade de um atributo de PRIVATE para PROTECTED
	private double salario;
	
	public Funcionario(String nome, String cpf, double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}

	public Funcionario() {

	}

	public abstract double getBonificacao(); //Agora todos os filhos da classe funcionário são obrigados a implementar o método getBonificacao().

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public static String getEmpresa() {
		return empresa;
	}
}