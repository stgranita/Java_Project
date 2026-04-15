import java.util.Scanner;

public class word_occurance {
    public static void main(String[] args) {
        System.out.println("Enter Line");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        line = line.toLowerCase();
        String w[] = line.split(" ");
        boolean[] visited = new boolean[w.length];


        for (int i = 0; i < w.length; i++) {
            if (visited[i]) continue;
            int count = 1;
            for (int j = i + 1; j < w.length; j++) { //very important line j = i+1, and j < w.length
                if (w[i].equals(w[j])) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(w[i] + " :" + count);
        }
    }
}
