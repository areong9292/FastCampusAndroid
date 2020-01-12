package com.example.java;

public class Son extends Human{

    public Son() {

    }

    public void study() {
        System.out.println("공부한다");
    }

    @Override
    public void eat() {
        // 부모 eat 실행
        // super.eat(); // = Human.eat()
        System.out.println("매우 많이 먹는다");
    }
}
