import java.io.*;
import java.util.*;
public class Sumnum
{
public static void main(String args[])
 {
  int n,res=0;
  System.out.println("Input");
  Scanner s=new Scanner(System.in);
  n=s.nextInt();
  int a[]=new int[n];
   for(int i=0;i<n;i++)
   {
    a[i]=s.nextInt();
   }
   for(int i=0;i<n;i++)
   {
     res=res+a[i];   
   }
   System.out.println(res);
 }
}
