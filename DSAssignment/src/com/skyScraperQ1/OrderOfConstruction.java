package com.skyScraperQ1;
import java.util.Stack;

public class OrderOfConstruction {
	
	public void floor(int[] a, int n) {
		// TODO Auto-generated method stub
     System.out.println("The order of construction is as follows");
		
		Stack<Integer> stk = new Stack<>();

		int[] temp = new int[n];
		int max = n;
		System.out.println();
		for (int i = 0; i < n; i++) {
			System.out.println("Day: "+(i+1));
			temp[i] = a[i];
			stk.add(temp[i]);
			while (!stk.isEmpty() && stk.peek() == max) {

				System.out.print(stk.pop() + " ");

				max--;
			}

			System.out.println();
        }
	}

}

