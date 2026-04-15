import java.util.Date;

class date1
{
 private int dd,mm,yy;
        public  date1(int dd,int mm,int yy)
               { this.dd = dd; this.mm = mm; this.yy = yy;}
        public void printDate()
                { System.out.println(dd+"/"+mm+"/"+yy); }
}
public class date
{
public static void main(String ar[])
{
date1 D = new date1(17,9,1980);
Date d1 = new Date(); //The one with caps is from util class
    System.out.println(d1.toString());
//D.setDate(17,9,1980);
D.printDate();
}
}

