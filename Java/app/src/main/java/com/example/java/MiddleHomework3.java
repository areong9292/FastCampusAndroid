package com.example.java;

import java.util.ArrayList;

public class MiddleHomework3 {
    public static void main(String[] args)
    {
        ArrayList<Integer> first = new ArrayList<Integer>();
        ArrayList<Integer> second = new ArrayList<Integer>();

        for(int i = 0; i < 10; i++)
        {
            first.add(i);
        }

        for(int i = 9; i >= 0; i--)
        {
            second.add(i);
        }

        multipleTwoArrayLists(first, second);
    }

    public static void multipleTwoArrayLists(ArrayList<Integer> arrayList1, ArrayList<Integer> arrayList2)
    {
        for(int i = 0; i < arrayList1.size(); i++)
        {
            System.out.println(arrayList1.get(i) * arrayList2.get(i));
        }
    }
}
