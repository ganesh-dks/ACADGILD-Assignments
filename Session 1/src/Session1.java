import java.awt.image.ColorConvertOp;

/**
 * 
 */

/**
 * @author Ganesh
 * For Session 1
 *  Assignment 1 , 2 , 3 and 4
 */
public class Session1 {

	public static void main(String[] args) {
		
		//Assignment 1 starts here
		int p=10;
		float q=25.5f;
		Session1 obj=new Session1();
		System.out.println("Adding two numbers a = "+p+" and b = "+q+" we get : "+obj.add(p,q));
		
		//Assignment 2 starts here
		int a,b=4,c; // For Assignment 2
		
		//Assigment 3 starts here
		a='a'; // we can do this as the Ascii value will taken
		System.out.println(a);
		//a="a"; // we cannot assign String to int --- for assignment 3
		//c=23.4f;// We cannot assign float value to int --- for assignment 3
		
		//Assignment 4 starts here
		int y=10;
		int x=5;
		System.out.println(x+y*2); // should be 5+10*2=25 as multiplication takes precedence
		System.out.println(x-y+2); // should be 5-10+2=-3 as both + and - have same precedence
		System.out.println((x+y)*2); // should be (5+10)*2 = 30 as parenthesis takes precedence
		System.out.println(y%x);// should be 10%5=0 as modulo operator gives the remainder.
	}
	public int add(int a,float b)
	{
		return (int) (a+b);
	}
	
}
