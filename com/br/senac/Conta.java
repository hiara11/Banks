package com.br.senac;

public class Conta {
	public int numero = 1231;
	public int agencia = 001;
	public double saldo;
	public Cliente titular;
	public CartaoDeCredito cartaoDeCredito;
	public String senha;
	public String usuario;
	public InvesteFacil Investefacil;

	public void saca(double valor) {
		if (valor <= this.saldo) {
			this.saldo -= valor;
			System.out.println("Saque feito com sucesso!");
		} else {
			System.out.println("Saldo Insuficiente!");
		}
	}

	public void deposita(double valor) {
		this.saldo += valor;
		System.out.println("Depósito feito com sucesso!");
	}

	public void transfere(Conta recebe, double valor1) {
		if (valor1 <= this.saldo) {
			this.saldo -= valor1;
			recebe.saldo = +valor1;
		}
	}

	public void cadastrarSenha(String senha) {
		this.senha = senha;
	};

	public boolean autenticaSenha(String senha, String usuario) {
		if (this.senha.equals(senha) && this.usuario.equals(usuario)) {
			System.out.println("Logado com sucesso!");
			return true;
		} else {
			System.out.println("Senha errada ou login incorretos!");
			return false;
		}
	}

	public void alteraSenha(String senhaAntiga, String novaSenha, String usuario) {
		if (autenticaSenha(senhaAntiga, usuario) == true) {
			cadastrarSenha(novaSenha);
			System.out.println("Senha alterado com sucesso!");
		} else {
			System.out.println("Senha incorreta, tente novamente");
		}
	};

	public void exibeDados() {
		System.out.println("Numero: " + this.numero);
		System.out.println("Agencia: " + this.agencia);
		System.out.println("Banco: 342");
	}

	public void exibeSaldo() {
		System.out.println("O seu saldo é:" + this.saldo);
	}

}