package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidade.Conta;
import entidade.ContaComercial;
import entidade.ContaPoupanca;
import entidade.enums.Cores;

public class Principal {

	public static void main(String[] args) {

		System.out.println("Bem-Vindo ao Banco do Santander ");
		
		Scanner sc = new Scanner(System.in);
		List<Conta> lista = new ArrayList<>();
		
		System.out.print("Quantas contas você deseja cadastrar? ");
		int n = sc.nextInt();
		
		for(int i= 1; i <= n ; i++) {
			System.out.print("Selecione C para Conta Corrente ou P para Poupança");
			String x = sc.next();
			if(x.equals("C")) {
				
			System.out.println("Digite o nome do dono da conta: ");
			String nome = sc.next();
			System.out.println("Digite o numero da conta: ");
			int numero = sc.nextInt();
			System.out.println("Digite o saldo: ");
			double saldo = sc.nextDouble();
			System.out.print("Digite o limite: ");
			double limite = sc.nextDouble();
			
			Conta conta = new Corrente(nome, numero, saldo, limite);
			
			lista.add(conta);
		}
		else {
			System.out.println("Digite o nome do dono da conta: ");
			String nome = sc.next();
			System.out.println("Digite o numero da conta: ");
			int numero = sc.nextInt();
			System.out.println("Digite o saldo: ");
			double saldo = sc.nextDouble();
			
			lista.add(new Poupanca(nome, numero, saldo));
		}
			
			for(Conta r : lista) {
				System.out.println(r);
			}
	  }
	}
}
