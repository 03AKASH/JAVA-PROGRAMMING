

import java.io.*;
import java.util.*;
class Area
{
void findarea(int a, int b)
    {
       System.out.println( "\n Area of rectangle with breadth "+a+" and lenght " +b+ " is :" + a*b);
    }
  
void findarea(int a)
       {
         System.out.println( "\n Area of circle with  radius " +a+ " is :" + 3.14 * a);
       }
  
 void findarea(int a, int b, int c)
    {
        double temp = (a + b + c);
        double s= temp/2;
        double triarea = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println( "\n Area of triangle with lenght of sides  "+a+"," +b+ " and " +c+" is : "+ triarea);
 }
public static void main(String p[]) throws IOException
 {
    Scanner c=new Scanner(System.in);
   Area d = new Area();
   
     System.out.print("\n Find area of \n 1 . Rectangle \n 2 . Triangle \n 3 . Circle \n\nSelect a choice : ");
     int choice =c.nextInt();
  switch(choice)
  {
    case 1:
          System.out.print("\n Enter the breadth : ");
          int b =c.nextInt();
          System.out.print("\n Enter the length : ");
          int l =c.nextInt();
          d.findarea(b,l);
          break;
    case 2:
         System.out.print("\n Enter the length of first side : ");
         int l1 =c.nextInt();
         System.out.print("\n Enter the lenght of second side : ");
         int l2 =c.nextInt();
         System.out.print("\n Enter the lenght of third side : ");
         int l3 =c.nextInt();
         d.findarea(l1,l2,l3);
         break;
    case 3:
         System.out.print("\n Enter the radius : ");
        int r =c.nextInt();
         d.findarea(r);
         break;
    default:
         System.out.println("Invalid choice");
      }
  }
}
