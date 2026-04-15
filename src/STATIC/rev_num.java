package STATIC;

import java.util.Scanner;

public class rev_num {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int reverse = 0; // initially initialized to 0
        while(num != 0)
        {
            int last = num % 10; // get last digit
            reverse = reverse * 10 + last;
            num = num / 10; // remove last digit
        }
        System.out.println("Reverse= "+ reverse);
    }
}
