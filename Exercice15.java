import java.util.Scanner;
public class Exercice15 {
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
            if(i==1||i==x)
            {
                for(int j=1;j<=y;j++)
                {
                    System.out.print("*");
                }
            }
            else
            {
                System.out.print("*");
                for(int k=1;k<=y-2;k++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
