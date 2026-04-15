
public class sorting {
    public static void main(String[] args) {
        int temp = 0;
        int arr[] = { 5, 2, 9, 1, 3 };

        for (int i = 0; i < arr.length - 1; i++) {
            //   int min = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    // for sorting it will always be  < not  <=
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

            for (int k=0; k<arr.length;k++) System.out.print(" " + arr[k]);
           System.out.println(" and 2nd largest" + arr[arr.length-2]);
    }
}
