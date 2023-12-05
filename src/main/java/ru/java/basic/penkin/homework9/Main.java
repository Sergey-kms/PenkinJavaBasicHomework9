package ru.java.basic.penkin.homework9;

import java.util.ArrayList;

public class Main {         // В гитхаб vetka1
    public static void main(String[] args) {
        ArrayList<Integer> sequence = generateSequence(1, 15);
        System.out.println(sequence);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(10);
        numbers.add(1);
        numbers.add(25);
        System.out.println(sumNumbersGreaterThan5(numbers));

        ArrayList<Integer> list = new ArrayList<>();
        list.add(9);
        list.add(5);
        list.add(2);
        list.add(7);
        System.out.println(list);
        fillListWithNumber(list, 1);
        System.out.println(list);

        ArrayList<Integer> numbersList = new ArrayList<>();
        numbersList.add(25);
        numbersList.add(12);
        numbersList.add(30);
        numbersList.add(58);
        System.out.println(numbersList);
        increaseListNumbers(numbersList, 20);
        System.out.println(numbersList);
    }

    public static ArrayList<Integer> generateSequence(int min, int max) {
        ArrayList<Integer> sequence = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            sequence.add(i);
        }
        return sequence;
    }

    public static int sumNumbersGreaterThan5(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            if (number > 5) {
                sum += number;
            }
        }
        return sum;
    }

    public static void fillListWithNumber(ArrayList<Integer> list, int number) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, number);
        }
    }

    public static void increaseListNumbers(ArrayList<Integer> list, int increaseBy) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + increaseBy);
        }
    }
}