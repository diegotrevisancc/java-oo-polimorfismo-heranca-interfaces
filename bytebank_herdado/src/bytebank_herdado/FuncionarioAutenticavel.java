package bytebank_herdado;

public abstract class FuncionarioAutenticavel extends Funcionario {
	private int senha = 2000;
	
	public void setSenha (int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		if (senha == this.senha) {
			return true;
		}else {
			return false;
		}
	}
}
