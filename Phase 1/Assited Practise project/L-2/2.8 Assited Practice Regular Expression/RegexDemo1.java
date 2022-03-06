package simlilearn.com.java;

import java.util.regex.Pattern;

public class RegexDemo1 {
	public static void main(String[] args) {
		String pattern = ".s";
		String input = "simplilearn";


		System.out.println(Pattern.matches("^(.+)@(.+)$", "adarsh@simplilearn.com"));
		System.out.println(Pattern.matches("^[a-zA-Z0-9_.-]+@(.+)$", "adarsh@simplilearn.com"));
		
		System.out.println();

	}

}
