//statdisp

//Accessing static data member by static method

class car
{
int x;
static int y; // declared at global level, it is not associated with any object of class but the class itself
public void setX(int x,int y) // passing parameter
{
this.x= x;
this.y= y;
}

public static void gear_wheels(car n1)
{
    // we cannot access non-static variable from static method, so we use object namw
    // but we can call  static variable and methods from static method / function in java so car.wheels
System.out.println("Non-statically: No. of gear: "+ n1.x); // we pass object as parameter to access non-static property
System.out.println("Statically: No. of wheels:"+ car.y); // we can write car.y also
    System.out.println("Addition of components="+ (n1.x + y));
}
}
class stat_car
{
public static void main(String ar[])
{
car n = new car();
n.setX(3,4); // arguments are actual
car.gear_wheels(n); // This is very important as I am passing the object to print
}
}


