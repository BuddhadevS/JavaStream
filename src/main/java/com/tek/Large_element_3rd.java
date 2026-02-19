package com.tek;

public class Large_element_3rd {
    public static void main(String[] args) {
        int[] arr = {5, 3, 9, 1, 6, 7, 8};
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int num : arr) {

            if (num > first) {
                third = second;
                second = first;
                first = num;
            }
            else if (num > second && num != first) {
                third = second;
                second = num;
            }
            else if (num > third && num != second && num != first) {
                third = num;
            }
        }

        System.out.println("3rd Largest Number: " + third);

    }
}
