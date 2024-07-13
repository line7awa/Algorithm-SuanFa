package com.linjh.dome240709;

public class WithdrawTask implements Runnable{

    private BankAccount account;
    private double amount;

    public WithdrawTask(BankAccount account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.withdraw(amount);
    }
}
