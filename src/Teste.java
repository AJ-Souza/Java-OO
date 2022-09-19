public class Teste {
	public static void main(String[] args) {
		Conta contaDaMarcela = new Conta();
		Conta contaDoPaulo = new Conta();
		
		contaDoPaulo.titular = new Cliente();

		contaDoPaulo.titular.nome = "Paulo Silveira";
		contaDoPaulo.titular.cpf = "222.222.222-22";
		contaDoPaulo.titular.profissao = "Desenvolvedoro";
		
		
		contaDaMarcela.titular = new Cliente();

		contaDaMarcela.titular.nome = "Marcela";
		contaDaMarcela.titular.cpf = "111.111.111-11";
		contaDaMarcela.titular.profissao = "Desenvolvedora";
		contaDaMarcela.deposita(100.0);
		contaDaMarcela.saca(20);
		contaDaMarcela.transfere(20, contaDoPaulo);

		System.out.println("Titular: " + contaDaMarcela.titular.nome + ", Saldo: "
				+ contaDaMarcela.saldo);
		
		System.out.println("Titular: " + contaDoPaulo.titular.nome + ", Saldo: "
				+ contaDoPaulo.saldo);
	}
}