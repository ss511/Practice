package com.ss511.java.strings;

/**
 * String is immutable. If any substitution operations is performed it creates a new object and left the previous one
 * for garbage collection. Hence comes StringBuilder to perform operations on same object.
 * @author Shashank
 *
 */
public class StringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder("Hello Practice World");
		
		System.out.println(sb);
		System.out.println(sb.toString());
		
		sb.insert(1, "XX");
		System.out.println(sb);
		
		sb.replace(5, 7, "XX");
		System.out.println(sb);
		
		sb.delete(9, 11);
		System.out.println(sb);
		
		System.out.println(sb.reverse());
		System.out.println(sb.length());
		System.out.println(sb.reverse());
		
		for (int i = 0; i < 5; i ++) {
			sb.append("XXX" + i);
		}
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity()); // Capacity is always more than length.
	}

}
