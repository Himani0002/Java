public class Strings {
    public static boolean IsPalindrome(String str) {
        for (int i = 0; i <= str.length() / 2; i++) {
            int n = str.length();

            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }

        }
        return true;
    }

    public static float getShortestPath(String path) {
        int x = 0, y = 0;

        // Loop through the path string
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);

            // Update coordinates based on direction
            if (dir == 'S') {
                y--;
            } else if (dir == 'N') {
                y++;
            } else if (dir == 'W') {
                x--;
            } else if (dir == 'E') {
                x++;
            }
        }

        // Calculate the shortest path
        int x2 = x * x;
        int y2 = y * y;

        return (float) Math.sqrt(x2 + y2);
    }

    public static void largestString(String[] fruits) {

        String largest = fruits[0];

        for (int i = 1; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        System.out.println("The largest String is :- " + largest);
    }
   

    public static void main(String args[]) {
        String str = "NooN";

        System.out.println(IsPalindrome(str));

        String path = "WWWNNNSSSEEEE";
        System.out.println(getShortestPath(path));

        String[] fruits = { "apple", "banana", "cherry", "date" };
        largestString(fruits);

    }
}
