package warmUp;

import java.io.*;
public class Staircase {
    class Result {

        /*
         * Complete the 'staircase' function below.
         *
         * The function accepts INTEGER n as parameter.
         */

        public static void staircase(int n) {
            // Write your code here
            String symbols = "#";
            for(int i=0; i<n; i++) {
                for(int j=(n-2)-i; j>=0; j--) {
                    System.out.print(" ");
                }
                System.out.println(symbols);
                symbols += "#";
            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.staircase(n);

        bufferedReader.close();
    }
}
