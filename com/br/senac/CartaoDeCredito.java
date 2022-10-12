package com.br.senac;
public class CartaoDeCredito {
	private double limite = 1200;
	private double fatura = 0;

	public void comprarPorCrédito(double compra) {
		if (compra <= this.limite) {
			this.limite -= compra;
			this.fatura += compra;
			System.out.println("Compra realizada com sucesso");
		} else {
			System.out.println("Limite insuficiente para a compra!");
		}
	}

	public void exibirFatura() {
		System.out.println("Fatura: " + this.fatura);
	}

	public void exibirLimite() {
		System.out.println("Limite: " + this.limite);
	}
}