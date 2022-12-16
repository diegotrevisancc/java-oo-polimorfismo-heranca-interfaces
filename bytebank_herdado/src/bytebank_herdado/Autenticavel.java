package bytebank_herdado;

public interface Autenticavel {
	public void setSenha (int senha);
	
	public boolean autentica(int senha);
}
