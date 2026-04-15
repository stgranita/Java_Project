// WAP Calculate the length of Strings
class str_array_length {
    public static void main(String ar[]) {
        // this is array declaration and memory allocation of int
        // float marks [] = new marks[5]; you can also declare in one line and next line allocate memory
        // float [] marks = {98.5f,76.7f,88.7f,88.8f};
        String s = "TOM,HARY,ISHAN";
        String [] arr = s.split("");
        // for faster access of elements we use array
        // this is array declaration + memory allocation + initialization
        for (int i = 0; i < arr.length; i++) {
            //System.out.print(" " + s[i]); //if you want to print all elements in array
            System.out.println(arr[i]+" is of length:" + arr[i].length());
        }
    }
}

