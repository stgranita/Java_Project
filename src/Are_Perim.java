class Are_Perim
{
private int l,b;
public void area_peri()
{
System.out.println("Area:" + (this.l * this.b));
System.out.println("Perimeter:" + 2 * (this.l + this.b));
}
public void setX(int l,int b)
{
this.l = l;
this.b= b;
}
}
class rectmain
{
public static void main(String arg[])
{
Are_Perim R = new Are_Perim();
R.setX(4,5);
R.area_peri();
}
}


