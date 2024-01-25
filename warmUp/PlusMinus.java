package warmUp;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class PlusMinus {

    class Result {

        /*
         * Complete the 'plusMinus' function below.
         *
         * The function accepts INTEGER_ARRAY arr as parameter.
         */

        public static void plusMinus(List<Integer> arr) {
            // Write your code here
            float positiveCnt = 0;
            float negativeCnt = 0;
            float zeroCnt = 0;

            for(int a : arr) {
                if(a > 0) {
                    positiveCnt += 1;
                } else if(a == 0) {
                    zeroCnt += 1;
                } else {
                    negativeCnt += 1;
                }
            }

            System.out.println(positiveCnt/arr.size());
            System.out.println(negativeCnt/arr.size());
            System.out.println(zeroCnt/arr.size());
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
