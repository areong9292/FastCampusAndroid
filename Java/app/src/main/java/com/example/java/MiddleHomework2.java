package com.example.java;

import java.util.ArrayList;

public class MiddleHomework2 {
    public static void main1(String[] args)
    {
        ArrayList<Integer> first = new ArrayList<Integer>();

        for(int i = 0; i < 10; i++)
        {
            first.add(i);
        }

        int odds = howManyOdds(first);

        System.out.println(first);
        System.out.println(odds);
    }

    public static int howManyOdds(ArrayList<Integer> first)
    {
        int odds = 0;
        for(int i = 0; i < first.size(); i++)
        {
            if(first.get(i) % 2 != 0)
            {
                odds++;
            }
        }

        return odds;
    }
}
