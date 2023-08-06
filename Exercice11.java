import java.util.Scanner;
public class Exercice11 {
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
                for(int k=1;k<=(x/2)-i+1;k++)
                {
                    System.out.print(" ");
                }
                for(int j=1;j<=(i*2)-1;j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
            else
            {
                for(int k=1;k<=i-(x/2)-1;k++)
                {
                    System.out.print(" ");
                }
                for(int j=1;j<=(x*2)-(i*2)+1;j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
