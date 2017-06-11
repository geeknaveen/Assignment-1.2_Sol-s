/*Write a program to print the sum of two numbers without using + operator. Other operators have 
to be used.  
Note: Take care of CamelCase naming conventions.  */

package add.example;

public class AddExample {

		public static void main(String[] args) {
			int x, y, Sum;
			x=-200;
			y=45;
	        AddNumbers addNum = new AddNumbers();
			addNum.x = x;
			addNum.y = y;
			addNum.add();
			Sum = addNum.addAgain(x, y);
			System.out.println(" Sum of the two numbers is = " + Sum);
		}
}
	 
	
