import java.util.Scanner;

public class charOccurences {

        public static void main(String[] args) {
            System.out.println("Enter word");
            Scanner sc = new Scanner(System.in);
            String w = sc.next();
            w= w.toLowerCase();
            boolean[] visited = new boolean[w.length()];

            for (int i = 0; i < w.length(); i++) {
                if (visited[i]) continue; // remember there is no {} in first if
                int count = 1;
                for (int j = i + 1; j < w.length(); j++) {
                    if (w.charAt(i) == w.charAt(j)){
                        count++;
                        visited[j] = true;
                    }
                }

                System.out.println(w.charAt(i) + " :" + count);
            }
        }
    }

