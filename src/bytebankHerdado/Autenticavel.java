package bytebankHerdado;

public interface Autenticavel {
	public abstract void setSenha(int senha);
	
	public abstract boolean autentica(int senha);
}
