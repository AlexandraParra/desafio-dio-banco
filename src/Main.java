import java.util.ArrayList;
import java.util.List;

import Entidades.Banco;
import Entidades.Cliente;
import Entidades.Conta;
import Entidades.ContaCorrente;
import Entidades.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		
		Banco banco = new Banco("Banco Digital Innovation One");
		
		Cliente c1 = new Cliente("Alexandra");
		
		Cliente c2 = new Cliente("Ana");
		
		Conta cc = new ContaCorrente(c1);
		cc.deposito(100.00);
		Conta cp = new ContaPoupanca(c2);
		cc.transferencia(75.00, cp);
		cc.imprimirExtrato();
		System.out.println();
		cp.imprimirExtrato();
		System.out.println();

		banco.adicionarConta(cc);
		banco.adicionarConta(cp);
		
		System.out.println("Lista  das  contas que  pertencem ao");
		System.out.println("=== " + banco.getNome() + " ===");
		System.out.println();
		int i = 1;
		for (Conta conta : banco.getContas()) {
			System.out.println("Dados da conta Nº " + i);
			System.out.println(conta);
			i++;
			System.out.println();
		}
		

	}

}
