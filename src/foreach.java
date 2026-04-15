public class foreach {
    public static void main(String[] args) {
       // int [] marks =new int[5];
        int [] marks = {9,33,55,89,90};

      /*  marks[0] = 29; // First element (index 0)
        marks[1] = 22; // Second element (index 1)
        marks[2] = 34; // Third element (index 2)
        marks[3] = 47; // Fourth element (index 3)
        marks[4] = 59; */
        int sum = 0;

        // for (String s: arr) { sout (s);}
        for (int ele: marks) {
            sum = sum + ele;
        }
        System.out.println("Avg = " + sum/ marks.length);
    }
}
