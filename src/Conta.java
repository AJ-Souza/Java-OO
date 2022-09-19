public class Conta {
	double saldo;
	int agencia;
	int numero;
	Cliente titular;

	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public void saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("Saque realizado com Sucesso");
		} else {
			System.out.println("Saldo Insuficiente");
		}
	}
	
	public void transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.saldo += valor;
			System.out.println("Transferencia realizada com sucesso");
		} else {
			System.out.println("Saldo Insuficiente");
		}
	}
}
