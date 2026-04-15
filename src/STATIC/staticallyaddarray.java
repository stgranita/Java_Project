// addstatically    Adding Array of numbers statically
package STATIC;
import java.util.Random;

class num
{
private int x;
public num(int x)
{ this.x=x;} // therecan be more than 2 overloaded constructors

public static int add(num n[]) 
// Here, in passing by reference parameters we pass the array of numbers so it can refer other elements in sequence
{
int sum = 0;
for(int i=0;i<n.length;i++)
sum = sum + n[i].x;
return sum;
}
}
class staticallyaddarray
{
  public static void main(String ar[])
   {
  //  Random ran = new Random();
  //  int r = ran.nextInt(3);
   num []n = new num[5];
   n[0] = new num(2);
   n[1] = new num(4);
   n[2] = new num(5);
   n[3] = new num(1);
   n[4] = new num(3);
// As add is a static function so we refer it using class name. Note the name of array is just used to denote the address of n
   System.out.println(num.add(n)); // passing only the name of the array
   }
}



