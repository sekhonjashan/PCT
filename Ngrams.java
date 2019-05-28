import java.util.Scanner;

public class Ngrams {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int p = Integer.parseInt(sc.nextLine());
		String text = "";
		
		if(p >0 & p<51) {
		
			for(int i =0 ; i <p ; i++) {
				text = text + sc.nextLine();	
			}
			text = text.toLowerCase().trim().replace(".","").replace(",","").replace(" ","");
			//System.out.println(text);
			
			int ngram = Integer.parseInt(sc.nextLine());
			String res = findFreq(text,ngram);
			
			
		}
		
	}

	private static String findFreq(String text, int ngram) {

		String res = "";
		int count = 0 ;
		if(ngram == 1) {
			for (int i = 0 ; i <text.length(); i ++) {
				String left = "";
				int temp = 0 ;
				left =left + text.charAt(i);
				for (int j = i+1; j < text.length(); j ++) {
					String right = "";
					right = right+ text.charAt(j);
					
					if(left.equals(right)) {
						temp ++;
					}
					if(temp >= count ) {
						count = temp ;
						res = left ;
					}
				}
			}
			System.out.print("Unigram " + res);
			
		}
		if(ngram ==2) {
			
			for (int i = 1 ; i <text.length(); i ++) {
				String left = "";
				int temp = 0 ;
				left =left +  text.charAt(i-1)+text.charAt(i);
				for (int j = i+1; j < text.length(); j ++) {
					String right = "";
					right = right + text.charAt(j-1)+ text.charAt(j);
					
					if(left.equals(right)) {
						temp ++;
					}
					if(temp >= count ) {
						count = temp ;
						res = left ;
					}
				}
			}
			System.out.print("Bigram " + res);
		}
		if(ngram ==3) {
			for (int i = 2 ; i <text.length(); i ++) {
				String left = "";
				int temp = 0 ;
				left =left + text.charAt(i-2) + text.charAt(i-1)+text.charAt(i);
				for (int j = i+1; j < text.length(); j ++) {
					String right = "";
					right = right + text.charAt(j-2)+text.charAt(j-1)+ text.charAt(j);
					
					if(left.equals(right)) {
						temp ++;
					}
				
					}
				if(temp == count ) {
					if(res=="") {
						res = left;
					}
					if(res.compareTo(left)<0) {
						res = res;
					}else if(res.compareTo(left)>0){
						res = left;
					}else {
						res = left;
					}
					count = temp ;
				}else if(temp >count){
					count = temp ;
					res = left ;	
				}
				}
			
			System.out.print("Trigram " + res);
			
		}
		
		return res;
	}

}
