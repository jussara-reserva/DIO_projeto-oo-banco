package banco;

public class ContaCorrente extends Conta {

	public ContaCorrente(Titular titular) {
		super(titular);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();	
	}
	
}
