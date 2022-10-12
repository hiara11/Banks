package com.br.senac;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String usuario = " ";
		Cliente cliente = new Cliente();
		Conta conta = new Conta();
		InvesteFacil investeFacil = new InvesteFacil();
		conta.Investefacil = investeFacil;
		
		int opcao = 0;
		double valor;

		Scanner sc = new Scanner(System.in);
		System.out.println("***********");
		System.out.println("                         Bem vindo ao Banco Banks");
		System.out.println("***********");

		while (opcao != 9) {
			System.out.println("1 - Efetuar Login");
			System.out.println("2 - Cadastrar no Sistema");
			System.out.println("9 - Sair");
			opcao = sc.nextInt();

			if (opcao == 1) {
				System.out.println("informe seu usuario");
				usuario = sc.next();
				System.out.println("informe sua senha");
				String senha = sc.next();
				if (conta.autenticaSenha(senha, usuario) == true) {
					System.out.println("Logado com: " + conta.usuario);
					System.out.println();
					while (opcao != 9) {
						System.out.println("");
						System.out.println("Digite a opcao que deseja:");
						System.out.println("1 - Exibir saldo");
						System.out.println("2 - Sacar");
						System.out.println("3 - Depositar");
						System.out.println("4 - Dados Bancários");
						System.out.println("5 - Mudar senha");
						System.out.println("6 - Depositar Investe Facil");
						System.out.println("7 - Retirar Investe Facil");
						System.out.println("8 - Exibir Saldo Investe Facil");
						System.out.println("9 - Sair");
						opcao = sc.nextInt();
						if (opcao == 1) {
							conta.exibeSaldo();
						} else if (opcao == 2) {
							System.out.println("Digite o valor a ser sacado: ");
							valor = sc.nextDouble();
							conta.saca(valor);
						} else if (opcao == 3) {
							System.out.println("Digite o valor a ser depositado: ");
							valor = sc.nextDouble();
							conta.deposita(valor);
						} else if (opcao == 4) {
							conta.exibeDados();

						} else if (opcao == 5) {
							System.out.println("Digite primeiro a senha antiga, depois a senha nova e por fim o usuario");
							conta.alteraSenha(sc.next(), sc.next(), sc.next());
						} else if (opcao == 6) {
							System.out.println("Digite o valor a ser depositado: ");
							conta.Investefacil.investir(conta, sc.nextDouble());
						} else if (opcao == 7) {
							System.out.println("Digite o valor a ser retirado: ");
							conta.Investefacil.retirarValor(conta, sc.nextDouble());
						} else if (opcao == 8) {
							conta.Investefacil.ExibirSaldo();
						}
					}
				}
			} else if (opcao == 2) {

				System.out.println("informe seu nome");
				cliente.nome = sc.next();
				System.out.println("informe seu cep");
				cliente.cep = sc.nextInt();
				System.out.println("informe seu complemento");
				cliente.complemento = sc.next();
				System.out.println("informe seu numero");
				cliente.numero = sc.nextInt();
				System.out.println("informe sua rua");
				cliente.rua = sc.next();
				System.out.println("informe seu cpf");
				cliente.cpf = sc.next();
				System.out.println("Informe sua profissão");
				cliente.profissao = sc.next();
				System.out.println("Informe sua renda");
				cliente.renda = sc.nextDouble();
				System.out.println("Digite agora o seu usuario: ");
				conta.usuario = sc.next();
				System.out.println("Digite a senha da sua conta: ");
				conta.senha = sc.next();
				conta.titular = cliente;

				System.out.println("Criado com sucesso!");
				System.out.println("");

			} else if (opcao == 9) {
				System.out.println("Volte sempre!");
				break;
			}

		}
		sc.close();
	}
	}