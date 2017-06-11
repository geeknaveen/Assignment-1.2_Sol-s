/*Write a program to print the sum of two numbers without using + operator. Other operators have 
to be used.  
Note: Take care of CamelCase naming conventions.  */

package add.example;

public class AddNumbers {
int x, y, Sum;
	
	public void add(){
		Sum = x + y;
		//System.out.println("\n From Class: Sum of two integer values is = " + Sum);
	}
		public int addAgain(int Number1,int Number2){
		Sum = Number1 + Number2;
		return Sum;
	}
}

