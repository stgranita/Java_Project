package STATIC;

class numbers
{
private int x;
      public numbers(int a)
       { x = a;}
      public int getX()
      { return x;}

//    public int max(STATIC.numbers n2)
//        {
//        if (x > n2.x)
//        return(x);
//        else
//       return(n2.x);
//        }
    public static numbers maxnum(numbers n1, numbers n2)
    {
        if (n1.x > n2.x)
     return n1;
     else
    return n2; }

}

class static_method_max
{
public static void main(String ar[])
{
numbers n1 = new numbers(5);
numbers n2 = new numbers(2);
numbers a = numbers.maxnum(n1,n2);
System.out.println("The Maximum value is "+ a.getX()); //a.print();
    // method overloading cannot be done with different return type, but ony different parameter
 }
}
