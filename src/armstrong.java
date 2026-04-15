public class armstrong {
    public static void main(String[] args) {
        int num = 153; int last; int sum =0; int temp = num;
        while(num!=0) {
        last = num % 10;
        sum = sum + last*last*last;
        num = num / 10;
    }
        if (sum == temp)
        System.out.println("arm"); else System.out.println("Not arm");
    }
}
