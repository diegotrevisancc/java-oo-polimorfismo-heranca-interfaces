package bytebank_herdado;

public class TestaPolimorfismo {
	public static void main(String[] args) {
		Funcionario f1 = new Gerente();
		f1.setSalario(2000); 
		System.out.println(f1.getBonificacao());
		
		Gerente g1 = new Gerente();
		g1.setSalario(3300);
		System.out.println(g1.getBonificacao());
		
		Professor p1 = new Professor();
		p1.setSalario(2500);
		System.out.println(p1.getBonificacao());
		
		Zelador z1 = new Zelador();
		z1.setSalario(4000);
		System.out.println(z1.getBonificacao());
		
		EditorVideo e1 = new EditorVideo();
		e1.setSalario(1100);
		System.out.println(e1.getBonificacao());
		
		/* Agora vamos saber o total dessa soma
		 * com a nossa classe genérica e ver o polimorfismo na prática
		 */
		
		System.out.println(ControleBonificacao.getTotal(f1));
		System.out.println(ControleBonificacao.getTotal(g1));
		System.out.println(ControleBonificacao.getTotal(p1));
		System.out.println(ControleBonificacao.getTotal(z1));
		System.out.println(ControleBonificacao.getTotal(e1));
		
	}
}
