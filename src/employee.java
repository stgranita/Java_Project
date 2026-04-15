//WAP to accept the Emp no, name and DOJ, then it should display the details with date in dd/mm/yy format.
class dte
{
    private int d,m,y;
    public dte(int d,int m,int y)
    { this.d = d; this.m = m; this.y = y;}
    public void printDate()
    { System.out.print("DOB:"+this.d+"/"+this.m+"/"+this.y); }

}
class emp
{
private int empno;
private String empname;
    dte D; // we have to declare dte outside function so that it can be accessed y display
    public void setX(int no,String name,int d1,int m1,int y1)
        {
        empno = no;
        empname = name;
          D = new dte(d1,m1,y1); // creating object of another class in method
        }
        public void displayEmp()
        {
        System.out.print(empno + " " + empname + " ");
        D.printDate(); // Inside displayEMp, we need to display Date
        }
    }

 class employee
 {
 public static void main(String ar[])
 {
 emp e = new emp();
 //dte d= new dte(14,10, 2007);
 e.setX(10,"Neel",24,10,2007); //emp no., name, doj

 e.displayEmp();
 }
 }


