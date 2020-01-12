package com.example.java;

import java.util.ArrayList;

public class MiddleHomework1 {
    public static void main1(String[] args)
    {
        ArrayList<Integer> first = new ArrayList<Integer>();
        ArrayList<Boolean> second = new ArrayList<Boolean>();

        for(int i = 0; i < 10; i++)
        {
            first.add(i);
        }

        for(int i = 0; i < first.size(); i++)
        {
            if(first.get(i) < 5)
            {
                second.add(true);
            }
            else
            {
                second.add(false);
            }
        }

        System.out.println(first);
        System.out.println(second);
    }
}
