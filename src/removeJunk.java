public class removeJunk {
        public static void main(String[] args) {
            String s = "he@lloБлагодаря за гледането感谢您观看!123#world";

           String result = new String();

            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);

                // ASCII checks
                if ((ch >= 'a' && ch <= 'z') ||   // lowercase letters
                        (ch >= 'A' && ch <= 'Z') ||   // uppercase letters
                        (ch >= '0' && ch <= '9') || ((int)ch >= 32) && (int)ch <=90) {   // digits
                   result = result + ch;
                }
            }

            System.out.println(result);
        }

}
