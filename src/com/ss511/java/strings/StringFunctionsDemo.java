package com.ss511.java.strings;

public class StringFunctionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello Practice World";
		
		System.out.println(str.charAt(1)); //Char present at input index.
		System.out.println(str.indexOf("o"));
		System.out.println(str.indexOf("o", 6)); // Index after the given input index.
		System.out.println(str.lastIndexOf("o")); // Last Index
		System.out.println(str.compareTo("Hello")); // str is lexicographically more than Hello.
		System.out.println(str.compareTo("ello"));
		System.out.println("a".compareTo("d"));
		System.out.println("b".compareTo("a"));
		System.out.println("abc".contentEquals(new StringBuffer("abc"))); // Unlike equals content equals doesn't check for object equality, and only checks the contents
		System.out.println("abc".contentEquals(new StringBuffer("xyz")));
		System.out.println(str.contentEquals("eor"));
		System.out.println(str.contentEquals("Hello Practice World"));
		System.out.println(str.endsWith("rld")); // Checks whether str ends with rld. True
		System.out.println(str.endsWith("wrld")); // Checks whether str ends with wrld False
		System.out.println(str.getBytes()); // Get the string in bytes
		System.out.println(str.toCharArray()); // Convert the string to char array
		System.out.println(str.split(" ")); // Splits the array with " "
		System.out.println(str.startsWith("SSS")); // Checks whether the string starts with SSS
		System.out.println(str.replaceFirst("o", "O")); // Will replace first o with O
		System.out.println(str.replace("o", "O")); // Will replace all o with O
		System.out.println(str.toLowerCase()); // Will make string lower case
		System.out.println(str.toUpperCase()); // Will make string upper case
		System.out.println("  abc  abc  ".trim()); // Removes leading and trailing white spaces.
	}

}
