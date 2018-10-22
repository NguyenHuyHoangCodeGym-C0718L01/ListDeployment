package com.company;

import java.util.Random;

public class MyListTest {
    public static void main(String[] args){
        MyList<Integer> myList = new MyList<>();
        for(int i = 0; i < 10; i++){
            myList.add(i);
        }
        Random random = new Random();
        System.out.println(myList.get(random.nextInt(9)));

        myList.add(1);
        System.out.println();
    }
}
