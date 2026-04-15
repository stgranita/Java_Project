public class spcl_char {
    public static void main(String[] args) {
        String s1 = "R!a*011n2$i#t@a", s2 = "", s3 = "", s4="";
        s1 = s1.toLowerCase();
        for(int i=0;i<s1.length();i++)
        {
            if (s1.charAt(i) >= 'a' && s1.charAt(i) <= 'z')
            s2 =s2+s1.charAt(i);
            else if (s1.charAt(i) >='0' && s1.charAt(i) <= '9') s3=s3+s1.charAt(i);
            // important for number it is aso enclosed in ' '
            else if ((int)s1.charAt(i) >=32 && ((int)s1.charAt(i) <=90)) s4=s4+s1.charAt(i);
        }
        System.out.println(s2.concat(s3.concat(s4)));
    }
}
