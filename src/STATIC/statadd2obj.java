//stataddnum: This has return type as number and print the number
// Statically adding two values of the different objects
package STATIC;
class number
{
private int x,y;
    static int a,b; // static is associated to class not object
      public static number add(number n1, number n2)
        {

//static method can access static variable and non-static variable only through object name

        a = n1.x + n2.x;
        b = n1.y + n2.y;
        number n3 = new number(a,b);
       // n3.setX(a,b); //  static/non-static variables can be passed to a non-static method
            return n3;
        }
        public static void print(number n) // a and b are static
        { System.out.println("Values are:" + n.x + " and " + n.y);
            // static variable a and b can be accessed from static method. we cal also call number.a + number.b or just a and b
            // non-static variable x and y can also be referenced from inside a static method by using n.x, n.y
            // if object is passed as parameter to method
        }
        
        public number(int x1,int y1)
        { x = x1; y = y1;}
 }
class statadd2obj
 {
  public static void main(String ar[])
  {
 number n1 = new number(10, 20);
 number n2 = new number(5, 2);
 //n1.setX(10,20); //setX is non-static , pass by value as primitive data types are call by value
     // n2.setX(5,2);
 number.print(n1);
 number.print(n2);
 number.print(number.add(n1,n2)); //n3.result(n) // this is non-statically calling
  }
}


