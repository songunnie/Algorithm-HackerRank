package warmUp;

import java.io.*;

public class TimeConversion {
    class Result {

        /*
         * Complete the 'timeConversion' function below.
         *
         * The function is expected to return a STRING.
         * The function accepts STRING s as parameter.
         */

        public static String timeConversion(String s) {
            // Write your code here
            String newStr = s.replace("PM", "").replace("AM", "");
            String[] strArr = newStr.split(":");

            String replace = strArr[0];
            String result = "";

            if(s.endsWith("PM")) {
                if(Integer.parseInt(strArr[0]) < 12) {
                    strArr[0] = String.valueOf(Integer.parseInt(strArr[0]) +  12);
                }
            }

            if(s.endsWith("AM")) {
                if(Integer.parseInt(strArr[0]) >= 12) {
                    strArr[0] = "00";
                }
            }

            return s.replace(replace, strArr[0]).replace("PM", "").replace("AM", "");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

