package banco;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private String nome;
	private List<Conta> contas;

	public Banco(String nome) {
		this.nome = nome;
		contas = new ArrayList<Conta>();
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void adicionarConta(Conta conta) {
		this.contas.add(conta);
	}
	
	public void imprimirQuantidadeContas() {
		System.out.println(String.format("O %s posssui %d contas.", this.nome, this.contas.size()));
	}
	
}
