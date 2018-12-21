import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
public class CombinationString {
   public static void main(String[] args) {
    String name = "";

		Scanner sc = new Scanner(System.in);
		
		name = sc.nextLine();
		
		possibilityComb(name);
   }
   
   private static void possibilityComb(String name){
	   List<String> resultArray = new ArrayList<>();
	   String[] temp = name.split("");
	   for(int i=0; i< temp.length;i++){
		  String[] _temp = temp.clone();
		  for(int j=0;j<temp.length;j++){
			  if(temp[i] != temp[j]){
			  String str = _temp[i];
			  _temp[i] = _temp[j];
              _temp[j] = str;
			  if(!resultArray.contains(String.join("",_temp))){
				  resultArray.add(String.join("",_temp));
			  }
			  }else{
				if(!resultArray.contains(String.join("",_temp))){
				  resultArray.add(String.join("",_temp));
			  }
			  }
		  }
	   }
	   String finalResult = "";
	   resultArray.sort(Comparator.naturalOrder());
	/*   for(int index=0;index<resultArray.size();index++){
		   if(index == resultArray.size()){
			   finalResult = finalResult + resultArray.get(index);
		   }else{
			finalResult = finalResult + resultArray.get(index)+ " ";
		   }
	   }*/
	   resultArray.stream().forEach(System.out::print);
	   
	  // System.out.println(finalResult);
   }
   
}