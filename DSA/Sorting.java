// IMP 

public class Sorting {
    public static void SelectionSort(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            int minpos = i;
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[minpos] > arr[j]) {
                    minpos = j;
                }
            }
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;

        }

    }

    public static void PrintArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void bubbleSroting(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }

    }

    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = i;
            int prev = i - 1;

            while (prev >= 0 && arr[prev] > arr[curr]) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = arr[curr];
        }
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 2, 1, 2, 3, 4, 5 };
        // SelectionSort(arr);
        // bubbleSroting(arr);
        insertionSort(arr);
        PrintArray(arr);

    }
}
