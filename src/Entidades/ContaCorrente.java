package Entidades;

public class ContaCorrente extends Conta{

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}
	
	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}

	@Override
	public String toString() {
		return "Tipo de conta: CORRENTE" +
				"\nTitular: " + cliente.getNome() +
				"\nAgência: " + agencia +
				"  Número: " + numero;
				
	}

}
