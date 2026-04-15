public class recSum {
        static int sumrec(int n)
        {
            if (n==0) return 0; //base condition
            return (n + sumrec(n-1));
        }
        public static void main(String[] args) {
            System.out.println(sumrec(0));
        }
    }

