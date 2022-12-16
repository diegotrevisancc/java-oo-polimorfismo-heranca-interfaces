package bytebank_herdado;

public class Professor extends Funcionario {
	private String disciplina;
	private String formacao;
	public String getDisciplina() {
		return this.disciplina;
	}
	
	public String getFormacao() {
		return this.formacao;
	}
	
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	public void setFormacao (String formacao) {
		this.formacao = formacao;
	}
	
	public double getBonificacao() {
		return (super.getSalario() * 0.2);
	}
}
