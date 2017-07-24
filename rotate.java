import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class First {
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		Integer []arr=new Integer[num];
		int n=input.nextInt();
		for(int i=0;i<num;i++)
		{
				arr[i]=Integer.getInteger(null, input.nextInt());
		}
		Collections.rotate(Arrays.asList(arr),n+1);
		for(int i=0;i<num;i++)
		{
			System.out.print(" "+arr[i]);
		}
	}

}
