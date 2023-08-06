import java.util.Scanner;
public class Exercice7 {
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
    	for(int i=1;i<=x;i++)
    	{
    		for(int k=1;k<=x-i;k++)
    		{
    			System.out.print(" ");
    		}
    		for(int j=1;j<=(i*2)-1;j++)
    		{
    			System.out.print("*");
    		}
    		System.out.println();
    	}
    }
}
