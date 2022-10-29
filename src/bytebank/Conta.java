package bytebank;

public abstract class Conta {
	protected double saldo;
	private int agencia;
	private int numero;
	private static int total = 0;

	public Conta(int agencia, int numeroDaConta) {
		
		total++;
		this.agencia = agencia;
		this.numero = numeroDaConta;
		//System.out.println("Nova Conta criada");
		
		if (this.agencia < 1) {
			throw new IllegalArgumentException("Agencia inválida");
		}
		if (this.numero < 1) {
			throw new IllegalArgumentException("Numero da Conta inválida");
		}
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

	public void saca(double valor) throws SaldoInsuficienteException {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo Atual: " + this.saldo + ", Valor a Ser Sacado: " + valor);
		}
		this.saldo -= valor;
	}

	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		this.saca(valor);
		destino.deposita(valor);
	}
}
