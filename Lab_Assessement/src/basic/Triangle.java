package basic;
import java.util.Scanner;
public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a=obj.nextInt();
		System.out.println("Enter the value of b:");
		int b=obj.nextInt();
		System.out.println("Enter the value of c:");
		int c=obj.nextInt();
		if(a+b+c ==180)
		{
			if(a<90 && b<90 && c<90)
			{
				System.out.println(" First Prize");
			}
			else if (a==90||b==90||c==90)
			{
				System.out.println("Second Prize");
			}
			else if (a==60||b==60||c==60)
			{
				System.out.println("Third Prize");
			}
			else
			{
				System.out.println("No prize");
			}
		}
	}

}
