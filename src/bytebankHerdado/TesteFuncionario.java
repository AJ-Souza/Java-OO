package bytebankHerdado;

public class TesteFuncionario {
	public static void main(String[] args) {
		Funcionario f1 = new Gerente();
		f1.setNome("Nico Steppat");
		f1.setCpf("224.454.758-36");
		f1.setSalario(2600.0);

		Gerente g1 = new Gerente();
		g1.setNome("Marcos Ramos de Oliveira");
		g1.setCpf("321.456.978-90");
		g1.setSalario(5000.0);
		g1.setSenha(456);
		boolean autenticou = g1.autentica(456);
		System.out.println(autenticou);

		EditorVideo ev1 = new EditorVideo();
		ev1.setNome("Pedro Paulo");
		ev1.setSalario(2500.0);

		Designer d1 = new Designer();
		d1.setNome("Henrique Medeiros");
		d1.setSalario(2000.0);

		System.out.println("-------------------------");

		System.out.println(f1.getNome() + " - " + f1.getBonificacao());
		System.out.println(g1.getNome() + " - " + g1.getBonificacao());
		System.out.println(ev1.getNome() + " - " + ev1.getBonificacao());
		System.out.println(d1.getNome() + " - " + d1.getBonificacao());

		ControleBonificacao controle = new ControleBonificacao();

		controle.registra(f1);
		controle.registra(g1);
		controle.registra(ev1);
		controle.registra(d1);

		System.out.println("-------------------------");
		System.out.println("Total de Bonificacoes: R$" + controle.getSoma());

	}
}
