class numbr
{
int x; // x is default
 boolean b;

        public int getY() {
                return y;
        }

        private int y; // supports encapsulation to hide sensitive data
        public void setX(int x1,int y1)
                { x = x1; y = y1; }
        public  void add()
                { System.out.println(x+y);
                b= true;} //if I make method as static, static method cannot access non-static object x
}
class access_modifier
{
public static void main(String ar[])
{
numbr n = new numbr();
n.setX(10,20);
        System.out.println(n.b);
       n.add();
        System.out.println(n.b);
//n.add(); //now value is 30

n.x = 15; // x is default so we can change from another class so value of x is now changed
//n.y = 20; AS y IS PRIVATE, WE cannot change y, but we can only access through getters and setters
        //System.out.println(n.getY()); is possible
        n.add();
        System.out.println(n.x); // Value of x after calling function remains unchanged as in call by value
        //
}
}

