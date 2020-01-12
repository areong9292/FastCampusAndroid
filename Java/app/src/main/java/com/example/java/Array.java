package com.example.java;

public class Array {
    public static void main(String[] args)
    {
        // 명시적으로 배열의 크기 지정
        boolean[] booleans = new boolean[4];
        int[] ints = new int[4];

        // 요소를 미리 넣어서 배열의 크기 지정
        boolean[] booleans2 = {true, false, true, false};
        int[] ints1 = {1, 2, 3, 4};
        //System.out.println(booleans2.length);

        // 위에서 만든 배열에 값 넣기
        booleans[0] = true;
        booleans[1] = false;
        booleans[2] = false;
        booleans[3] = true;

        int first = ints1[0];
        int second = ints1[1];
        int third = ints1[2];
        int fourth = ints1[3];

        /*
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);
        */

        for(int i = 0; i < booleans.length; i++)
        {
            if(booleans[i] == true)
            {
                System.out.println("참");
            }
            else
            {
                System.out.println("거짓");
            }
        }

        for(int i = 0; i < ints1.length; i++)
        {
            if(ints1[i] == 1)
            {
                System.out.println("1 발견!");
            }
            else if(ints1[i] == 2)
            {
                System.out.println("2 발견!");
            }
            else
            {
                System.out.println("모르는 수 발견!");
            }
        }
    }
}
