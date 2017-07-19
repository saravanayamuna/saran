import java.util.Scanner;
public class lex {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String str=input.next();
		String sub="";
		if(str.length()>=2)
		{
			sub=sub+str.substring(1, str.length());
			}
		if(sub.length()==0){
			System.out.println("No Such Largest SubString Present");
		}
		else
			System.out.println("Largest Substring is : "+sub);
	}}
