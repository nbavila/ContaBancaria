package application;

import model.entities.Account;
import model.exceptions.BusinessExceptions;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        // Configura o local para usar o formato de números dos EUA (ponto decimal em vez de vírgula).
        Locale.setDefault(Locale.US);

        // Cria um objeto Scanner para receber entrada do teclado.
        Scanner sc = new Scanner(System.in);

        // Solicita ao usuário que insira os dados da conta.
        System.out.println("Informe os dados da conta");
        System.out.print("Número: ");
        int number = sc.nextInt();
        System.out.print("Titular: ");
        sc.nextLine(); // Limpa a quebra de linha pendente.
        String holder = sc.nextLine();
        System.out.print("Saldo inicial: ");
        double balance = sc.nextDouble();
        System.out.print("Limite de saque: ");
        double withdrawLimit = sc.nextDouble();
        System.out.println();

        // Solicita ao usuário que informe a quantia a ser sacada.
        System.out.print("Informe uma quantia para sacar: ");
        double amount = sc.nextDouble();

        try {
            // Cria um objeto da classe Account com os dados fornecidos pelo usuário.
            Account acc = new Account(number, holder, balance, withdrawLimit);

            // Tenta realizar o saque na conta.
            acc.withdraw(amount);

            // Exibe o novo saldo após o saque bem-sucedido.
            System.out.printf("Novo saldo: %.2f%n", acc.getBalance());
        } catch (BusinessExceptions e) {
            // Captura e trata exceções de negócios (BusinessExceptions) que podem ocorrer durante o saque.
            System.out.println("Erro de saque: " + e.getMessage());
        } finally {
            // Fecha o Scanner para evitar vazamentos de recursos.
            sc.close();
        }
    }
}
