public class length_without_func {
    public static void main(String[] args) {
        String S = "Ranita"; int cnt1=0,cnt2=0,cnt3=0,cnt4=0,cnt5=0;
        for (char ch : S.toCharArray()) {
            // to count length use cnt++;
            switch(ch) { // switch is small
                case 'a': cnt1++; break;
                case 'e': cnt2++; break;
                case 'i': cnt3++; break;
                case 'o': cnt4++; break;
                case 'u': cnt5++; break;
            } }
            System.out.println(cnt1);
            System.out.println(cnt2);
            System.out.println(cnt3);
            System.out.println(cnt4);
            System.out.println(cnt5);

        }
    }
