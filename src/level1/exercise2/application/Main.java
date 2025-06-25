package level1.exercise2.application;

import level1.exercise2.model.ListReverImplement;
import level1.exercise2.model.ListReverser;

import java.util.List;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        ListReverser reverser = new ListReverImplement();

        List<Integer> origiList = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> reverseList = reverser.reverseList(origiList);

        System.out.println("Original list: " + origiList);
        System.out.println("Reverse list: " + reverseList);
    }
}
