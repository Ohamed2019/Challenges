import java.util.Scanner;
public class Exercice12 {
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
                System.out.print("*");
                for(int k=1;k<(i*2)-2;k++)
                {
                    System.out.print(" ");
                }
                if(i!=1)
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
                System.out.print("*");
                for(int k=1;k<=(x*2)-(i*2)-1;k++)
                {
                    System.out.print(" ");
                }
                if(i!=x)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
