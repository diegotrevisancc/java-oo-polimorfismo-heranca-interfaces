package bytebank_herdado_conta;

public class TestaHerancaConstrutor {
	public static void main(String[] args) {
		ContaCorrente josue = new ContaCorrente(66, 666);
		ContaPoupanca diego = new ContaPoupanca(77, 777);
		
		josue.deposita(220.00);
		josue.transfere(35, diego);
		
		System.out.printf("O valor da conta do Josué agora é de: R$ %.2f\n", josue.getSaldo());
		System.out.printf("O valor da conta do Diego agora é de: R$ %.2f\n", diego.getSaldo());
	}
}
