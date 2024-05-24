package com.tindulkar.streams;

import java.util.List;

public class FP01Structured {
    public static void main(String[] args) {
        List<Integer> integers = List.of(10, 12, 14, 15, 17, 18, 19, 21, 23);
        printAllNumberStructured(integers);
        printEvenNumberStructured(integers);
    }

    private static void printEvenNumberStructured(List<Integer> integers) {
        for(int number: integers)
        {
            if(number%2==0)
            {
                System.out.println(number);
            }
        }
    }

    private static void printAllNumberStructured(List<Integer> integers) {
        for (int i : integers)
        {
            System.out.println(i);
        }
    }
}
