

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//6:34 PM
public class PCT_Exam2_July2019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int testcases = Integer.parseInt(sc.nextLine());
		List<String> res = new ArrayList<String>();
		
		if(testcases <1 && testcases >= 50) {
			System.exit(0);
		}
		
		for(int i = 0 ; i < testcases ; i ++) {
			
			String line = sc.nextLine();
			String result = ""; 
					
			int len = line.length();
			
			for(int k = 0 ; k < len  ; k++) {
				
				//checking ""
				if( line.charAt(k) == '"') {
					int index1 = 0;
					for(int j = k+1 ; j < len ; j ++) {
						if(line.charAt(j)=='"') {
							index1 = j;
							break;
						}
					}
					String r = line.substring(k+1, index1);
					result = result + r + " ";
					k = k + 1 + r.length();
				}
				
				//checking for //
				if( k+1 >= line.length()) break;
				if(line.charAt(k) == '/' && line.charAt(k+1) == '/') {
					
					String r = line.substring(k+2);
					result = result + r;
					break;
				}
				
				// checking of /* and */
				if(line.charAt(k) == '/' && line.charAt(k+1) == '*') {
					int index1 = 0 ;
					for(int j = k+2 ; j < len ; j ++) {
						if(line.charAt(j)=='*' && line.charAt(j+1)=='/') {
							index1 = j;
							break;
						}
					}
					
					String r = line.substring(k+2,index1);
					result = result + r + " ";
					k = k + 2 + r.length();
				}
				
				
				
			}
			res.add(result);
			
			
			
		}
		
		for( int i = 0 ; i < res.size() ; i ++) {
			System.out.println(res.get(i).trim());
		}

	}

}
//Test cases
//1 
//this is /*test1*/ /* //test2 */ "test3" " test 4 with //" and this is final test // test 5 "nice"
//output : test1  //test2  test3  test 4 with //  test 5 "nice"
