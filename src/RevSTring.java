import java.util.Scanner;

public class RevSTring
{
    public static void main(String[] args) {
        String s1 ="";
        System.out.println("Enter String");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for(int i = s.length()-1;i>=0;i--)
            s1 = s1 + s.charAt(i);
        System.out.println(s1);
        if (s1.equals(s)) System.out.println("Pallindrome"); else System.out.println("Not Pallindrome");;
    }
}
