package bytebankHerdado;

public class TesteFuncionario {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		f1.setNome("Nico Steppat");
		f1.setCpf("224.454.758-36");
		f1.setSalario(2600.0);
	
		System.out.println(f1.getNome());
		System.out.println(f1.getBonus());

		Gerente g1 = new Gerente();
		g1.setNome("Marcos Ramos");
		g1.setCpf("321.456.978-90");
		g1.setSalario(5000.0);
		g1.setSenha(456);
		boolean autenticou = g1.autentica(456);
		System.out.println(autenticou);
		System.out.println(g1.getNome());
		System.out.println(g1.getBonus());
	}
}
