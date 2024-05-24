package com.tindulkar.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FP01Functional {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 12, 14, 15, 17, 18, 19, 21, 23);
        printAllNumberFunctional(numbers);
        System.out.println("====================printEvenNumberFunctional=======================\n");
        printEvenNumberFunctional(numbers);
        System.out.println("=====================printOddNumberFunctional======================\n");
        printOddNumberFunctional(numbers);

        List<String> courses =
                List.of("Spring", "SpringBoot", "API", "Microservices",
                        "AWS", "PCF", "Azure", "Docker", "Kubernetes", "Spring");
        System.out.println("===================printAllCourses========================\n");
        printAllCourses(courses);
        System.out.println("=====================printSpringCourses======================\n");
        printSpringCourses(courses);
        System.out.println("=====================print4LetterCourses======================\n");
        print4LetterCourses(courses);
        System.out.println("=====================printEvenNumberSquares======================\n");
        printEvenNumberSquares(numbers);
        System.out.println("====================printEachCourseLength=======================\n");
        printEachCourseLength(courses);
        System.out.println("====================printSortedCourses=======================\n");
        printSortedCourses(courses);
        System.out.println("======================printLengthConcatCourses=====================\n");
        printLengthConcatCourses(courses);
    }

    /*
        Suppose you have a list of strings and you want to filter out the strings
        that are shorter than 5 characters, convert them to uppercase,
        and then join them into a single comma-separated string.*/
    private static void printLengthConcatCourses(List<String> courses) {

       String str= courses.stream()
                .filter(course -> course.length() < 5)
                .map(course -> course.toUpperCase())
                .collect(Collectors.joining(","));
        System.out.println(str);
    }

    private static void printSortedCourses(List<String> courses) {
        courses.stream()
                .distinct()
                //.sorted(Comparator.reverseOrder())
                .sorted(Comparator.comparing(s -> s.length())) //order of the course length
                .forEach(System.out::println);
    }

    private static void printEachCourseLength(List<String> courses) {
        courses.stream()
                .map(course -> course.length())
                .forEach(System.out::println);
    }

    private static void printEvenNumberSquares(List<Integer> numbers) {
        List<Integer> result = numbers.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * number)
                .collect(Collectors.toList());
        result.forEach(System.out::println);
    }

    private static void print4LetterCourses(List<String> courses) {
        courses.stream()
                .distinct()
                .filter(course -> course.length() > 4)
                .forEach(System.out::println);
    }

    private static void printSpringCourses(List<String> courses) {
        courses.stream()
                .distinct()
                .filter(course -> course.contains("Spring"))
                .forEach(System.out::println);
    }

    private static void printAllCourses(List<String> courses) {
        courses.stream()
                .forEach(System.out::println);
    }

    private static void printOddNumberFunctional(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number % 2 == 1)
                .forEach(System.out::println);
    }

    private static void printEvenNumberFunctional(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number % 2 == 0)
                .forEach(System.out::println);
    }

    private static void printAllNumberFunctional(List<Integer> numbers) {
        numbers.stream().forEach(System.out::println);
    }
}
