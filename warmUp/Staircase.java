package warmUp;

import java.io.*;
public class Staircase {
    class Result {

        /*
         * Complete the 'staircase' function below.
         *
         * The function accepts INTEGER n as parameter.
         */

        // TODO: i, j 크기에 따라 if - else 로 찍어보는걸로 바꾸어보기

        public static String kangaroo(int x1, int v1, int x2, int v2) {
            // Write your code here
            // if(x1 < x2 && v1 <= v2 || x2 < x1 && v2 <= v1) {
            //     return "NO";
            // } else if(x1 > x2 && v1 < v2 || x2 > x1 && v2 < v1) {
            //     return "YES";
            // } else {
            //     return "YES";
            // }

            // x1 + v1*n % x2 + v2*n == 0


            //1. 0 + 3  4 + 2    3, 6
            //2. 0 + 6  4 + 4    6, 8
            //3. 0 + 9  4 + 6    9 ,10
            //4. 0 + 12 4 + 8    12, 12

            //1. 0 + 2  5 + 3    2, 8
            //2. 0 + 4  5 + 6    4, 11
            //3. 0 + 6  5 + 9    6, 14
            //4. 0 + 8  5 + 12   8, 17

            for(int i=1; i<1000; i++) {
                if(x1 + v1*i == x2 + v2*i) {
                    return "YES";
                }

                i++;
            }
            return "NO";
        }

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
