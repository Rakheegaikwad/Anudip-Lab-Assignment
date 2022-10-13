/*
Lab Assessment 
@Name : Reakhee Gaikwad
@Date : 13 Oct 2022
*/
/*     Program
1. A class teacher has decided to split her entire class into four groups, namely Sapphire,Perl,Ruby,and Emrald for sports competitions .
For dividing the students into these four groups, she has followed the pattern given below:
-Sapphire-1,5,9,13,17,21,....
-Perl-2,6,10,14,18,22,....
-Ruby-3,7,11,15,19,23,...
-Emerald-4,8,12,16,20,24,...
*/
package basic;
import java.util.Scanner;
public class StudentRollNumber 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter Roll number");
		int x=obj.nextInt();
		
		if(x%4==1)
		{
				System.out.println("Sapphire");
		}
		else if(x%4==2)
		{
			System.out.println("Perl");
		}
		else if(x%4==3)
		{
			System.out.println("Ruby");
		}
		else if(x%4==0)
		{
			System.out.println("Emerald");
		}
	}
	
	
}