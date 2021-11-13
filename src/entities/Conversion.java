package entities;

public class Conversion {

	public double valorDoDolar;
	public double quantidadeDeDolares;
	public double total;
	public double iof;

	public double valor() {
		return valorDoDolar;
	}

	public double dolar() {
		return quantidadeDeDolares;
	}

	public double total() {
		return valorDoDolar * quantidadeDeDolares * 0.06 + valorDoDolar * quantidadeDeDolares;
	}
	
	public double iof() {
		return valorDoDolar * quantidadeDeDolares * 0.06;
	}

}
