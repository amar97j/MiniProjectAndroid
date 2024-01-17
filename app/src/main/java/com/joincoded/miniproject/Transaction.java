package com.joincoded.miniproject;

import java.io.Serializable;

public class Transaction implements Serializable {
    private int id;
    private String date;

    private TransactionType type;
    private double amount, balance;
    private int account;


    public Transaction(int id, String date, double amount, double balance, int account, TransactionType type) {
        this.id = id;
        this.date = date;
        this.amount = amount;
        this.balance = balance;
        this.account = account;
        this.type = type;
    }


    public int getId() {
        return id;
    }



    public String getDate() {
        return date;
    }




    public double getAmount() {
        return amount;
    }


    public double getBalance() {
        return balance;
    }



    public int getAccount() {
        return account;
    }



    public TransactionType getType() {
        return type;
    }


}
