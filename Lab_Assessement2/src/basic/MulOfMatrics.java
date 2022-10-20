/*
 Program :-  Find transpose of matrix{{1,2},{4,5},{8,9}} and multiplication of all members in matrix.
 @author :- Rakhee Gaikwad
 @Date :- 20 Oct 2022
 */
package basic;

//decalring a class MulOfMatrics
public class MulOfMatrics 
{
	//calling main method
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int mul=1;	// intializing mul=1
		int a[][]= {{1,2},{4,5},{8,9}};	//two dimensional Array elements
		int b[][]=new int [2][3];//row ,column
		
		for(int i=0;i<a.length;i++)		//using for loop
		{
			for(int j=0;j<a[i].length;j++)
			{
				b[j][i]=a[i][j];
			}
		
		}
		//end of for loop
		
		for(int i=0;i<b.length;i++)		//using for loop
		{
			for(int j=0;j<b[i].length;j++)
			{
				System.out.print(b[i][j]);
			}
			System.out.println();
		}
		//end of for loop
		
		
		for(int x[]:a) 	//using for each loop
		{
			for(int y:x)
			{
				mul *=y;
			}
		}	
		// end for each loop
		
		System.out.println("mul "+mul);// printing multiplication of Array
	}
	//end of main method
}
	//end of class MulOfMatrics 