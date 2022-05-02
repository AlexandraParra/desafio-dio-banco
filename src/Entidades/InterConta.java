package Entidades;

public interface InterConta {

	void saque(double valor);
	
	void deposito(double valor);
	
	void transferencia(double valor, Conta contaDestino);
	
	void imprimirExtrato();
}
