public class Largestele {
    public static void main(String[] args) {
            int arr[] = {10, 25, 7, 89, 45};

            int max = arr[0]; int min = arr[0];

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
                }
                for (int i = 1; i < arr.length; i++) {
                    if (arr[i] < min) {
                        min = arr[i];
                    }
            }

            System.out.println("Largest = " + max + ", Smallest = " + min);
        }
    }

