import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Given two strings as input. Your task is to concanate two strings and then reverse the string. Finally print the reversed string.

Input:
First line of the input file contains an integer T which denotes the number of test cases. Then T test cases follow. First line of each test case contains a string A and second line contains another string B.

Output: 
For each test case, print the reversed string.

Constraints:
1<=T<=20
1<=length(A)<=50
1<=lenght(B)<=50

Example:
Input:
2
Geeks
forGeeks
Practice
geeks
Output:
	
skeeGrofskeeG
skeegecitcarP

*/
public class JavaString_Set1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Cases = "";
		
		List<String> OutPut = new ArrayList<String>();
		
		Scanner sc = new Scanner(System.in);
		
		Cases = sc.nextLine(); 
		
		if( Integer.parseInt(Cases) >= 1 && Integer.parseInt(Cases) <=20) {
			
		
			for(int i = 0 ; i < Integer.parseInt(Cases) ; i ++ ) {
				
				OutPut.add(i, takeStrings());
				
			}
			
			OutPut.stream().forEach(System.out::println);
		
		}
		else {
			System.exit(0);
		}
		
		
		
		
	}

	private static String takeStrings() {
		// TODO Auto-generated method stub
		String CatS = "";
		String FinalString = "";
		
		Scanner scc = new Scanner(System.in);
		String FirstString = scc.nextLine();
		String SecondString = scc.nextLine();
		
		if(FirstString.length() >=1 && FirstString.length() <=50 && SecondString.length() >=1 && SecondString.length() <= 50){
			CatS = FirstString + SecondString;
			
			StringBuilder SF = new StringBuilder(CatS);
			
			FinalString =	SF.reverse().toString();
			
		//	System.out.println("Here");
			
			return FinalString;	
		}
		else {
			System.exit(0);
		}
		
		return FinalString;
		
	}

}
