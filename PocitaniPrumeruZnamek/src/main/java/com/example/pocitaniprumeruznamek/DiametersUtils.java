package com.example.pocitaniprumeruznamek;

import java.util.List;

public class DiametersUtils {

    public static double calculateMarkDiameter(List<Integer> numbers) {
        double number = 0;
        for (int i = 0; i < numbers.size(); i++) {
            number = number + numbers.get(i);
        }

        return number / numbers.size();
    }
}
