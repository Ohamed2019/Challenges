import java.util.Scanner;
public class Exercice7SecondMethod {
    public static void main(String[]args)
    {
    	Scanner input=new Scanner(System.in);
    	int x;
    	do
    	{
    		System.out.print("Enter the number of lines: ");
    		x=input.nextInt();
    	}
    	while(x<=0);
    	for(int i=x;i>=1;i--)
    	{
    		for(int k=i-1;k>=1;k--)
    		{
    			System.out.print(" ");
    		}
    		for(int j=(x*2)-(i*2)+1;j>=1;j--)
    		{
    			System.out.print("*");
    		}
    		System.out.println();
    	}
    }
}
