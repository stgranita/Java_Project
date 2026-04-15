import java.util.Scanner;

public class fact_recursion {
public static int fact(int num) {
    if (num == 0 || num == 1) return 1;
    return num * fact(num-1);
}
    public static void main(String[] args) {
        System.out.println("Enter Number");
        Scanner sc = new Scanner(System.in);
        int x=  sc.nextInt();
        System.out.println(fact(x));
    }
}
