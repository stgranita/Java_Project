import static java.lang.Character.isUpperCase;

// count how many are lowercase and how many are uppercase
public class countCase {
    public static void main(String[] args) {
        int cnt1=0;int cnt2=0;
        String s = "Welcome! To+ Automation";
        for(int i = 0; i <s.length();i++)
        {
            if (Character.isUpperCase(s.charAt(i)))  cnt1++; else cnt2++; }
        System.out.println("Uppercase:" + cnt1);
        System.out.println("Lowercase:" + cnt2);

    }
}
// we can also do it if ch > 'A' and ch < 'Z'
