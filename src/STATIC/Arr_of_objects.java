package STATIC;

public class Arr_of_objects {
    public static void main(String ar[]) {
        Object[][] data = new Object[2][4];
        for (int i=0;i<data.length;i++) {
            for (int j = 0; j < data[0].length; j++) {
                data[i][0] = "Hello";
                data[i][1] = 23.65;
                data[i][2] = 5;
                data[i][3] = true;
            }
        }
        for (int i=0;i<data.length;i++){
            for (int j = 0; j < data[0].length; j++) {
            System.out.println(data[i][j]); } }
    }
}
