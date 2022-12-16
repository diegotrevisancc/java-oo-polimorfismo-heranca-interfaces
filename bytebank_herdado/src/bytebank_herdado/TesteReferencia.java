package bytebank_herdado;

public class TesteReferencia {
	public static void main (String[] args) {
		Funcionario f1 = new Gerente(); //Todo Gerente é um funcionário. Isso é polimorfismo.
		f1.setSalario(5000);
		System.out.println(f1.getBonificacao()); //Apesar da referencia ser um funcionário o método de bonificação é o mesmo que o do objeto.
		
		
		Funcionario f2 = new Gerente();
		f2.setSalario(1200);
		
		System.out.println(f2.getBonificacao()); //Aqui o método de bonificacao é do funcionario
	}
	
}
