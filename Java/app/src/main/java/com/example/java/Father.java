package com.example.java;

public class Father extends Human{

    public Father() {

    }

    public void work() {
        System.out.println("일한다");
    }

    @Override
    public void eat() {
        // 부모 eat 실행
        // super.eat(); // = Human.eat()
        System.out.println("많이 먹는다");
    }

    // Human의 wash를 덮어씌움
    public void wash(String sampoo)
    {
        System.out.println("샴푸로 샤워한다");
    }
}
