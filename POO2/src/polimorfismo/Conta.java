package polimorfismo;

public class Conta {
	protected String numero;
	protected String titular;
	protected double saldo = 0;
	
	public Conta (String numero, String titular, double saldo) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public void depositar(double valor) {
		saldo = saldo + valor;
		System.out.println("Depósito realizado!");
		System.out.println("O novo saldo é: "+saldo);
	}
	public void sacar (double valor) {
		if (valor <= saldo) {
			saldo = saldo - valor;
			System.out.println("Saque realizado!");
			System.out.println("O novo saldo é: "+saldo);
		}else {
			System.out.println("Saldo insuficiente...");
		}
	}
	public void exibirInfo () {
		System.out.println("Conta: "+numero);
		System.out.println("Titular: "+titular);
		System.out.println("Saldo: "+saldo);
	}
	
	
	

}