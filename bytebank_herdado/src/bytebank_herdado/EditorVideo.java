package bytebank_herdado;

public class EditorVideo extends Funcionario{
	public double getBonificacao () {
		return super.getSalario() * 2.5;
		
	}
}
