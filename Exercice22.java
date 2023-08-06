import java.util.Scanner;
public class Exercice22 {
    public static void main(String[]args)
    {
    	Scanner input=new Scanner(System.in);
    	int x;
    	do
    	{
    		System.out.print("Enter the number of lines: ");
    		x=input.nextInt();
    	}
    	while(x<=0||x%2==0);
    	for(int i=1;i<=x;i++)
    	{
            for(int j=1;j<=x;j++)
            {
                if(i==x/2+1||j==x/2+1||(j>=x/2+1 && i==1)||(j<=x/2+1 && i==x)||(i>x/2+1 && j==1)||(i<x/2+1 && j==x))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
