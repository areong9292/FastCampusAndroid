package com.example.java;

public class Family_Use {
    public static void main(String[] args)
    {
        Father father = new Father();
        Mother mother = new Mother();
        Son son = new Son();

        father.eat();
        mother.eat();
        son.eat();

        father.wash("샴푸");
        mother.wash();
        son.wash();
    }
}
