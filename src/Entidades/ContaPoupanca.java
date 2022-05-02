package Entidades;

public class ContaPoupanca extends Conta{
	
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}
	
	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupan�a ===");
		super.imprimirInfosComuns();
	}

	@Override
	public String toString() {
		return "Tipo de conta: POUPAN�A" +
				"\nTitular: " + cliente.getNome() +
				"\nAg�ncia: " + agencia +
				"  N�mero: " + numero;
	}
	
}
