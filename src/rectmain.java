class rectangle
{
private int x,y;
public void area()
{
System.out.println(x * y);
}
public void setX(int l,int b)
{
x = l;
y = b;
}
}
class rectmain
{
public static void main(String arg[])
{
rectangle R = new rectangle();
R.setX(4,5);
R.area();
}
}


