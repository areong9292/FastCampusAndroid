package com.example.java;

import java.util.ArrayList;

public class Array_ {
    public static void main1(String[] args)
    {
        // reference 만 가능
        // int x, Integer o

        // 타입 지정해서 생성
        ArrayList<Integer> ints = new ArrayList<Integer>();

        // 타입 지정 없이 생성
        ArrayList ints2 = new ArrayList();

        // 지정한 int만 들어올 수 있다
        ints.add(2);
        ints.add(3);

        System.out.println(ints);

        // 다양한 자료형을 넣을 수 있다
        ints2.add(2);
        ints2.add(3);
        ints2.add(true);

        System.out.println(ints2);

        for(int i = 0; i < ints.size(); i++)
        {
            if(ints.get(i) == 2)
            {
                System.out.println("2를 찾았다");
            }
        }

        ints.remove(0);
        System.out.println(ints);
    }
}
