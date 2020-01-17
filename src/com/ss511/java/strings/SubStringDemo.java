package com.ss511.java.strings;

public class SubStringDemo {

	public static void main(String[] args) {
		String str = "Hello Practice World";
		
		System.out.println(str.substring(5)); // start index
		System.out.println(str.substring(0,4)); // start and end index. Will not include end index
		System.out.println(str.length()); //length of string
		System.out.println(str.substring(10, str.length())); // end index as the last_index+1 which is entire lenght of string.
		System.out.println(str.substring(-1, 5)); // Will result in exception as start index is less than 0.

		//System.out.println(str.substring(10, str.length()+1)); // Will result in exception as end index exceed the entire length.

	}

}
