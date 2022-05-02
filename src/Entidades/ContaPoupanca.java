package Entidades;

public class ContaPoupanca extends Conta{
	
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}
	
	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirInfosComuns();
	}

	@Override
	public String toString() {
		return "Tipo de conta: POUPANÇA" +
				"\nTitular: " + cliente.getNome() +
				"\nAgência: " + agencia +
				"  Número: " + numero;
	}
	
}
