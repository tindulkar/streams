package com.tindulkar.streams;

import java.util.List;

public class FP02Functional {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(2,4,5,6,8,10,12,13,14,15);
        printSumOfNumbers(numbers);
    }
private static  int sum(int aggregate, int nextNumber)
{
    System.out.println(aggregate+" "+nextNumber);
    return (aggregate + nextNumber);
}
    private static void printSumOfNumbers(List<Integer> numbers) {
        int total=numbers.stream()
               // .reduce(0,(x,y) -> x + y);
                //.reduce(0,FP02Functional::sum);
                        .reduce(0,Integer::sum);
        System.out.println(total);    }
}
