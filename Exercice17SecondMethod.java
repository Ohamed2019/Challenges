import java.util.Scanner;
public class Exercice17SecondMethod {
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
                for(int j=1;j<=i-1;j++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
                for(int m=1;m<=x-(i*2);m++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
                for(int n=1;n<=i-1;n++)
                {
                    System.out.print(" ");
                }
                System.out.println();
            }
            else
            {
                for(int j=1;j<=x-i;j++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
                for(int m=1;m<=(i*2)-x-2;m++)
                {
                    System.out.print(" ");
                }
                if(i!=(x/2)+1)
                {
                    System.out.print("*");
                }
                for(int n=1;n<=x-i;n++)
                {
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}
