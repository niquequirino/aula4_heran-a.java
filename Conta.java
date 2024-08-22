package entidade;

import entidade.enums.Cores;

public class Conta {
	
	private String nome;
	private int numero;
	private double saldo;
	private Cores cor;
	
	
	
	public Conta(String nome, int numero, double saldo, Cores cor) {
		super();
		this.nome = nome;
		this.numero = numero;
		this.saldo = saldo;
		this.cor = cor;
	}
	
	public void sacar(double saque) {
		saldo = saldo - saque;
	}
	
	public void deposito(double depositar) {
		saldo = saldo + depositar;
	}
	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public int getNumero() {
		return numero;
	}



	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Conta [nome=" + nome + ", numero=" + numero + ", saldo=" + saldo + ", cor=" + cor + "]";
	}

	public String agua() {
		// TODO Auto-generated method stub
		return null;
	}

}
