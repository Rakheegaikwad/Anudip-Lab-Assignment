/*
 Program :-  Arrange String in length wise ascending order .example this is easiest example
 is,this,easiest,example.
 @author :- Rakhee Gaikwad
 @Date :- 20 Oct 2022
 */
package basic;

//declaring a class StringAscendingOrder
public class StringAscendingOrder 
{
	//calling main method
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		String str1="is,this,easiest,example";
		String[] result=str1.split(",");	//split method
		for(String i:result)
		{
			System.out.print(i+" ");
		}
		//Subtring method
		System.out.println(str1.substring(3,7));//print only this
		System.out.println(str1.substring(0,2));//print only is
		System.out.println(str1.substring(8,15));//print only easiest
		System.out.println(str1.substring(16,23));//print only example
	}
	//end of main method
}
// end of class  StringAscendingOrder 

/*
is this easiest example this
is
easiest
example
*/
