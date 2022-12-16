package bytebank_herdado_conta;

public class ContaCorrente extends Conta implements CalculadorImposto {
	
	private Tributavel t;
	
	public ContaCorrente() {
		this.t = new Tributavel(super.getSaldo());
	}
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
		this.t = new Tributavel(super.getSaldo());
	}
	
	@Override
	public boolean saca(double valor) {
		double impostoSobreSaque = 0.15;
		double valorComImposto = valor + impostoSobreSaque;
		return super.saca(valorComImposto);
	}
	
	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		this.t.atualizaDinheiro(super.getSaldo());
	}

	@Override
	public double getImposto() {
		return this.t.getImposto();
	}
}
