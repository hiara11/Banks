package com.br.senac;
public class InvesteFacil {
	double saldoInvesteFacil;

	public void investir(Conta conta, double valor) {

		this.saldoInvesteFacil += valor;
		conta.saldo -= valor;

	}

	public void retirarValor(Conta conta, double valor) {
		if (valor <= this.saldoInvesteFacil) {
			this.saldoInvesteFacil -= valor;
			conta.saldo += valor;
		}

	}

	public void ExibirSaldo() {
		System.out.println(this.saldoInvesteFacil);
	}
}