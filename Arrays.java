import com.sun.tools.javac.Main;

import java.util.Scanner;

public class Arrays {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myInteger = getInteger(5);
        int[] sorted = sortIntegers(myInteger);
        printArray(sorted);

    }

    public static int[] getInteger(int capacity) {
        int[] array = new int[capacity];
        System.out.println("enter" + capacity + "Integer values:/r");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.println("element" + i + "contents" + array[i]);
    }

    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            sortedArray[i] = array[i];
        }

        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++)
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
        }
        return sortedArray;
    }

}

