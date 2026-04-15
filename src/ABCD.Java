//Write program to print the following pattern


// A
// AB
// ABC
// ABCD 
class ABCD
{
   public static void main(String ar[])
    {
        for(char ch ='A';ch<='D';ch++)
        {
        for(char ch1 ='A';ch1<=ch;ch1++)
         System.out.print(ch1);
        System.out.println();}
    }
}


