import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class JavaArrays_Set1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int testcases = 0;
		int NumberN = 0;
		
		List<Long> numbers = new ArrayList<Long>();
		List<String> OT = new ArrayList<String>();
		//ArrayList<Long> numbers = new ArrayList<Long>();
		
		
		Scanner sc = new Scanner(System.in);
		testcases = sc.nextInt();
		
		if(testcases >= 1 && testcases <=100) {
			
			for(int i = 0;i<testcases;i++) {
				
				NumberN = (int) sc.nextLong();
				
				if(NumberN >= 1 && NumberN <=100) {
					
					for(int j=0; j<NumberN;j++) {
				
						numbers.add(j, sc.nextLong());

					}
					
				OT.add(i, calculateAvgSum(numbers));
				
				}
			
				
				
				
			}
			
			for(int i = 0; i<OT.size() ; i++) {
				System.out.println(OT.get(i));
			}
				
			
		}
		
	
		else {
		
			System.exit(0);
	
		}
		
				
	}

	private static String calculateAvgSum(List<Long> numbers) {
		// TODO Auto-generated method stub
		String out = "";
		int lenght = numbers.size();
		int summ = 0;
		double avg;
		DecimalFormat f = new DecimalFormat("##.00");
	
		for(int k=0; k<lenght;k++) {
			
			summ += numbers.get(k);
			
		}
		
		avg = (double) summ/lenght;
		f.format(avg);
		out = summ + " " + f.format(avg);
		
		return out;
		//System.out.println(out);
		
		/*
		 * 
1
9
2 55 85 656 52 554 545 5 2
		 */
		
	}

}
