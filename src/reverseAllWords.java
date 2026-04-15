public class reverseAllWords {
    public static void main(String[] args) {
        String s = "How are you"; int j;
        String [] arr = s.split(" ");
        for(String t:arr) {
            j = t.length()-1;
            while(j>=0)
            {  System.out.print(t.charAt(j));
             j--; }
            System.out.print(" ");
        }

    }
}
