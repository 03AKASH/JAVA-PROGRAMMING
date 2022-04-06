import java.util.*;
class Array2D
{
public  static void main(String[] args)
 {
   int a[][]=new int[2][3];
   int i,j;
  System.out.println("enter the number to be inserted");
  Scanner input=new Scanner(System.in);
  
    for(i=0;i<2;i++)
     {
      for(j=0;j<3;j++)
       {
          a[i][j]=input.nextInt();
          }
          }
     System.out.println("display array");
     
    for(i=0;i<2;i++)
     {
      for(j=0;j<3;j++)
       {
       System.out.println(a[i][j]);
}
}
}
}