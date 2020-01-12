package com.example.java;

public class Car_Use {
    public static void main(String[] args)
    {
        Car normalCar = new Car(4, "일반 엔진", "브레이크", "핸들");
        Car superCar = new Car(4, "슈퍼 엔진", true, "브레이크", "핸들");

        normalCar.goForward();
        superCar.goBackward();
        superCar.isSuperCar();
    }
}
