//import java.util.*;
//public class Main {
package ���ǹ�;

import java.util.*;

public class ��_��_���ϱ� {
	/*
	 * ���� �� ���� A�� B�� �־����� ��, A�� B�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * 
	 * �Է� ù° �ٿ� A�� B�� �־�����. A�� B�� ���� �� ĭ���� ���еǾ��� �ִ�.
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

