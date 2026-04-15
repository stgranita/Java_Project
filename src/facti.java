

import java.util.Scanner;

public class facti {
    public static void main(String[] args) {
        int fact = 1; int i=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int x= sc.nextInt();
        while (x>0) {
            fact = fact * x;
            x= x-1;
        }
        System.out.println(fact);
    }
}
