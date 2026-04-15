//enter the missing roll number and donot print the missing roll number
import java.util.Scanner;
public class continu
{
    public static void main(String[] args) {
       int i = 0;
        int k;
        System.out.println("Enter a roll number between (1-5) absent");
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
      //  for (int i = 1; i <= 5; i++) { if (i == k) continue; System.out.println(i); }
        //while (i < 5) { i++; if (i == k) continue; System.out.println(i); }
       do {
            i++; // if you put i++ after sout it will go to infinite loop
            if (i==k) continue;
            // takes control to next iteration while skipping the remaining statements
            System.out.println(i);
        } while(i<5);
    }
}
