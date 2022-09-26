package bytebank;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int numeroDaConta) {
		super(agencia, numeroDaConta);
		}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}

}
