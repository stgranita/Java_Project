public class removeSpace {
    public static void main(String[] args) {
        String s = "I am a girl. I am Ranita";
        s= s.replaceAll("\\s+", "");
        System.out.println(s);

    }
}
