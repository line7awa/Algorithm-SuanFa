package com.linjh.dome240709;

public class BankAccountTest {

    public static void main(String[] args) {

        BankAccount account = new BankAccount(2000.0);

        Thread thread = new Thread(new DepositTask(account, 200.0));
        Thread thread1 = new Thread(new DepositTask(account, 300.0));
        Thread thread2 = new Thread(new WithdrawTask(account, 150.0));
        Thread thread3 = new Thread(new WithdrawTask(account, 100));

        thread.start();
        thread1.start();
        thread2.start();
        thread3.start();



        try {
            thread.join();
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Final balance: " + account.getBalance());
    }



}
