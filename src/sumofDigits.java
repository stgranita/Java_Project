public class sumofDigits {
    public static void main(String[] args) {
        int num = 30242; int sum = 0; int last, cnt=0;
        String s = String.valueOf(num);
        for (char c: s.toCharArray()) cnt++;
        while(num>0)
        {
            last = num % 10;
            sum = sum + last;
            num = num/10;
        }
        System.out.println(sum);
    }
}
