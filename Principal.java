package aplicacao;

import java.util.ArrayList;
import java.util.List;

import entidade.Conta;
import entidade.ContaComercial;
import entidade.enums.Cores;

public class Principal {

	public static void main(String[] args) {
		
		ContaComercial cc = new ContaComercial("Fiama", 1937, 0, Cores.BLACK , 0);
		
		cc.deposito(100);
		
		System.out.println(cc.agua());
		
		List<Conta> lista = new ArrayList<>();
		lista.add(cc);
		
		System.out.print(lista);
	}

}
