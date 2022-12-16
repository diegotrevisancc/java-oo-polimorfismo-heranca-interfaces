package bytebank_herdado_conta;

public class Tributavel implements CalculadorImposto{
	
	private double dinheiro;
	
	public Tributavel (double dinheiro) {
		this.dinheiro = dinheiro;
	}
	
	@Override
	public double getImposto() {
		return dinheiro*0.05;
	}
	
	public void atualizaDinheiro(double valor) {
		this.dinheiro += valor;
	}
	
}
