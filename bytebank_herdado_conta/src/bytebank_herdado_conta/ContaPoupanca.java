package bytebank_herdado_conta;

public class ContaPoupanca extends Conta {
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void deposita(double valor) {
		super.saldo += valor - 0.02;
	}
}
