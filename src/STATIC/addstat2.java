package STATIC;
class num5
{
    int x, y;
    num5(int x, int y){
        this.x = x;
        this.y = y;
    }
    public static void swap(num5 n[]){
        num5 temp;
        temp = n[0];
        n[0] = n[1];
        n[1] = temp;
    }
    public  void print() {
        System.out.println(this.x + "--"+ this.y);
    }

}
public class addstat2 {
    public static void main(String[] args) {
        num5 n1[] = new num5[2];
       n1[0] = new num5 (5, 8);
       n1[1] = new num5 (2, 9);
        num5.swap(n1);
        n1[0].print(); n1[1].print();
    }


}
