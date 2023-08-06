import java.util.Scanner;
public class Exercice26 {
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
            for(int j=1;j<=x;j++)
            {
                if((j<=x/2 && j > i && j <= x - i) || (i > x / 2 && j < i && j > x - i + 1))
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
