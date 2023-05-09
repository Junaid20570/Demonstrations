package fstAssignment;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class AssignmentCheck {
	
	public static void main(String[] args) {
		List<String> list=Arrays.asList("aba","mom","wDd","svsQ");
		//System.out.println("My Result "+list.stream().anyMatch(element-> element.matches(".*[A-Z].*")));
		//System.out.println("My Result all match "+list.stream().allMatch(element-> element.matches(".*[A-Z].*")));
		//System.out.println("My Result "+list.stream().anyMatch(element-> isSimplePalindrome(element) ));	
		Optional<String> optStr= list.stream().filter(element-> isSimplePalindrome(element)).findFirst();
		if(optStr.isPresent())
		System.out.println(optStr.get());
		else
		System.out.println("no palindrome found");


	}
	
	public static boolean isSimplePalindrome(String str) {
		StringBuilder sb=new StringBuilder(str);
		String rev=sb.reverse().toString();
		if(str.equalsIgnoreCase(rev))
		return true;
		else
		return false;
		}

}
