public class reverse_Str {
    public static void main(String[] args) {
        String s= "Ranita is a Girl";
        s = s.toLowerCase();
       String [] arr =  s.split(" ");
       for(int i=arr.length-1;i>=0;i--)
           System.out.print(arr[i]+ " ");
    }
}
