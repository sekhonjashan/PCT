import java.util.Scanner;

/*
Sample input: 0111001
Output: 0(1,3)(0,2)1

*/

public class A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "";
		int count = 1;
		int len = 0;
		Scanner sc = new Scanner(System.in);
			
		s = sc.nextLine();
		s = s + ' ';
		len = s.length();
		
		for(int i = 0 ; i <len-1 ; i++ ) {
		
			if( s.charAt(i) == ' ') {
				break;
			}
			
			if(s.charAt(i) != s.charAt(i+1)) {
				System.out.print(s.charAt(i));
				
			}
			if(s.charAt(i) == s.charAt(i+1)) {
				char in = s.charAt(i);
				for(int j = i+1 ; j <len ; j++ ) {
					if(in == s.charAt(j)) {
						count++;
					}
					if(in != s.charAt(j)) {
					break;
					}
				}
			}
			if (count >1) {
				System.out.print("("+s.charAt(i)+",");
				System.out.print(count+")");
				i = i + count-1;
				count =1;
			}
		}
	}
}
