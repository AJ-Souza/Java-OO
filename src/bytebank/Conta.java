package bytebank;
public abstract class Conta {
	protected double saldo;
	private int agencia;
	private int numero;
	private static int total = 0;
	
	public Conta(int agencia, int numeroDaConta) {
		total ++;
		this.agencia = agencia;
		this.numero = numeroDaConta;
		System.out.println("Nova Conta criada");
	}
	
	public static int getTotal() {
		return total;
	}

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

	public abstract void deposita(double valor);

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
