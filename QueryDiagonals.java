import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QueryDiagonals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int matrix = 0;
			String in = "";
			String res = "";
			int testcase = 0;
			int req = 0;
			Scanner sc = new Scanner(System.in);
			List<String> puzzle = new ArrayList<>();
			
			
			matrix = Integer.parseInt(sc.nextLine());
			
			if( matrix >=1 && matrix <=15) {
				
				for(int i = 0 ; i < matrix ; i++) {
					
					String s = sc.nextLine().toUpperCase();
					
					in = in + s + " ";
					
				}
				
				
			}
			String [] p1 = in.split(" ");
			
			testcase = Integer.parseInt(sc.nextLine());
			
			if( testcase >=1 && testcase <= matrix ) {
				
				for(int i = 0 ; i < testcase ; i ++) {
					
					req = Integer.parseInt(sc.nextLine());
					
						if(req ==1) {
							String r = "";
							for(int j = req-1 ; j < matrix*matrix ; j ++) {
				
											r = r + " " + p1[j];		
								
								j = j + matrix;
								
							}
							puzzle.add(r.substring(1));
						}
						
						if(req !=1) {
							
							String r = "";
							int rett = matrix*matrix - matrix*(req-1);
						//	System.out.println(rett);
							for(int j = req-1 ; j < rett ; j ++) {
							
											r = r + " " + p1[j];		

										j = j + matrix;
							}
							puzzle.add(r.substring(1));
							String s = "";
							for(int j = matrix*(req-1) ; j < matrix*matrix ; j ++) {
				
											s = s + " " + p1[j];		
								j = j + matrix;
							}
							puzzle.add(s.substring(1));
							
						}
					
				}
				
				
				
				
				
			}
			
			puzzle.stream().forEach(System.out::println);
			
			
			
			
			
	}


}
