package bytebank_herdado_conta;

public class AcaoBolsa implements CalculadorImposto{
	private double ganhos = 30000;
	private Tributavel t;

	public AcaoBolsa () {
		this.t = new Tributavel(ganhos);
	}

	@Override
	public double getImposto() {
		return this.t.getImposto();
	}

}
