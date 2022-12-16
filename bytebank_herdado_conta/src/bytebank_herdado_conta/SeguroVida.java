package bytebank_herdado_conta;

public class SeguroVida implements CalculadorImposto{
	private double seguro = 12000;
	private Tributavel t;

	public SeguroVida() {
		this.t = new Tributavel(this.seguro);
	}
	
	@Override
	public double getImposto() {
		return this.t.getImposto();
	}	
}
