package com.example.pocitaniprumeruznamek;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MathUtils {


    public static List<Integer> randomGenerator(Integer numberOfMarks) {
        numberOfMarks = 5;
        List<Integer> marks = new ArrayList<>();
        Random random = new Random();

        System.out.println();

        for (int i = 0; i < numberOfMarks; i++) {
            int randomNumber = random.nextInt(5) + 1;
            marks.add(randomNumber);
        }
        return marks;
    }
}








