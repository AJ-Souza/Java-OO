package bytebank;

public class TestaContas {

	public static void main(String[] args) throws SaldoInsuficienteException {
		ContaCorrente cc1 = new ContaCorrente(123, 978);
		cc1.deposita(100.0);
		cc1.saca(40.0);
		
		System.out.println("Conta nr: " + cc1.getNumero() + ", tem no momento o saldo de R$" + cc1.getSaldo());

		ContaPoupanca cp1 = new ContaPoupanca(741, -369);
		cp1.deposita(200.0);

		cc1.transfere(10.0, cp1);

		System.out.println("Conta nr: " + cp1.getNumero() + ", tem no momento o saldo de R$" + cp1.getSaldo());
	}

}
