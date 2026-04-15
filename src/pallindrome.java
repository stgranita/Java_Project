import java.util.Scanner;
public class pallindrome {
    public static void main(String ar[]) {
        String s = new String("");
        int i, j, l;
        boolean f=true; // assume pallindrome initially
        s = "Racecar"; s= s.toLowerCase() ; l = s.length();
        for (i = 0, j = s.length()-1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                f = false;
                break; }
        }
        if (f == true)
            System.out.println("Pallindrome");
        else
            System.out.println("Not a pallindrome");
    }
}

