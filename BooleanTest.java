//Java Assignment 3.2
public class BooleanTest {
	public static void main(String[] args)
	{
		String s1;	//declare String variable
		String s2;	//declare String variable
		boolean same;	//declare boolean variable

		// Receive two strings from console input.
		System.out.print("Enter content for s1: ");
		s1 = System.console().readLine();
		System.out.print("Enter content for s2: ");
		s2 = System.console().readLine();
		same = (s1.equals(s2))? true:false;	// Compare the two inputs. If same, return true else false.
		System.out.print("Content of S1 and S2 are same? " + same);	// Prints the output. 
	}
}
