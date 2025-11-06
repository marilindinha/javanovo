package Lista22;

public class ContaBancariaP {

    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria();
        conta.titular = "Mariana Correia";
        conta.saldo = 500.00;

        conta.mostrarSaldo();

        conta.depositar(250.00);
        conta.mostrarSaldo();

        conta.sacar(600.00); 
        conta.mostrarSaldo();

        conta.sacar(100.00); 
        conta.mostrarSaldo();
    }
}
