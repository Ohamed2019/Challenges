import java.util.Scanner;
public class Exercice24 {
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
            for(int m=1;m<=i-1;m++)
            {
                System.out.print("0");
            }
            System.out.print("*");
            for(int n=1;n<=x-i;n++)
            {
                System.out.print("1");
            }
            System.out.println();
        }
    }
}
