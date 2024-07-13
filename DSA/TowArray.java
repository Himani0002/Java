import java.util.Scanner;

class TowArray {
    public static boolean Search(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("(" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
    }

    public static void printSpiral(int Arr[][]) {
        int starRow = 0;
        int starcol = 0;
        int endRow = Arr.length - 1;
        int endcol = Arr[0].length - 1;

        while (starRow <= endRow && starcol <= endcol) {
            for (int j = starcol; j <= endcol; j++) {
                System.out.print(Arr[starRow][j] + " ");
            }
            for (int i = starRow + 1; i <= endRow; i++) {
                System.out.print(Arr[i][endcol] + " ");
            }
            for (int j = endcol - 1; j >= starcol; j--) {
                System.out.print(Arr[endRow][j] + " ");
            }
            for (int i = endRow - 1; i >= starRow + 1; i--) {
                System.out.print(Arr[i][starcol] + " ");
            }

            starRow++;
            starcol++;
            endcol--;
            endRow--;

        }
        System.out.println();
    }

    public static void digonalSum(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length - 1; i++) {
            sum += matrix[i][i];

            if (i != matrix[i][matrix.length - 1 - i]) {
                sum += matrix[i][matrix.length - 1 - i];
            }
        }
        System.out.println(sum);
    }

    public static boolean StaicaseSearch(int matrix[][], int key) {

        int row = 0, col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {
            
            if (matrix[row][col] == key) {
                System.out.println("Found key at : (" + row + "," + col + ")");
                return true;
            } else if (key < matrix[row][col]) {
                col--;
            } else {
                row++;
            }

        }
        System.out.println("Key not found");
        return false;

    }

    public static void main(String args[]) {
        int matrix[][] = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;

        Scanner sc = new Scanner(System.in);

        System.out.println("\n--------------------------------------------------\n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("\n--------------------------------------------------\n");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\n--------------------------------------------------\n");
        Search(matrix, 5);
        System.out.println("\n--------------------------------------------------\n");

        int Arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

        printSpiral(Arr);
        System.out.println("\n--------------------------------------------------\n");
        digonalSum(matrix);
        System.out.println("\n--------------------------------------------------\n");
        System.out.println("\n--------------------------------------------------\n");
        StaicaseSearch(matrix, 4);
        System.out.println("\n--------------------------------------------------\n");

    }
}