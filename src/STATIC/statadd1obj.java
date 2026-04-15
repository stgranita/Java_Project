//stataddval
package STATIC;
// Statically adding two values each having 1 value of the same objects
class numbr
{
        private int x,y;
        public numbr(int a,int b)
        { x = a; y = b;}
        public static void add(numbr n1)
        {
         System.out.println(n1.x + n1.y);
        }
}
class statadd1obj
{
public static void main(String ar[])
{
numbr n = new numbr (10,20); // constructor
numbr.add(n); //call by reference
}
}

