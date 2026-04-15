//WAP to print nth term of fibbonacci series using recursion
//Return the nth term of fibbonaci series - 0 1 1 2 3 5
import java.util.Scanner;

public class fibbo {
 static int fib (int n)
 {
     if (n == 1 || n == 2) return (n-1);
     else
         return fib(n-1) + fib (n-2);
     }

    public static void main(String[] args) {
        System.out.println("Enter the term that you want to find");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(fibbo.fib(x));
    }
}
