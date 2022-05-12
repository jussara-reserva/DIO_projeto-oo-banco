package banco;

public class Titular {
	
	private String nome;
	private String cpf;

	public Titular(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public String getNome() {
		return this.nome;
	}

	public String getCpf() {
		return cpf;
	}
	
}
