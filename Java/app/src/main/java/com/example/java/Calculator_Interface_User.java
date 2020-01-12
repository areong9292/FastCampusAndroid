package com.example.java;

public class Calculator_Interface_User {
    public static void main(String[] args)
    {
        // 이렇게 먼저 작업
        //Calculator_Fake calculatorFake = new Calculator_Fake();

        // 이후에 리얼이 완성되면 리얼로 바꿈
        Calculator_Real calculatorFake = new Calculator_Real();

        // 두 클래스가 모두 Calculator 인터페이스를 구현 중이므로
        // 이 밑에 꺼를 바꿀 필요가 없다
        calculatorFake.sum();
        calculatorFake.by();
        calculatorFake.multiple();
        calculatorFake.minus();
    }
}
