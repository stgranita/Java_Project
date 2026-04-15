public class swapString {
    public static void main(String[] args) {
        String a = "Ranita";
        String b = "Girl";
        a = a + b;
        //a= RanitaGirl-Girl
        b = a.substring(0,a.length()-b.length());
        a = a.substring(b.length()); // v. impoortant there is only 1  parameter
        System.out.println(a);
        System.out.println(b);// start from 6 and go till end

    }
}
