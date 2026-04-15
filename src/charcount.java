//WAP to read a string and count all occurance of a specific character
class charcount
{
public static void main(String ar[])
 {
  int cnt=0;
  String S1 = new String("BOBBY");
  String S2 = "This String contains \n\t  double and \n\t    triple spaces!";
  String S3 = "This String contains no double and triple spaces!";
  System.out.println(S2);
  if ((S3.indexOf("  ")==-1)|| (S3.indexOf("   ")==-1)) System.out.println(S3 +": Contains no spaces");
  System.out.println(S2.indexOf("   ")); // if any of these is -1 then it doesnot contains double and triple space
  for(int i=0;i<S1.length();i++)
  {
   if(S1.charAt(i)== 'B' || S1.charAt(i)== 'b')
   cnt++;
 }
   System.out.println(cnt);
   }
 }



