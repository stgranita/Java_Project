
import java.util.Scanner;
public class Precedence {
            public static void main(String[] args) {
                float a = 7/4 * 9/2; // 1.75 evalutes to 1 * 9/2 = 4.5 evalutes to 4
                float b = 7/4.0f * 9/2.0f;
                int c = 7 * 49/7 + 35/7;
                char grade = 'B';
                System.out.println("Enter Expected Grade");
                Scanner sc = new Scanner(System.in);
                String j = sc.next(); // nextLine() is used to accept line with space
                grade = (char)(j.charAt(0) + 8); // type casting to char
                System.out.printf(" The Value of a is without .2f" + a);
                System.out.printf(" The Value of a is %.2f", a);
                System.out.printf(" The Value of b is %.2f", b);
                System.out.printf(" The Value of c is %d", c);
                System.out.printf(" The grade is %c", grade);
                System.out.println(j.charAt(0) > b);
            }
        }
