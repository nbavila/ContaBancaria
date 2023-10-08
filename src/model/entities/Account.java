package model.entities;

import model.exceptions.BusinessExceptions;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    // Construtor padrão vazio.
    public Account() {
    }

    // Construtor personalizado com parâmetros.
    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    // Métodos getters e setters para acessar e modificar os atributos da conta.

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    // Método para realizar um depósito na conta.
    public void deposit(double amount) {
        balance += amount;
    }

    // Método para realizar um saque na conta.
    public void withdraw(double amount) {
        validateWithdraw(amount); // Valida se o saque é possível.

        balance -= amount; // Deduz o valor do saldo.
    }

    // Método privado para validar um saque.
    private void validateWithdraw(double amount) {
        if (amount > getWithdrawLimit()) {
            // Lança uma exceção se a quantia a ser sacada exceder o limite de saque.
            throw new BusinessExceptions("A quantia excede o limite de saque");
        }
        if (amount > balance) {
            // Lança uma exceção se o saldo for insuficiente para o saque.
            throw new BusinessExceptions("Saldo insuficiente");
        }
    }
}
