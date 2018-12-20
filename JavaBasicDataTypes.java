import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Given three values of different data types. You are required to store these values in variables of corresponding data type and output them.

Input:
The first line of input contains integer T denoting the number of test cases. For each test case, there will be three space seperated values i.e Integer, String, Float.

Output: 
For each test case, print all the input values space separated in the same order as the input. 

Constraints:
1 <= T <= 100

Example:
Input:
2
1 gfg 2.4
18 geeksforgeeks 9.88

Output:
1 gfg 2.4
18 geeksforgeeks 9.88
*/
public class JavaBasicDataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "";
		String _var = "";
		int i = 0;
		int _int = 0;
		int Number = 0;
 		float FloatType = 0;
		List<String> OP = new ArrayList<String>();
		
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		_int = Integer.parseInt(s);
		if(_int >=1 && _int <=100) {
		
			for(i=0; i < _int; i ++ ) {
				
				Number = sc.nextInt();
					
				s = sc.next();

				FloatType = sc.nextFloat();
				
				OP.add(i,Number + " " + s + " " + FloatType);
				
			}
			
		}
		
		OP.stream().forEach(System.out::println);
	
		
	}

}
