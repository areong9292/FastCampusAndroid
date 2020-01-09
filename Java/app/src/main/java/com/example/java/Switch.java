package com.example.java;

public class Switch {
    public static void main(String[] args)
    {
        int money = 10000;
        switch (money)
        {
            case 10000:
                System.out.println("돈까스를 먹는다");
                break;
            case 5000:
                System.out.println("국밥을 먹는다");
                break;
            case 1000:
                System.out.println("라면을 먹는다");
                break;
            default:
                System.out.println("먹지 않는다");
                break;
        }
    }
}
