package banco;

public abstract class Conta implements InterfaceConta {
	
	private static final int AGENCIA_PADRAO = 1;
	private static int NUMERO_CONTA = 1;
	
	public Conta(Titular titular) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = Conta.NUMERO_CONTA;
		Conta.NUMERO_CONTA += 1;
		
		this.titular = titular;
	}
	
	private int agencia;
	private int numero;
	private double saldo;
	private Titular titular;
	
	@Override
	public void sacar(double valor) {
		this.saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	public int getAgencia() {
		return this.agencia;
	}

	public int getNumero() {
		return this.numero;
	}

	public double getSaldo() {
		return this.saldo;
	}
	
	public Titular getTitular() {
		return titular;
	}

	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s - %s", this.titular.getNome(), this.titular.getCpf()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: R$ %.2f\n", this.saldo));
	}
	
}
