import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class ConnectedNodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		int nodes = Integer.parseInt(sc.nextLine());
		int edges = Integer.parseInt(sc.nextLine());
		
		int arr[][] = new int[nodes][nodes];
		
		
		for (int i = 0 ; i <edges ; i ++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			arr[x][y] = 1;
			arr[y][x] = 1;
			
		}
		
		{
		
			if(edges == calculateEdges(nodes)) {
				
				System.out.print(1 + " " + 1);
				
			}
			
			else {
				System.out.print(0 + " ");
				int count = 0;
				Queue<Integer> Q = new LinkedList<Integer>();
				List<Integer> AllNodes = new ArrayList<>();
				for(int i =0 ; i < nodes ; i ++) {
					AllNodes.add(i);
				}
				
				
				List<Integer> visited = new ArrayList<>();
				//root
				int root = 0 ;
				//Q.add(AllNodes.get(root));
				
				while(visited.size() != AllNodes.size()) {
					
					while (visited.contains(root)) {
						root++;
					}
					int x = AllNodes.get(root);
					
					visited.add(AllNodes.get(root));
					Q.add(x);
					
				while(!Q.isEmpty()) {
					int j = (int) Q.poll();
				
				
						for ( int k = 0  ; k <nodes ; k ++) {
						
							if (arr[j][k]==1) {
								
								if(!visited.contains(k)) {
									Q.add(k);
									visited.add(k);
									
								}
								
							}
						}
						
					}
				count++;
					
				}
				System.out.print(count);	
			}
				
			}
		
			
		

	}

	private static int calculateEdges(int nodes) {
		// TODO Auto-generated method stub
		int result = 0;
		
		result = (nodes*(nodes-1))/2;
		
		return result;
	}

}
