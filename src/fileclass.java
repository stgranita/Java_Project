// Count the no.of files and directories in a drive

import java.io.*;
class fileclass
{
public static void main(String ar[])
 {
  int d1 = 0,l1 = 0;
  File f = new File("C:\\");
  String s1 = f.getPath();
  String fl[] = f.list();
  for(int i=0;i<fl.length;i++)
  {
  File f1 = new File(s1+fl[i]);
  if(f1.isDirectory())
  d1 = d1 + 1;
  if(f1.isFile())
  l1 = l1 + 1;
  }
  System.out.println("No of directories: "+d1);
  System.out.println("No of files: "+l1);
  }
}

