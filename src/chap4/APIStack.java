package chap4;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Stack;

public class APIStack {
	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.push(0);
		stack.push(10);
		stack.push(15);
		stack.push(80);
		stack.push(0);
		stack.push(10);
		stack.push(15);
		stack.push(80);
		stack.push(0);
		stack.push(10);
		stack.push(15);
		stack.push(80);
		stack.push(0);
		stack.push(10);
		stack.push(15);
		stack.push(80);
		
		int x;
		x = stack.capacity();
		System.out.println("容量" + x);
		
		x = stack.size();
		System.out.println("サイズ" + x);
		
		Enumeration<Integer> y = stack.elements();
		
		System.out.println(y);
	}

}
