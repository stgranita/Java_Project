package STATIC;

// Addition of two number objects returning a number object
class ek_class
 {
     private int x;
     public void setX(int x) {
         this.x = x;
     }

     public int getX() {
         return x;
     }



       // public void print()
         //       { System.out.println("The value of x is "+ x);}
        public ek_class add(ek_class n2) // return type is a class for method add with parameter as a class
                {
                ek_class n3 = new ek_class();
                    n3.x = x + n2.x;
                    // int a = x + n2.x;
               // n3.x = a;
                return n3;
                }
 }
 class addobj
 {
 public static void main(String ar[])
 {
 ek_class n1 = new ek_class();
 ek_class n2 = new ek_class();
 n1.setX(30);n2.setX(20);
 ek_class n = n1.add(n2);
 System.out.println("Addition of two objects n1 and n2 with value " + n1.getX() + " and " + n2.getX() + " is:" + n.getX());
 }
 }






