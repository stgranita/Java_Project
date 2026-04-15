package STATIC;//Non-Statically adding n numbers of an object

class num1
{ int x;
public num1(int x) //Note num is an overloaded constructor
{ this.x = x;}
}
class nonstataddarray
{
public static void main(String ar[])
 { int sum = 0;
   num1  n[] = new num1[5];
   n[0] = new num1(2);
   n[1] = new num1(4);
   n[2] = new num1(5);
   n[3] = new num1(1);
   n[4] = new num1(3);

     for(int i=0;i<n.length;i++)
         sum = sum + n[i].x;// As it is non-static we donot pass the array of number object as parameter
     System.out.println(sum);
   
  }
}

