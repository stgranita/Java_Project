//Using objects to find the maximum of 2 number objects.
package STATIC;
class ek_number
{
private int x;
        public void setX(int a)
         { x = a;}
        public void max(ek_number n)
        {
               // ek_number temp;
        if (x > n.x)
        System.out.print(x + " is greater!"); // temp.x = x;
        else
        System.out.print(n.x + " is greater!"); //temp.x =n.x;
                // return temp;
        }
}
class maximum
{
public static void main(String ar[])
{
ek_number n1 = new ek_number();
ek_number n2 = new ek_number();
n1.setX(5);
n2.setX(2);
n1.max(n2);
}
}


