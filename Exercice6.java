import java.util.Scanner;
public class Exercice6 {
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
    	for(int i=1;i<=x;i++)
    	{
    		for(int k=1;k<=i-1;k++)
    		{
    			System.out.print(" ");
    		}
    		for(int j=1;j<=y;j++)
    		{
    			System.out.print("*");
    		}
    		System.out.println();
    	}
    }
}
