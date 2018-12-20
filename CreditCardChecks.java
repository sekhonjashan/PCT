import java.util.Scanner;

public class CreditCardChecks {

public static void main(String[] args) {
	//5136678913456162
	//5019717010103742
	
	Scanner sc = new Scanner(System.in);
	
	long CCnum = sc.nextLong();
	
	System.out.println("CCNumber is " + CCnum);
	
	if(checklenth(CCnum) && checkPrefix(CCnum)) {
		
		int set1 = SumofdoubleEven(CCnum);
		int set2 = sumofodd(CCnum);
		System.out.println(set1+set2);
		
		if((set1+set2) % 10 == 0  ) {
			System.out.println("VALID FCUKING CARD");
		}else {
			System.out.println("NOT VALID");
			
		}
		
	}
	
}
	
	private static int sumofodd(long cCnum) {
	// TODO Auto-generated method stub
		String len = Long.toString(cCnum);
		
		int val = 0;
		int sum = 0;
		for(int i = len.length()-1;i>=0;i=i-2) {
		
			val  = Character.getNumericValue(len.charAt(i));
			
			sum += val;
			
		}
		
		
		
	return sum;
}

	private static int SumofdoubleEven(long CCnum) {
	
		String len = Long.toString(CCnum);
		
		int sum = 0, val =0;
		
		
		// Length is 
		for (int i = len.length()-2;i>=0;i-=2 ) {
		

			 val = Character.getNumericValue(len.charAt(i)) * 2;
			 //System.out.println(val);
			val = check(val);
			 
			 //System.out.println(val);
			 sum = sum + val;
			 
			// System.out.println("I am sum "+sum);
		}
		return sum;
}


	private static int check(int val) {
		// TODO Auto-generated method stub
		if(val > 9) {
			
			val = (val%10) + 1;
		}
		
		return val;
	}

	public static boolean checklenth(long numb) {
		
	//String checklen = String.format ("%d", numb);
	String checklen = Long.toString(numb);
	
	if(checklen.length() >= 11 && checklen.length() <=16) {
		System.out.println("	1. checklenth Pass");
		
		return true;
	}else {
		
		System.out.println("	1. checklenth Fail");
		
		return false;

	}
		
	}
	
	public static long getPrefix(long numb) {
		
	while(numb>=10) {	
		numb /= 10;
		
	}
	System.out.println("1st digit is " + numb);
	return numb;
	
	}
	
	public static boolean checkPrefix(long numb) {
		
		long num = getPrefix(numb);
		if(num == 5 || num ==6) {
			System.out.println("	2. PREFIX Pass");
		return true;
		}else {
			System.out.println("	2. PREFIX Fail");
			return false;
		}
		
	}
}
