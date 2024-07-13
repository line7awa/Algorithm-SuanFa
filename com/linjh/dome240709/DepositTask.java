package com.linjh.dome240709;

/**
 *@author: junhang
 *@createtime: 2024/7/9 23:41
 *@description: 存款任务
 **/
public class DepositTask implements Runnable{

    private BankAccount account;
    private double amount;

    public DepositTask(BankAccount account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.deposit(amount);
    }
}
