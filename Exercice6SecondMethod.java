import java.util.Scanner;
public class Exercice6SecondMethod {
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
        int y;
        do
        {
        	System.out.print("Enter the number of columnes: ");
        	y=input.nextInt();
        }
        while(y<=0);
    	for(int i=x;i>=1;i--)
    	{
    		for(int k=x-i;k>=1;k--)
    		{
    			System.out.print(" ");
    		}
    		for(int j=y;j>=1;j--)
    		{
    			System.out.print("*");
    		}
    		System.out.println();
    	}
    }
}
