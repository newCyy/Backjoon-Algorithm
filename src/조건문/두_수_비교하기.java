//import java.util.*;
//public class Main {
package 조건문;

import java.util.*;

public class 두_수_비교하기 {
	/*
	 * 문제 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
	 * 
	 * 입력 첫째 줄에 A와 B가 주어진다. A와 B는 공백 한 칸으로 구분되어져 있다.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();

		int A = Integer.parseInt(num.split(" ")[0]);
		int B = Integer.parseInt(num.split(" ")[1]);
		
		if (A>B) {
			System.out.println(">");
			}
			else if (A<B) {
				System.out.println("<");
			}else {
				System.out.println("==");
				}
			}

	}

