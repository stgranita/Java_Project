public class bubble {
    public static void main(String[] args) {
        String[] arr1 = {"Hello", "My", "World"};
        String[] arr2 = {"Ranita's", "Java", "Programming", "Tips"};
        String[] result = new String[arr1.length+arr2.length];
        for (int i = 0;i<arr1.length;i++) result[i] = arr1[i];
        for (int j = 0;j<arr2.length;j++) result [j+arr1.length] = arr2[j];
        for (String s:result) System.out.println(s + ",");
    }
}
