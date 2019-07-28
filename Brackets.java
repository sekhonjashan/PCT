import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

import javax.management.Query;

public class Brackets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int t = Integer.parseInt(sc.nextLine());
		List<String> result = new ArrayList<String>();

		while (t-- > 0) {
			String s = sc.nextLine();

			Stack<Character> q1 = new Stack<Character>();
			int flag = 0;
			for (int i = 0; i < s.length(); i++) {
				char x = s.charAt(i);

				if (x == '(' || x == '{' || x == '[') {
					q1.push(x);
				}
				if (x == ')' || x == '}' || x == ']') {

					char y = 'z';
					if (x == ')') {
						y = '(';
					}
					if (x == '}') {
						y = '{';
					}
					if (x == ']') {
						y = '[';
					}
				
					if(q1.size() ==0) {
						flag = 1;
						break;
					}
				
					char res = (char) q1.lastElement();
					if (res == y) {
						q1.pop();
					}
				}

			}

			if (q1.size() > 0 || flag ==1) {
				result.add("FALSE");
				// System.out.print("FALSE");
			} else {
				result.add("TRUE");
			//	System.out.print("TRUE");
			}

		}

		for (int i = 0; i < result.size(); i++) {

			if (i == result.size() - 1) {
				System.out.print(result.get(i));
			} else {
				System.out.println(result.get(i));
			}
		}

	}

}
