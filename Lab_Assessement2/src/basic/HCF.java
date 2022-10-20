/*
 Program :-  Find HCF of two number,the numbers are 60,36.
 @author :- Rakhee Gaikwad
 @Date :- 20 Oct 2022
 */
package basic;

//declaring a class
public class HCF 
{
	// calling main method
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int num=60; 	
		int num1=36;
		int i,hcf=0; //initilize with 0
		
		for(i=1;i<=num ||i<=num1;i++)// using for loop
		{
			if(num%i==0 && num1%i==0)
				hcf=i;
		}
		//end for loop
		System.out.println(hcf);// printing hcf
	}
	//end of main method
}
//end of class HCF 

/*
output 
 12 
*/
