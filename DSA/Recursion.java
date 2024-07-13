public class Recursion {

    public static void printDec(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " ");
        printDec(n - 1);

    }

    public static void printInc(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printInc(n - 1);
        System.out.print(n + " ");
    }

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        int fn = n * fact(n - 1);
        return fn;

    }

    public static int calcSum(int n) {
        if (n == 1) {
            return 1;
        }
        int sn = n + calcSum(n - 1);
        return sn;
    }

    public static int fib(int n) {

        if (n == 0 || n == 1) {
            return n;
        }

        int fnm1 = fib(n - 1);
        int fnm2 = fib(n - 2);
        int fn = fnm1 + fnm2;

        return fn;

    }

    public static boolean IsSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }

        return IsSorted(arr, i + 1);

    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void margesort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = (si + ei) / 2;
        margesort(arr, si, mid);
        margesort(arr, mid + 1, ei);
        marge(arr, si, mid, ei);
    }

    public static void marge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];

        int i = si;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        // for leftover element of 1st sorted part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        // for leftover element of 2st sorted part

        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void quick(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int pidx = partition(arr, si, ei);
        quick(arr, si, pidx - 1);
        quick(arr, pidx + 1, ei);

    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;

        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;

        return i;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 5, 4, 5, 3, -1, 0, -9 };

        // printDec(5);
        // printInc(5);
        // System.out.println(fact(5));
        // System.out.println(calcSum(5));
        // System.out.println(fib(5));
        // System.out.println(IsSorted(arr,0));
        // margesort(arr, 0, arr.length - 1);
        quick(arr, 0, arr.length-1);
        printArr(arr);
    }
}