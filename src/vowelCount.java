import java.util.Scanner;

public class vowelCount {
    public static void main(String[] args) {
       // int cnt1 =0, cnt2=0, cnt3=0, cnt4=0,cnt5=0;
        int sum = 0;
        System.out.println("Enter a String");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.contains("a") || s.contains("e") || s.contains("i") || s.contains("o") || s.contains("u"))
        { for (int i =0;i< s.length();i++)
         {
             if (s.charAt(i)=='a'|| s.charAt(i)=='A' || s.charAt(i)=='e' || s.charAt(i)=='E' || s.charAt(i)=='i' || s.charAt(i)=='I'|| s.charAt(i)=='o' || s.charAt(i)=='O' || s.charAt(i)=='u' || s.charAt(i)=='U')
                 sum = sum + 1;
         }
        System.out.println(sum); } else
            System.out.println("No vowels Present");
            /*
             for(char c:s.toCharArray())
            switch(c)  {

        case 'a': cnt1 = cnt1 + 1; break;
        case 'e': cnt2 = cnt2 + 1; break;
        case 'i': cnt3 = cnt3 + 1; break;
        case 'o': cnt4 = cnt4 + 1; break;
        case 'u': cnt5 = cnt5 + 1; break; }
        System.out.println("Number of a:" + cnt1);
        System.out.println("Number of e:" + cnt2);
        System.out.println("Number of i:" + cnt3);
        System.out.println("Number of o:" + cnt4);
        System.out.println("Number of u:" + cnt5); */
    }
}
