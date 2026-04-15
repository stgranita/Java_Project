//WAP to sort names stored in an array in ascending order


class ordernames
{
public static void main(String ar[])
{
int k=0,j,i;
String t;
String s[] = {"Minu","Meui","Meni","Mena"};
for(i=0;i<s.length-1;i++) {
    for (j = i+1; j < s.length; j++) {
        k = s[i].compareTo(s[j]);
    if(k>0)
    {
    t = s[i];
    s[i] = s[j];
    s[j] = t;
         }
    }
}
for(i=0;i<s.length;i++)  System.out.println(s[i]);
}
}
  
