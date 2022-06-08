import java.util.*;
class StackArr{
int a[] = new int[530];
int top=-1,ch,item,i;
Scanner sc = new Scanner(System.in);
public void stackoperation()
{
System.out.println("Enter the limit of elements in the stack : ");
int n=sc.nextInt();
do
{
System.out.println("\n\t CHOICES : ");
System.out.println("\n 1.PUSH \n 2.POP \n 3.EXIT \n");
System.out.println("\n Enter your choice : ");
ch=sc.nextInt();
switch(ch)
{
case 1: if(top >=n-1)
{
System.out.println("stack overflow");
}
else
{
System.out.println("enter the element :");
item =sc.nextInt();
top=top+1;
a[top]=item;
}
break;
case 2 : if(top<0)
{
System.out.println("stack underflow");
}
else
  {
a[top]='\0';
top=top-1;
}
break;
case 3 : break;
default : System.out.println("\n Invalid choice");
}
if(top < 0)
{
System.out.println("\n stack is empty");
}
else
{
System.out.println("\n stack is \n");
for(i=top;i>=0;i--)
{
System.out.println(a[i]);
}
}
}
while(ch!=3);
}
}
class Stack
{
public static void main(String[] args)
{
StackArr sa =new StackArr();
sa.stackoperation();
}
}
