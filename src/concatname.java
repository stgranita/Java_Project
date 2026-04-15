// Printing First Name Midlle Name last Name of 5 students

class name
{
String fn,mn,ln; // String is a class that Java supports so we can use it as primitive data type
        public name(String x,String y, String z)
        {
        fn = x;
        mn = y;
        ln = z;
        }
    public void print()
        {
           // fn.replace('a','@'); // this wil not work as fn.replace should be assigned to fn fn = fn.replace();
            System.out.println(fn+" "+mn+" "+ln);}
}
class concatname
{
public static void main(String ar[])
 {
int i = 0;
name n[]= new name[5];   // Array of objects
n[0]= new name("A1","A2","A3");
n[1]= new name("B1","B2","B3");
n[2]= new name("C1","C2","C3");
n[3]= new name("D1","D2","D3");
n[4]= new name("E1","E2","E3");
while(i<n.length)
{
n[i].print();
i++;
}
 }
  }

