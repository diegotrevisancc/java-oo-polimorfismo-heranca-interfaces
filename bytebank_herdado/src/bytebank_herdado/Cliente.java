package bytebank_herdado;
//Utilizando a composição + interface para ter polimorfismo e reutilização de código
//Utilizando a herança para ter polimorfismo e reutilização de código
public class Cliente implements Autenticavel{
	AutenticavelUtil cliente;
	
	public Cliente () {}
	
	public Cliente(AutenticavelUtil cliente) {
		this.cliente = cliente;
	}
	
	public void setSenha(int senha) {
		this.cliente.setSenha(senha);
	}
	
	public boolean autentica(int senha) {
		return this.cliente.autentica(senha);
	}
	
}

