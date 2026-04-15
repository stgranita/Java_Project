
// WAP to print avg of numbers passed as arguments
public class vararg {
//int [] numbers or we can write int... numbers
    static int avg(int [] num) {
        // can be called with 0 or more arguments
        // avaialable as int []numbers
        int sum = 0;
        for (int ele : num) {
            sum = sum + ele;
        }
        return (sum / num.length);

    }

    public static void main(String[] args) {
        int[] marks = {29, 33, 55, 89, 90};
        System.out.println(avg(marks));
    }
}