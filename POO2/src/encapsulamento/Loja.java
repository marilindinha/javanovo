package encapsulamento;

public class Loja {
	private String nome ;
	private double preco;
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
	if(preco >= 0) {
		this.preco = preco;
	}else {
		System.out.println("valor incorreto");
	}
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}


	}
