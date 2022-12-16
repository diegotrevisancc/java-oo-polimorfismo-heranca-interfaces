package bytebank_herdado;

public class Zelador extends Funcionario {
	private String[] chaves = {"Banheiro", "Salas de Aula", "Refeitorio", "Biblioteca"};
	private double bonificacaoPericulosidade = 0.15;
	
	byte i = -1;
	public String getChaves() {
		this.i++;
		return this.chaves[i];
	}
	
	public double getBonificacao() {
		return (super.getSalario() * 0.1) + this.bonificacaoPericulosidade;
	}
}
