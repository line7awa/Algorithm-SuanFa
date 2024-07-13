package com.linjh.dome240709;

/**
 *@author: junhang
 *@createtime: 2024/7/9 23:31
 *@description: 采用synchronized来实现锁的机制
 **/
public class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public synchronized void deposit(double amount) {
        balance += amount;
    }

    public synchronized void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}
