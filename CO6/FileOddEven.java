import java.io.*;
class FileOddEven
{
	public static void main(String[] args)throws IOException
	{
		int i;
		File num=new File("integers.txt");
		FileOutputStream fos=new FileOutputStream(num);
		DataOutputStream dos=new DataOutputStream(fos);
		try
		{
			for(i=1;i<=10;i++)
			{
				dos.writeInt(i);
			}
		} 
		catch(IOException e)
		{
			System.out.println(e);
		}
		dos.close();
		fos.close();
		FileInputStream fis=new FileInputStream(num);
		DataInputStream dis=new DataInputStream(fis);

		File num1=new File("odd.txt");
		FileOutputStream fos1=new FileOutputStream(num1);
		DataOutputStream dos1=new DataOutputStream(fos1);

		File num2=new File("even.txt");
		FileOutputStream fos2=new FileOutputStream(num2);
		DataOutputStream dos2=new DataOutputStream(fos2);
		try
		{
		System.out.println("File Content ");
		for(int j=1;j<=10;j++)
		{
			i=dis.readInt();
			if(i%2==0)
				dos2.writeInt(i);
			else
				dos1.writeInt(i);
		}
		}
		catch(IOException e1)
		{
			System.out.println(e1);
		}
		dos1.close();	
		fos1.close();
		dos2.close();
		fos2.close();
		dis.close();
		fis.close();	

		FileInputStream fis1=new FileInputStream(num1);
		DataInputStream dis1=new DataInputStream(fis1);
		System.out.println("\nOdd File : ");
		try
		{
		for(int j=1;j<=5;j++)
		{
			i=dis1.readInt();
			System.out.println(i +" ");
			
		}
		}
		catch(IOException e2)
		{
			System.out.println(e2);
		}
		fis1.close();
		dis1.close();

		FileInputStream fis3=new FileInputStream(num2);
		DataInputStream dis3=new DataInputStream(fis3);
		System.out.println("\nEven File : ");
		try
		{
		for(int k=1;k<=5;k++)
		{
			i=dis3.readInt();
			System.out.println(i +" ");
			
		}
		}
		catch(IOException e2)
		{
			System.out.println(e2);
		}
		fis3.close();
		dis3.close();
		}

	}	
