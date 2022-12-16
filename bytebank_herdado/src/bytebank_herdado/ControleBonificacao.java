package bytebank_herdado;

/*
 * A proposta dessa classe é fazer a soma das bonificações de todos os tipos de funcionário
 * utilizando apenas um método genérico para que possamos assim ver o polimorfismo na prática
 */

public class ControleBonificacao {
	private static double totalBonificacao;
	
	public static double getTotal(Funcionario fulano) {
		double bonificacao = fulano.getBonificacao();
		totalBonificacao += bonificacao;
		return totalBonificacao;
	}
}
