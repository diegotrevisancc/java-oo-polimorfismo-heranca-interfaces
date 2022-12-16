package bytebank_herdado;

public class TestaHerancaGerente {
	public static void main (String[] args) {
				
		Gerente g1 = new Gerente();
		g1.setSalario(5000.00);
		g1.setNome("Diego Trevisan");
		
		System.out.println("O gerente " + g1.getNome() + " trabalha na empresa " + Funcionario.getEmpresa());
		System.out.println("Ele possui uma bonificacao mensal de R$: " + g1.getBonificacao());
		
		System.out.println(g1.autentica(25));
		System.out.println(g1.autentica(24));
		
		Zelador z1 = new Zelador();
		z1.setNome("Jhones Reolon");
		z1.setSalario(2500);
		
		System.out.printf("O zelador %s trabalha na empresa %s \n", z1.getNome(), Zelador.getEmpresa());
		System.out.printf("Ele recebe %.2f de bonificacao por causa da periculosidade\n", z1.getBonificacao());
		for (byte i = 0; i < 4; i++) {			
			System.out.println("Ele tem as chaves dos ambientes: " + z1.getChaves());
		}
		
		Professor p1 = new Professor();
		p1.setNome("Josue Lirio da Rosa");
		p1.setDisciplina("Historia");
		p1.setFormacao("Historia e Administracao");
		p1.setSalario(4000);
		
		System.out.printf("O Professor %s trabalha na empresta %s\n", p1.getNome(),Professor.getEmpresa());
		System.out.printf("Ele ministra a disciplina de %s e é formado em %s\n", p1.getDisciplina(), p1.getFormacao());
		System.out.printf("Ele recebe a bonificacao de R$:%.2f", p1.getBonificacao());
	}
}
