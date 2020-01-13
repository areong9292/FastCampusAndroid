package com.example.java.FinalAssignment;

public class Customer {

    Account account;
    public Customer(Account account)
    {
        this.account = account;
    }

    // 손님이 가진 계좌의 잔액을 리턴
    public int checkAccount()
    {
        return account.money;
    }
}
