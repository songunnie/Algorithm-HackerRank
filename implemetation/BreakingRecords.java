package implemetation;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BreakingRecords {
    class Result {

        /*
         * Complete the 'breakingRecords' function below.
         *
         * The function is expected to return an INTEGER_ARRAY.
         * The function accepts INTEGER_ARRAY scores as parameter.
         */

        public static List<Integer> breakingRecords(List<Integer> scores) {
            // Write your code here
            List<Integer> result = new ArrayList<Integer>();

            int mostCnt = 0;
            int leastCnt = 0;

            int mostNum = scores.get(0);
            int leastNum = scores.get(0);

            for(int i=1; i<scores.size(); i++) {
                int score = scores.get(i);
                if(scores.get(i) < leastNum) {
                    leastNum = scores.get(i);
                    leastCnt++;
                } else if(scores.get(i) > mostNum) {
                    mostNum = scores.get(i);
                    mostCnt++;
                }
            }

            result.add(mostCnt);
            result.add(leastCnt);
            return result;
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> scores = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> result = Result.breakingRecords(scores);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(Collectors.joining(" "))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
