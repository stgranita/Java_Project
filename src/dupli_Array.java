public class dupli_Array {
    public static void main(String[] args) {
        int marks [] = {23,45,45,45,78};
        boolean visited[] = new boolean[marks.length];
        for (int i =0;i<marks.length;i++) {
            if (visited[i]) continue;
            int cnt = 1;
            for (int j = i + 1; j < marks.length; j++) {
                if(marks[i]==marks[j]) {
                    cnt++; visited[j] = true;
                }

            } // inner j
            System.out.println(marks[i] + ":" + cnt);
        } // outer i
    }
}

