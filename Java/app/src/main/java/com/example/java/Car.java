package com.example.java;

// 파일 명과 클래스 명이 동일 해야한다
public class Car {
    // 클래스 변수
    int tires;
    String engine;
    Boolean superEngine;
    String break_;
    String handle;

    // 생성자
    public Car(int tires, String engine, String break_, String handle)
    {
        this.tires = tires;
        this.engine = engine;
        this.break_ = break_;
        this.handle = handle;
    }

    public Car(int tires, String engine, Boolean superEngine, String break_, String handle)
    {
        this.tires = tires;
        this.engine = engine;
        this.superEngine = superEngine;
        this.break_ = break_;
        this.handle = handle;
    }

    public void goForward()
    {
        System.out.println("직진 합니다");
    }

    public void goBackward()
    {
        System.out.println("후진 합니다");
    }

    public void isSuperCar()
    {
        if(superEngine == true)
        {
            System.out.println("슈퍼카 입니다");
        }
        else
        {
            System.out.println("슈퍼카가 아닙니다");
        }
    }


}
