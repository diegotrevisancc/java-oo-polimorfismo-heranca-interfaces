package bytebank_herdado;

public class SistemaInterno {
	private int senha = 1000;

	public void autenticou(Autenticavel a) {
		boolean autentica = a.autentica(this.senha);
		if (autentica) {
			System.out.println("Acesso Permitido");
		} else {
			System.out.println("Acesso Negado");
		}
	}
}
