package lib;

public class ConcatArraysExample {
    public static int[] concatArrays(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int index = 0;

        for (int i : a) {
            result[index++] = i;
        }

        for (int i : b) {
            result[index++] = i;
        }

        return result;
    }
    public static void main(String[] args) {

        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};

        int[] result = concatArrays(a, b);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}

