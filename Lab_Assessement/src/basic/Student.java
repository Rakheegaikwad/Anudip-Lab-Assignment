/*
Lab Assessment 
@Name : Reakhee Gaikwad
@Date : 13 Oct 2022
*/
/*     Program
Print 
1
121
12321
1234321
*/
package basic;
import java.util.Scanner;
public class Student 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the number ");
		int  num=obj.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			for(int j=i;j<=num-1;j++)
			{
				System.out.print("");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
				
			}
			for(int j=i-1;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
}
	