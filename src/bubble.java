public class bubble {
    public static void main(String[] args) {
      int number =12321; boolean flag = true;
      String s = String.valueOf(number);
       for( int i = 0, j=s.length()-1;i<j;i++,j--) {
          if (s.charAt(i) != s.charAt(j)) { flag = false; break;}
        }
       if (flag==true) System.out.println("Pallindrome"); else System.out.println("Not Pallindrome!");
    }
}
