package entidade;

import entidade.enums.Cores;

public class ContaPoupanca extends Conta{
	
	private String nome;
    private double saldo;
    
    

    
    public ContaPoupanca(String nome, int numero, double saldo, Cores cor, String nome2, double saldo2) {
		super(nome, numero, saldo, cor);
		nome = nome2;
		saldo = saldo2;
	}

   
    public void depositar(double deposito) {
        if (deposito > 0) {
            saldo += deposito;
            System.out.println("Depósito de R$" + deposito + " realizado.");
        }
    }

    public void sacar(double saque) {
        if (saque > 0 && saque <= saldo) {
            saldo -= saque;
            System.out.println("Saque de R$" + saque + " realizado.");
        } else {
            System.out.println("Saque não realizado. Saldo insuficiente.");
        }
    }

    
    public double getSaldo() {
        return saldo;
    }

   
    public String getNome() {
        return nome;
    }
}



