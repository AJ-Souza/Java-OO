package bytebank;

public class ContaCorrente extends Conta {

	public ContaCorrente(int agencia, int numeroDaConta) {
		super(agencia, numeroDaConta);
		}
	@Override
	public void saca(double valor) {
		double valorASacar = valor + 0.2;
		super.saca(valorASacar);
	}
}