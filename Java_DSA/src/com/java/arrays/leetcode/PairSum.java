package com.java.arrays.leetcode;

import java.util.*;

public class PairSum {
    public static String pairsumBrute(List<Integer> arr, int target) {
        long startTime = System.nanoTime();
        for (int i = 0; i <= arr.size(); i++) {
            for (int j = i + 1; j <= arr.size() - 1; j++) {
//                System.out.println(arr.get(i) + " " + arr.get(j) + " = " + (arr.get(i) + arr.get(j)));
                int sum = arr.get(i) + arr.get(j);
                String pair = "";
                if (sum == target) {
//                    System.out.printf("Pair Sum numbers i (%d) + j (%d) = target (%d)\n", arr.get(i), arr.get(j), arr.get(i) + arr.get(j));
//                    System.out.printf("Pair Sum numbers%n%d + %d = %d%n", arr.get(i), arr.get(j), arr.get(i) + arr.get(j));
                    pair = pair.concat(arr.get(i) + " at index " + i + " and " + arr.get(j) + " at index " + j);
                    System.out.println("Time Taken by Brute force Method = " + (System.nanoTime() - startTime) / 100000 + " ms");
                    return "Pair Found: " + pair;
                }
            }
        }
        System.out.println("Time Taken by Brute force Method = " + (System.nanoTime() - startTime) / 100000 + " ms");
        return "No Pair Found for Target: " + target;
    }

    public static String pairSumBetter(List<Integer> arr, int target) {
        long startTime = System.nanoTime();
        Collections.sort(arr);
        int p1 = 0;
        int p2 = arr.size() - 1;
        while (p1 <= p2) {
            int v1 = arr.get(p1);
            int v2 = arr.get(p2);

            if (v1 + v2 == target) {
                System.out.println("Time Taken by Better Approach Method = " + (System.nanoTime() - startTime) / 100000 + " ms");
                return "Pair Found: " + v1 + " + " + v2 + " => " + (v1 + v2);
            }
            p1++;
        }
        System.out.println("Time Taken by Better Approach Method = " + (System.nanoTime() - startTime) / 100000 + " ms");
        return "No Pair Found for Target: " + target;
    }

    public static String pairSumOptimal(List<Integer> arr, int target) {
        long startTime = System.nanoTime();
        //Creating the Hashmap
        Map<Integer, Integer> lstMap = new HashMap<>();
        for (int j = 0; j <= arr.size() - 1; j++) {
            lstMap.put(arr.get(j), j);
        }
        for (int i = 0; i <= arr.size() - 1; i++) {
            int num2Fnd = target - arr.get(i);
            if (lstMap.containsKey(num2Fnd) && lstMap.get(num2Fnd) != i) {
                System.out.println("Time Taken by Optimal Approach Method = " + (System.nanoTime() - startTime) / 100000 + " ms");
                return "Pair Found: " + arr.get(i) + " + " + num2Fnd + " => " + target;
            }
        }
        System.out.println("Time Taken by Optimal Approach Method = " + (System.nanoTime() - startTime) / 100000 + " ms");
        return "No Pair Found for Target: " + target;
    }

    public static String pairSumOptimal2(List<Integer> arr, int target) {
        long startTime = System.nanoTime();
        //Creating the Hashmap
        Map<Integer, Integer> lstMap = new HashMap<>();
        int num2Fnd = 0;
        for (int i = 0; i <= arr.size() - 1; i++) {
            num2Fnd = target - arr.get(i);
            if (lstMap.containsKey(num2Fnd)) {
                System.out.println("Time Taken by Optimal Approach Method = " + (System.nanoTime() - startTime) / 100000 + " ms");
                return "Pair Found in 1st Pass: " + arr.get(i) + " + " + num2Fnd + " => " + target;
            }
            lstMap.put(arr.get(i), i);
        }
        System.out.println("Time Taken by Optimal Approach Method = " + (System.nanoTime() - startTime) / 100000 + " ms");
        return "No Pair Found for Target: " + target;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(2, 4, 7, 9, 3));
        int target = 13;
        System.out.println("Pairsum Brute Method -> " + pairsumBrute(arr, target));
        System.out.println();
        System.out.println("Pairsum Better Method -> " + pairSumBetter(arr, target));
        System.out.println();
        System.out.println("Pairsum Optimal Method -> " + pairSumOptimal(arr, target));
        System.out.println();
        System.out.println("Pairsum Optimal V2 Method -> " + pairSumOptimal2(arr, target));
    }
}
