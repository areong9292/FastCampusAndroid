package com.example.java;

public class Operator {
    public static void main(String[] args)
    {
        int a;
        a = 10 % 2;
        // System.out.println(a);

        a = 5;
        // 5 = a; - error

        int b = 5;
        b += 5;
        // System.out.println(b);

        b %= 5;
        // System.out.println(b);

        int c = 5;
        int d;
        d = c++;
        // System.out.println(d);

        int e = 5;
        int f;
        f = --e;
        // System.out.println(f);

        int g = 10;
        int h = 5;
        boolean result;

        result = g > h;
        // System.out.println(result);

        boolean fac1 = true;
        boolean fac2 = false;
        boolean result2;

        result2 = fac1 == fac2;
        // System.out.println(result2);

        result2 = fac1 != fac2;
        // System.out.println(result2);

        result2 = fac1 && fac2;
        // System.out.println(result2);

        result2 = fac1 || fac2;
        // System.out.println(result2);

        result2 = !fac1;
        System.out.println(result2);
    }
}
