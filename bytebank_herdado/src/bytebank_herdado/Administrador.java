package bytebank_herdado;
// Utilizando a composição + interface para ter polimorfismo e reutilização de código
// Utilizando a herança para ter polimorfismo e reutilização de código
public class Administrador extends Funcionario implements Autenticavel{
	AutenticavelUtil administrador;
	
	
	public Administrador () {}
	
	@Override
	public double getBonificacao() {
		return 50;
	}
		
	public Administrador(AutenticavelUtil administrador) {
		this.administrador = administrador;
	}
	
	public void setSenha(int senha) {
		this.administrador.setSenha(senha);
	}
	
	public boolean autentica(int senha) {
		return this.administrador.autentica(senha);
	}
	
}
