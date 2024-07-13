import java.util.*;

public class ArrayOne {
    public static void update(int marks[], int nonchage) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] += 1;

        }

    }

    public static int linearSearch(int array[], int key) {
        for (int i = 0; i <= array.length; i++) {
            if (array[i] == key) {
                return i;
            }

        }
        return -1;

    }

    public static int linearSearchInStr(String menu[], String key) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }

    public static int Maxmum(int array[]) {

        int intmax = array[0];
        for (int i = 0; i < array.length; i++) {
            if (intmax < array[i]) {
                intmax = array[i];
            }
        }
        return intmax;
    }

    public static int Minimum(int array[]) {

        int intmin = array[0];
        for (int i = 0; i < array.length; i++) {
            if (intmin > array[i]) {
                intmin = array[i];
            }
        }
        return intmin;
    }

    public static int BinarySearch(int number[], int key) {
        int start = 0;
        int end = number.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (number[mid] == key) {
                return mid;
            } else if (number[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return -1;

    }

    public static void reverse(int number[]) {
        int start = 0;
        int end = number.length - 1;

        while (start < end) {
            int temp = number[start];
            number[start] = number[end];
            number[end] = temp;
            start++;
            end--;
        }

    }

    public static void pairsInArray(int number[]) {
        int tp = 0;
        for (int i = 0; i < number.length; i++) {
            int crr = number[i];
            for (int j = i + 1; j < number.length; j++) {
                System.out.print("(" + crr + "," + number[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pairs :- " + tp);

    }

    public static void kadans(int number[]) {
        int ts = 0;
        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(number[k] + " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total SubArray :- " + ts);

    }

    public static int trappedRainWater(int height[]) {
        int n = height.length;
        int leftMax[] = new int[n];
        leftMax[0] = height[0];

        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        int rigthMax[] = new int[n];
        rigthMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rigthMax[i] = Math.max(height[i], rigthMax[i + 1]);
        }

        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            int waterlevel = Math.min(leftMax[i], rigthMax[i]);
            trappedWater += waterlevel - height[i];

        }
        return trappedWater;

    }

    public static void main(String args[]) {

        System.out.println("\n------------------------------------------------------\n");

        int marks[] = { 23, 54, 32 };
        int nonchage = 100;

        update(marks, nonchage);

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i] + " ");

        }
        System.out.println();

        System.out.println("\n------------------------------------------------------\n");
        // linerSearch using Intgere

        int array[] = { 12, 23, 23, 32, 23 };
        int key = 23;

        int index = linearSearch(array, key);

        if (index == -1) {
            System.out.println("Index is not found ");
        } else {
            System.out.println("Index is found at index :- " + index);
        }

        System.out.println("\n------------------------------------------------------\n");

        // linearSearch using String
        String menu[] = { "apple", "banana", "kevi" };
        String strKey = "kevi"; // Changed variable name to follow Java conventions

        int Index = linearSearchInStr(menu, strKey); // Corrected method name and capture returned index

        if (Index == -1) {
            System.out.println("Index is not found");
        } else {
            System.out.println("Index is found at index: " + Index); // Corrected variable name to 'index'
        }

        System.out.println("\n------------------------------------------------------\n");

        System.out.println("Muxmum number is :- " + Maxmum(array));

        System.out.println("\n------------------------------------------------------\n");

        System.out.println("Minimum number is :- " + Minimum(array));

        System.out.println("\n------------------------------------------------------\n");

        int number[] = { 1, 2, 3, 2, 4, 5 };
        int Key = 5;

        int Ans = BinarySearch(number, Key);

        if (Ans == -1) {
            System.out.println("index not found");
        } else {
            System.out.println("index found at :- " + Ans);
        }

        System.out.println("\n------------------------------------------------------\n");

        reverse(number);

        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i] + " ");
        }
        System.out.println();

        System.out.println("\n------------------------------------------------------\n");

        pairsInArray(number);

        System.out.println("\n------------------------------------------------------\n");

        pairsInArray(number);

        System.out.println("\n------------------------------------------------------\n");

        int numbers[] = { 1, 2, 3, -2, -3, 2, 3, 6, 2 };

        kadans(numbers);

        int height[] = { 3, 3, 3, 2, 4, 5 };

        System.out.println(trappedRainWater(height));

    }

}