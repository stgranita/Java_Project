//Q2. WAP to print your name vertically
//Example:
//R
//A
//N
//I
//T
//A
// to print odd numbers 2n+1 , even numbers 2n using for loop
class verticalname
{
public static void main(String ar[])
  {
    String S2 = "RANITA"; int cnt =0;
    for(int i = 0;i< S2.length();i++)
    System.out.println(S2.charAt(i));

      for(char ch:S2.toCharArray()) cnt++;
    System.out.println("Total Length:" + cnt); }
  }
