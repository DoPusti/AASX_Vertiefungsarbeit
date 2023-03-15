package org.example;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public static int calculator(int num1, char operator, int num2) {
        switch (operator) {
            case '*' : return num1 * num2;
            case '/' : if(num2==0) {return 0 ; }else {return num1 / num2;}
            case '+' : return num1 + num2;
            case '-' : return num1 - num2;

        }
        return 0;

    }
    // Anzahl von trues in einem Array
    public static int countTrue(boolean[] arr) {
        Stream<Boolean> stream = Booleans.asList(arr).stream();
        return (int)Arrays.stream(arr)
                .filter(c -> c!=null && c)
                .count();
    }
}