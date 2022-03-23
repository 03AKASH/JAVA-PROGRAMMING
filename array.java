import java.util.*;
class Array
{
public  static void main(String[] args)
 {
   int a[]=new int[5];
   int i;
  System.out.println("enter the number to be inserted");
  Scanner input=new Scanner(System.in);
  
    for(i=0;i<5;i++)
     {
      a[i]=input.nextInt();
     }
   System.out.println("array elements are");
    for(i=0;i<5;i++)
    {
  System.out.println(a[i]);
  }
 }
}