class number3
{
private int x,y;
// we use methods to avoid repeating the logic
        public void setX(int x,int y)
        { this.x=x; this.y=y; }
        public  void addmul()
        {
        System.out.println("X is:"+ (this.x*this.y));
        System.out.println("+ is:"+ (this.x+this.y));
        }
}
// non-static method cannot be called from a static context
// which fridge do you want so you need object of class to cal its method
// static keyword is used to associate a method of a given class rather than the object of class
// static method in a class is shared by all objects

class mainaddmul
{
public static void main(String ar[])
{
number3 R = new number3();
R.setX(2,3);
R.addmul();
}
}
