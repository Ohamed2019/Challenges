import java.util.Scanner;
public class Exercice18SecondMethod {
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
            if(i<=x/2)
            {
                System.out.print("*");
                if(i==1)
                {
                    for(int j=1;j<=x-3;j++)
                    {
                        System.out.print("*");
                    }
                }
                else
                {
                    for(int k=1;k<=i-2;k++)
                    {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                    for(int a=1;a<=x-(i*2);a++)
                    {
                        System.out.print(" ");
                    }
                }
                System.out.print("*");
                for(int k=1;k<=i-2;k++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            else
            {
                    System.out.print("*");
                    if(i==x)
                    {
                        for(int j=1;j<=x-3;j++)
                        {
                            System.out.print("*");
                        }
                    }
                    else
                    {
                        for(int k=1;k<=x-i-1;k++)
                        {
                            System.out.print(" ");
                        }
                        System.out.print("*");
                        for(int a=1;a<=(i*2)-x-2;a++)
                        {
                            System.out.print(" ");
                        }
                    }
                    if(i!=(x/2)+1)
                    {
                        System.out.print("*");
                    }
                    for(int k=1;k<=x-i-1;k++)
                    {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }
            System.out.println();
        }
    }
}
