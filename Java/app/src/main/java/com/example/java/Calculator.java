package com.example.java;

public class Calculator {
    int result;

    public Calculator(int init)
    {
        this.result = init;
    }

    public void add(int addition)
    {
        result = result + addition;
        minusCheck();
    }

    public void minus(int minus)
    {
        result = result - minus;
        minusCheck();
    }

    public void multiple(int multi)
    {
        result = result * multi;
    }

    public void by(int by)
    {
        result = result / by;
        minusCheck();
    }

    public void percent(int percent)
    {
        result = result % percent;
        minusCheck();
    }

    public void minusCheck()
    {
        if(result < 0)
            result = 0;
    }

    public void getResult()
    {
        System.out.println(result);
    }
}
