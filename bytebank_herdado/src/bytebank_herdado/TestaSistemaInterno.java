package bytebank_herdado;

public class TestaSistemaInterno {
	public static void main (String[] args) {
		Gerente g1 = new Gerente();
		g1.setSenha(12000);
		
		Administrador a1 = new Administrador(new AutenticavelUtil());
		a1.setSenha(12000);
		
		Cliente c1 = new Cliente(new AutenticavelUtil());
		c1.setSenha(1000);
		
		SistemaInterno si = new SistemaInterno();
		si.autenticou(g1);
		si.autenticou(a1);
		si.autenticou(c1);
	}
}
