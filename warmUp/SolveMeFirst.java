package warmUp;

import java.util.Scanner;

public class SolveMeFirst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(solveMeFirst(a,b));
        sc.close();
    }

    static int solveMeFirst(int a, int b) {
        return a+b;
    }
}
