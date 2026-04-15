
// String encryption
public class Encryption {
    public static void main(String[] args) {
 String s=  new String("Bobby");
 String result = new String("");
 s = s.toLowerCase();
 for (char ch:s.toCharArray())
     if ((ch=='b') || (ch =='B'))
         result = result + (char)(ch + 8);
     else result = result + ch;
        System.out.println(result);
    }
}
