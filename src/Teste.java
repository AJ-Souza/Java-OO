public class Teste {
	public static void main(String[] args) {
		Conta contaDaMarcela = new Conta(456, 963369);
		Conta contaDoPaulo = new Conta(123, 789987);
		
		contaDoPaulo.titular = new Cliente();

		contaDoPaulo.titular.setNome("Paulo Silveira");
		contaDoPaulo.titular.setCpf("222.222.222-22");
		contaDoPaulo.titular.setProfissao("Desenvolvedoro");
				
		contaDaMarcela.titular = new Cliente();

		contaDaMarcela.titular.setNome("Marcela");
		contaDaMarcela.titular.setCpf("111.111.111-11");
		contaDaMarcela.titular.setProfissao("Desenvolvedora");
		contaDaMarcela.deposita(100.0);
		contaDaMarcela.saca(20);
		contaDaMarcela.transfere(20, contaDoPaulo);
		
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		System.out.println("Titular: " + contaDaMarcela.titular.getNome() + ", Saldo: "
				+ contaDaMarcela.getSaldo());
		
		System.out.println("-------------------------------");
		System.out.println("Titular: " + contaDoPaulo.titular.getNome() + ", Saldo: "
				+ contaDoPaulo.getSaldo());
		
		System.out.println("-------------------------------");
		System.out.println("Total de Contas criadas: " + Conta.getTotal());
	}
}