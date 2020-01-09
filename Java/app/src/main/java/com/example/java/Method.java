package com.example.java;

public class Method {

    public int plus(int a, int b)
    {
        int result;
        result = a + b;
        return result;
    }

    public void plus1(int a, int b)
    {
        int result;
        result = a + b;
    }

    public static void main1(String[] args)
    {
        Method calc = new Method();
        
        calc.plus(1,2);
        calc.plus1(30,40);

        int number1;
        int number2;

        number1 = calc.plus(100,100);
        number2 = calc.plus(50,50);

        System.out.println(number1);
        System.out.println(number2);
    }
}
