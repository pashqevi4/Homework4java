package homework4java;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;
import java.util.*;

//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

public class task2 {
    public static void main(String[] args) {
        System.out.println(Reverse(createArray(10, 1, 15)));
    }
    static Integer[] createArray(int size, int min, int max){
        Integer[] arr = new Integer[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*(max-min+1)+min);
            
        }
        return arr;
    }

    static LinkedList<Integer> Reverse(Integer[] list){
        LinkedList<Integer> list1 = new LinkedList<>(Arrays.asList(list));
        System.out.println(list1);
        int size = list1.size();
        Stack <Integer> stack = new Stack<>();
        for (int i = 0; i < size; i++) {
            stack.push(list1.poll());
        }
        for (int i = 0; i < size; i++) {
            list1.addLast(stack.pop());
        }
        return list1;

    }
}
