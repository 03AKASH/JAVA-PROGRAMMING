// Write a java program that creates a class circle with constructor and find its area.

import java.util.*;
class AreaCircle
{
	double area;
	AreaCircle(double r)
	{
	 area= (3.14*r*r);

	}
   public static void main(String[] args) 
    {   
      Scanner s= new Scanner(System.in);
      System.out.println("Enter the radius:");
      double rad= s.nextDouble();      
      AreaCircle  a=new AreaCircle(rad);
      System.out.println("Area of Circle is: " + a.area);      
   }
} 