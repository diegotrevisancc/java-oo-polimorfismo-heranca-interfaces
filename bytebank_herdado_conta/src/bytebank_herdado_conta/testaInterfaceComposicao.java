package bytebank_herdado_conta;

public class testaInterfaceComposicao {
	public static void main (String[] args) {
//		ContaCorrente c1 = new ContaCorrente(111, 222);
//		c1.deposita(2000);
//		System.out.println(c1.getSaldo());
//		System.out.println(c1.getImposto());
		
		
		ContaCorrente c2 = new ContaCorrente();
		c2.deposita(3000);
		System.out.println(c2.getImposto());
	
		SeguroVida sv = new SeguroVida();
		System.out.println(sv.getImposto());
		
		
		AcaoBolsa ab = new AcaoBolsa();
		System.out.println(ab.getImposto());
}
}
