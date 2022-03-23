import java.util.*;
class Matrixadd
{
public static void main(String args[])
{
int row,col,i,j;
Scanner input=new Scanner(System.in);
System.out.println("enter the number of rows");
row=input.nextInt();
System.out.println("enter the number of coloumns");
col=input.nextInt();
int matr1[][]=new int[row][col];
int matr2[][]=new int[row][col];
int sum[][]=new int[row][col];
System.out.println("enter the number of matrix1");
for(i=0;i<col;i++)
{
for(j=0;j<row;j++)
matr1[i][j]=input.nextInt();
System.out.println();
}
System.out.println("enter the number of matrix2");
for(i=0;i<col;i++)
{
for(j=0;j<row;j++)
matr2[i][j]=input.nextInt();
System.out.println();
}
for(i=0;i<row;i++)
for(j=0;j<row;j++)
sum[i][j]=matr1[i][j]+matr2[i][j];
System.out.println("sum of matrix is");
for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
System.out.println(sum[i][j]);
System.out.println();
}
}
}
