import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Basic_HowManyXs {

	/*
	Constraints:
		1<=T<=100
		0<=X<=9
		0<L<U<=10^5
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int TestCases = 0;
		int Number1, Number2, Number3;
		List<Integer> OP = new ArrayList<Integer>();
	
		Scanner sc = new Scanner(System.in);
		
		TestCases = sc.nextInt();
		
		if(TestCases >= 1 && TestCases <=100 ) {
			for(int i = 0 ; i < TestCases ; i ++ ) {
				
				Number1 = sc.nextInt();
				if(Number1 >= 0 && Number1 <=9 )
				{
				Number2 = sc.nextInt();
				Number3 = sc.nextInt();
				
				if(Number3>0 && Number3 > Number2 && Number3<=100000) {
					OP.add(i, CountXs(Number1,Number2,Number3));
				}
				
				}
			}
			
		}
		
		OP.stream().forEach(System.out::println);

	}

	private static int CountXs(int number1, int number2, int number3) {
		// TODO Auto-generated method stub
		int count = 0;
		int num = 0;
		
		for( int i = number2+1; i < number3 ; i ++) {
			num = i;
			while ( num > 0) {
				
				if( num % 10  == number1) {
					count = count + 1;
					
				}
				 num = num / 10 ;
				
			}
		}
		
		
		return count;
		
	}
	

}
