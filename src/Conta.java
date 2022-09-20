public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	Cliente titular;

	public double getSaldo() {
		return saldo;
	}

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
