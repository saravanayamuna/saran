import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;


public class Two {
public static void main(String []args)
{
	Scanner input =new Scanner(System.in);
	System.out.println("enter row and column");
	int rows=input.nextInt();
	int coloum=input.nextInt();
	int n=rows*coloum;
	int [][] two=new int[rows][coloum];
	int [] a=new int[n];
	System.out.println("Enter the input elements");
	for(int i=0;i<n;i++)
	{
		a[i]=input.nextInt();
	}
	Set<Integer> list=new  HashSet<Integer>();
	for(int i=0;i<n;i++)
	{
		list.add(a[i]);
	}
	Integer [] b=list.toArray(new Integer[list.size()]);
	int k=0;
	for(int i=0;i<rows;i++)
	{
		for(int j=0;j<coloum;j++)
		{
			two[i][j]=b[k];
			System.out.print(" "+two[i][j]);
			k++;
		}
		System.out.println();
	}}}
