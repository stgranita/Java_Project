//Statically swapping 2 number objects

class num2
{
int x,y;
public num2(int a,int b)
        { x = a; y = b;}
public static void swap(num2 n[])
{
 num2 temp;
 temp = n[0];
 n[0] = n[1];
 n[1] = temp;}
 public void print()
{
System.out.println("The value of x is:" + x);
System.out.println("The value of y is:" + y);
}
}
class swap
{
public static void main(String ar[])
{
num2 n[]= new num2[2]; // imp step
n[0] = new num2(10,20);
n[1] = new num2(2,3);
System.out.println("Before Swapping.....");
n[0].print();
n[1].print();
num2.swap(n); // as it swaps no return type is required, PASSING ARRAY
System.out.println("After Swapping.....");
n[0].print();
n[1].print();
}
}


