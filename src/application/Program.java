package application;

import java.util.Locale;
import java.util.Scanner;

import model.service.BankAccount;

public class Program {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("----Cadastro---");
		System.out.println("Por favor, digite o número da Agência: ");
		String bankBranch = sc.next();

		System.out.println("Agora digite o número da Conta: ");
		int accountNumber = sc.nextInt();

		System.out.println("Agora digite o nome do titular: ");
		sc.nextLine();
		String clientName = sc.nextLine();
		
		System.out.println("Digite seu saldo: ");
		Double balance = sc.nextDouble();

		BankAccount bankAccount = new BankAccount(accountNumber, bankBranch, clientName, balance);

		System.out.println("Olá " + bankAccount);

		sc.close();
	}
}
