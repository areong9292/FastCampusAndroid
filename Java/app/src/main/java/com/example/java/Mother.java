package com.example.java;

public class Mother extends Human{

    public Mother() {

    }

    public void cook() {
        System.out.println("요리한다");
    }

    @Override
    public void eat() {
        // 부모 eat 실행
        // super.eat(); // = Human.eat()
        System.out.println("적게 먹는다");
    }
}
