package bytebank;

public class TesteSaca {

	public static void main(String[] args) {
		ContaCorrente c = new ContaCorrente(123, 321);

		c.deposita(200);

		try {
			c.saca(210);
		} catch (SaldoInsuficienteException e) {
			System.out.println("Problema: " + e.getMessage());
		}

		System.out.println("Saldo da Conta: " + c.getSaldo());

	}
}
