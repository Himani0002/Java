public class Bit {
    public static void evenOrOdd(int n) {
        int bitMask = 1;

        if ((n & bitMask) == 0) {
            System.out.println("Even number ");
        } else {
            System.out.println("Odd number");
        }
    }

    public static int get(int n, int i) {
        int bitmask = 1 << i;

        if ((bitmask & n) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int set(int n, int i) {
        int bitmask = 1 << i;
        return n | bitmask;
    }

    public static int clear(int n, int i) {
        int bitmask = ~(1 << i);
        return n & bitmask;
    }

    public static int update(int n, int i, int newBit) {
        if (newBit == 0) {
            return clear(n, i);
        } else {
            return set(n, i);
        }
    }

    public static int countSetBit(int n) {
        int count = 0;

        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static void printLowerCase() {
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print((char) (ch | ' '));
        }
    }

    public static void Swaping() {
        int x = 9, y = 10;

        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }

    public static void AddOne() {
        int x = 20;
        // - , - = + (-~x) 2nd comp ne nidhe - answer ave chhe 

        System.out.println(x + "+" + 1 + "=" + -~x);
    }

    public static void main(String args[]) {
        // evenOrOdd(3);
        // System.out.println(get(10,3));
        // System.out.println(set(10, 2));
        // System.out.println(clear(10, 1));
        // System.out.println(update(10, 2, 10));
        // System.out.println(countSetBit(15));
        // printLowerCase();
        Swaping();
        AddOne();
    }
}
