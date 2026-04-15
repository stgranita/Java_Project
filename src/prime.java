import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
            int p,i,flag=1;
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
         p = sc.nextInt();

        if (p <= 1) flag = 0; else {

            for (i = 2; i < p; i++) {
                if (p % i == 0) {
                    flag = 0;
                    break;
                }
            }
        }
                if (flag == 1)
                    System.out.println("Number is prime!"); else  System.out.println("Number is NOT prime!");
    }
        }