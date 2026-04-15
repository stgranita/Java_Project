public class missingNumber {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5}; int sum1 = 0,sum2;
        for (int i=0;i<arr.length;i++) sum1 = sum1 + arr[i];
        sum2 = (arr.length+1)*(arr.length+2)/2; //sum of n numbers (n.n+1)/2
        System.out.println("Missing number:" + (sum2 - sum1));
    }
}
