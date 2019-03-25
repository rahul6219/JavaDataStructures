import java.util.Scanner;

/**
 *
 * @author Rahul Thakur
 */
public class LongestCommonSubsequence {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //take length m for x and n for y
        System.out.println("Enter size for array x: ");
        int m = in.nextInt();
        System.out.println("Enter size for array y: ");
        int n = in.nextInt();

        //create array x and y and c
        String x[] = new String[m + 1];
        String y[] = new String[n + 1];
        int c[][] = new int[m + 1][n + 1];
        String b[][] = new String[m + 1][n + 1];

        //adding values to array x and array y
        String temp;
        System.out.println("Entering values in  Array X");
        for (int i = 1; i <= m; i++) {
            System.out.print("Index " + i + " : ");
            temp = in.next();
            x[i] = temp;
            temp = "";
        }

        System.out.println("Entering values in  Array Y");
        for (int i = 1; i <= n; i++) {
            System.out.print("Index " + i + " : ");
            temp = in.next();
            y[i] = temp;
            temp = "";
        }

        //store 0's in the array
        //col =0, all rows for that col =0;
        for (int i = 0; i < m + 1; i++) {
            c[i][0] = 0;
        }

        //store 0's in the array
        //row =0, all cols for that row =0;
        for (int j = 0; j < n + 1; j++) {
            c[0][j] = 0;
        }

        System.out.println("Printing 0's in C array");
        for (int i = 0; i < m + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                System.out.print(c[i][j] + "  ");

            }
            System.out.println();
        }

        System.out.println("Printing 0's in B array");

        for (int i = 0; i < m + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                b[i][j] = "0";

                System.out.print(b[i][j] + "  ");

            }
            System.out.println();
        }

        System.out.println();
        System.out.println("MAIN LOGICCCCCCCCCC-----------------");

        System.out.println();

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (x[i].equals(y[j])) {

                    c[i][j] = c[i - 1][j - 1] + 1;
                    b[i][j] = "D";

                } else if (c[i - 1][j] >= c[i][j - 1]) {

                    c[i][j] = c[i - 1][j];
                    b[i][j] = "^";

                } else {

                    c[i][j] = c[i][j - 1];
                    b[i][j] = "<";
                }
            }
        }

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.print(c[i][j] + " ");

            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.print(b[i][j] + " ");

            }
            System.out.println();
        }

    }
}