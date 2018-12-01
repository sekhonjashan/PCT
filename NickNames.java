import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class NickNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "aabaa";

		Scanner sc = new Scanner(System.in);
		
		name = sc.nextLine();
		
		createNick(name);
		
	}

	private static void createNick(String name) {
		// TODO Auto-generated method stub
		int i =0;
		int j=0;
		int k=0;
		int l=0;
		int m=0;
		
		String[] nick = new String[5];
		
		List<String> NickNames = new ArrayList<>();
		List<String> NickNamesF = new ArrayList<>();
		
		if(name.length() == 1) {
			System.out.println(name);
		}
		
		if(name.length() == 2) {
		
			nick[0] = name.substring(0,1);
			nick[1] = name.substring(1,2);

			for(i=0;i<=1;i++) {
				for(j=0;j<=1;j++) {
					NickNames.add(nick[i]+nick[j]);	
				}
			}
			
			NickNamesF = NickNames.stream().filter(c->c.contains(nick[0]) && c.contains(nick[1])).distinct().sorted().collect(Collectors.toList());
			
			for(i=0;i<NickNamesF.size();i++) {
				System.out.print(NickNamesF.get(i)+" ");
			}
			
		}
		
		
		if(name.length() == 3) {
			nick[0] = name.substring(0,1);
			nick[1] = name.substring(1,2);
			nick[2] = name.substring(2,3);
		
			for(i=0;i<3;i++) {
				for(j=0;j<3;j++) {
					for(k=0;k<3;k++) {
								NickNames.add(nick[i]+nick[j]+nick[k]);
								
					}
				}
			}
			
			NickNamesF = NickNames.stream().filter(c->(c.contains(nick[0]) && c.contains(nick[1]) 
					&& c.contains(nick[2]))).distinct().sorted().collect(Collectors.toList());
			
			System.out.println("here");
			for(i=0;i<NickNamesF.size();i++) {
				System.out.print(NickNamesF.get(i)+" ");
			}
			
		}
		
		if(name.length() == 4) {
			nick[0] = name.substring(0,1);
			nick[1] = name.substring(1,2);
			nick[2] = name.substring(2,3);
			nick[3] = name.substring(3,4);
		
			for(i=0;i<4;i++) {
				for(j=0;j<4;j++) {
					for(k=0;k<4;k++) {
						for(l=0;l<4;l++) {
								
								NickNames.add(nick[i]+nick[j]+nick[k]+nick[l]);
								
						}
					}
				}
				
			}
			
			NickNamesF = NickNames.stream().filter(c->c.contains(nick[0]) && c.contains(nick[1]) 
					&& c.contains(nick[2] ) && c.contains(nick[3])
					).distinct().sorted().collect(Collectors.toList());
			
			for(i=0;i<NickNamesF.size();i++) {
				System.out.print(NickNamesF.get(i)+" ");
			}
		}

		
		if(name.length() == 5) {
			
			nick[0] = name.substring(0,1);
			nick[1] = name.substring(1,2);
			nick[2] = name.substring(2,3);
			nick[3] = name.substring(3,4);
			nick[4] = name.substring(4,5);
			
			for(i=0;i<5;i++) {
				for(j=0;j<5;j++) {
					for(k=0;k<5;k++) {
						for(l=0;l<5;l++) {
							for(m=0;m<5;m++) {
								
								NickNames.add(nick[i]+nick[j]+nick[k]+nick[l]+nick[m]);
								
							}
						}
					}
				}
				
			}
			
			NickNamesF = NickNames.stream().filter(c->c.contains(nick[0]) && c.contains(nick[1]) 
					&& c.contains(nick[2] ) && c.contains(nick[3]) && c.contains(nick[4])
					).distinct().sorted().collect(Collectors.toList());
			
			
			for(i=0;i<NickNamesF.size();i++) {
				System.out.print(NickNamesF.get(i)+" ");
			}
		}
		
		
		
	}
	
	

}
