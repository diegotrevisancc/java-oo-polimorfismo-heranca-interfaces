package bytebank_herdado;
//Utilizando a composição + interface para ter polimorfismo e reutilização de código
//Utilizando a herança para ter polimorfismo e reutilização de código
public class Gerente extends Funcionario implements Autenticavel{
	AutenticavelUtil gerente;
	
	
	//Dessa forma quando você criar um gerente, internamente já vai estar criando um autenticavelutil
	public Gerente() {
		this.gerente = new AutenticavelUtil();
	}
	
	public void setSenha(int senha) {
		this.gerente.setSenha(senha);
	}
	
	public boolean autentica(int senha) {
		return this.gerente.autentica(senha);
	}
	
	public double getBonificacao() {
		return super.getSalario() + (super.getSalario() * 0.1); //Gerente recebe 10% + 1 salário inteiro
	}
}
