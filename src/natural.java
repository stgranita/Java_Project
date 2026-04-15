// Print first 100 natural numbers using recursion

import java.util.Scanner;

public class natural {
    public static void print(int n, int m) {
        if (n > m) return; {
            System.out.print(n + ","); // Print on the way back up
            print(n + 1,m); // Go deep until n = 1
        }
    }
        public static void main(String[] args) {
            System.out.println("Enter limit");
            Scanner sc = new Scanner(System.in);
            int m = sc.nextInt();
            print(1, m); // Start from 100
             }
}