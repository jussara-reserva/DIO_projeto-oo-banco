package main;

import banco.Banco;
import banco.Conta;
import banco.ContaCorrente;
import banco.ContaPoupanca;
import banco.Titular;

public class Main {
	public static void main(String[] args) {
		
		Banco banco = new Banco("Banco DIO");
		
		Titular titular = new Titular("Maria", "12345678900");
		
		Conta contaCorrente = new ContaCorrente(titular);
		banco.adicionarConta(contaCorrente);
		Conta contaPoupanca = new ContaPoupanca(titular);
		banco.adicionarConta(contaPoupanca);
		
		contaCorrente.depositar(100);
		contaCorrente.transferir(5, contaPoupanca);
		
		contaPoupanca.imprimirExtrato();
		contaCorrente.imprimirExtrato();
		
		banco.imprimirQuantidadeContas();
	}
}
