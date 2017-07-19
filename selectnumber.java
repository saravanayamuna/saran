import java.util.Scanner;


public class choose {
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter the input");
		int num=input.nextInt();
		int array[]=new int[num+1];
		int len=3;
		int copy=len;
		for(int i=1;i<=num;i++)
		{
			if(len!=0)
			{
				array[i]=len;
				len--;
			}
			if(len==0)
			{
				copy=copy*2;
				len=copy;
			}
			if(i==num)
			{
				System.out.println("the output is");
				System.out.println(array[i]);
				break;
			}
		}}}
