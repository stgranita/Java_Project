// silent, listen
public class Anagram {
    public static void main(String[] args) {
        char k = ' ';
        int flag = 1;
        String s1 = "aab";
        String s2 = "abb";
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        if (s1.length() != s2.length()) flag =0;
        else  {
            for (int i = 0; i < s1.length(); i++) {
                k = s1.charAt(i);
                if (s2.indexOf(k) == -1) {
                    flag = 0;
                    break;
                } //end of if
            } // end of for
        } // end of else
        if (flag == 1)
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");
    } // end of main
} // end of class
