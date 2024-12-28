package com.java.arrays.leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class PairSum {
    public static String PairsumBrute(ArrayList<Integer> Arr, int target) {
        for (int i = 0; i <= Arr.size(); i++) {
            for (int j = i + 1; j <= Arr.size() - 1; j++) {
//                System.out.println(Arr.get(i) + " " + Arr.get(j) + " = " + (Arr.get(i) + Arr.get(j)));
                int sum = Arr.get(i) + Arr.get(j);
                String pair = "";
                if (sum == target) {
//                    System.out.printf("Pair Sum numbers i (%d) + j (%d) = target (%d)\n", Arr.get(i), Arr.get(j), Arr.get(i) + Arr.get(j));
                    System.out.printf("Pair Sum numbers%n%d + %d = %d%n", Arr.get(i), Arr.get(j), Arr.get(i) + Arr.get(j));
                    pair = pair.concat(Arr.get(i) + " at index " + i + " and " + Arr.get(j) + " at index " + j);
                    return pair;
                }
            }
        }
        return "No Pairs Found";
    }

    public static void main(String[] args) {
        ArrayList<Integer> Arr = new ArrayList<>(Arrays.asList(2, 4, 7, 9, 3));
        int target = 10;
        System.out.println("Pairsum brute Method -> " + PairsumBrute(Arr, target));
    }
}
