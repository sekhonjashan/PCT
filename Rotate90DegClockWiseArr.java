import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Rotate90DegClockWiseArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		if(N < 1 && N >7) {
			System.exit(0);
		}
		
		for(int i = 0 ; i <N ; i ++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int arr1[][] = new int[x][y];
			int arr2[][] = new int[y][x];
			
			for(int j = x -1 ; j>=0 ;j--) {
				for(int k = 0 ; k <y ; k++ ) {
					arr2[k][j] = sc.nextInt();
				}
				
			}
			
			printer(arr2);
			
		}
		
	}

	private static void printer(int[][] arr2) {
		// TODO Auto-generated method stub

		for(int i = 0 ; i < arr2.length ; i ++) {
			for(int j = 0 ; j < arr2[i].length ; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
	}

}
