import java.util.Scanner;
public class Exercice9 {
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
        if(x%2==0)
        {
            x++;
        }
    	for(int i=1;i<=x;i++)
    	{
            if(i<=x/2)
            {
                for(int j=1;j<=i;j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
            else
            {
                for(int j=1;j<=x-i+1;j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
