package org.example;

import org.example.Employee;

public class Utils {
    public static int findByName(String name, Employee[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (name.equals(arr[i].getName())) {
                return i;
            }
        }
        return -1;
    }
}
//
//    public int findBySubName(String subname, Employee[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i].getName().contains(subname)) {
//                return i;
//            }
//        }
//        return -1;
//    }
//
//    public int salarySum(String name, Employee[] arr) {
//        int result = 0;
//        for (int i = 0; i < arr.length; i++) {
//            result += arr[i].getSalary();
//        }
//        return result;
//    }
//
//    public int findMaxSalar(String name, Employee[] arr) {
//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//            if (max += arr[i].getSalary());
//        }
//        return max;
//    }
//}