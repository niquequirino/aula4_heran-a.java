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

		Scanner src = new Scanner(System.in);
		
		System.out.println("Digite o nome da conta");
		String nome = src.next();
		
		System.out.println("Digite o saldo da conta: ");
		double saldo = src.nextDouble();
		
		System.out.println("Digite o numero da conta: ");
		int numero = src.nextInt();
		
		System.out.println("Cor: ");
		int cor = src.nextInt();
		
		System.out.println("Limite da conta: ");
		double limite = src.nextDouble();
		
		System.out.println("Digite [1] cor black, [2] cor pink, [3] cor red ");
	
		int numCores = src.nextInt();
		
		List<Conta> lista = new ArrayList<>();
		
		
		if( numCores == 1) {
			ContaComercial cc = new ContaComercial(nome, numero, limite, Cores.BLACK, 0);
			lista.add(cc);
			
		}else if(numCores == 2) {
			ContaComercial cc = new ContaComercial(nome, numero, limite, Cores.PINK, 0);
			lista.add(cc);
			
		}else if(numCores == 3) {
			ContaComercial cc = new ContaComercial(nome, numero, limite, Cores.RED, 0);
			lista.add(cc);
		}
		
		if (numCores == 1) {
			ContaPoupanca cp = new ContaPoupanca(nome, numero, limite, Cores.BLACK);
			lista.add(cp);
			
		}
		else if(numCores == 2) {
			ContaPoupanca cp = new ContaPoupanca(nome, numero, limite, Cores.PINK);
			lista.add(cp);
		}
		else if(numCores == 3) {
			ContaPoupanca cp = new ContaPoupanca(nome, numero, limite, Cores.RED);
			lista.add(cp);
		}
		
		System.out.println("Digite a conta que você quer: ");
		for(Conta  e: lista) {
			if(("Comercial").toLowerCase() != null) {
				System.out.println(lista.get(1));
				break;
			}
			else if(("Poupança").toLowerCase() != null);
			System.out.println(lista.get(2));
			break;
		}
	}

}
		
