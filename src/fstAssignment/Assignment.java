package fstAssignment;

import java.util.List;
import java.util.Optional;
import java.util.ArrayList;
public class Assignment {

	boolean containsCaps(List<String>  list)
	{
		return list.stream().anyMatch(x->(x.matches("^.*[A-Z].*$"))) ;
	}
//=======================================================================
	boolean allElementsContainsCaps(List<String>  list)
	{
		
		return list.stream().allMatch(element-> element.matches(".*[A-Z].*"));

	}
//======================================================================================
	boolean getPalindrome(List<String>  list) {
		
		return list.stream().anyMatch(element->{StringBuilder sb=new StringBuilder(element);
		String rev=sb.reverse().toString();
		if(element.equalsIgnoreCase(rev))
		return true;
		else
		return false;} );
		
		
	}
//================================================================================
	String getFirstPalindrome(List<String>  list)
	{
	Optional<String> optStr= list.stream().filter(element->{
		StringBuilder sb=new StringBuilder(element);
		String rev=sb.reverse().toString();
		if(element.equalsIgnoreCase(rev))
			return true;
		else
			return false;}).findFirst();
	if(optStr.isPresent())
		return (optStr.get());
	else
		return ("no palindrome found");

	}



	public static void main(String args[]) {
		List<String> ls=new ArrayList<String>();
		ls.add("Ksb");
		ls.add("kSb");
		ls.add("ksB");
		ls.add("aba");
//=================================================================================
	/*	if(new Assignment().containsCaps(ls)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}*/
//=======================================================================================
	/*	if(new Assignment().allElementsContainsCaps(ls)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}*/
//==================================================================================
	/*	if(new Assignment().getPalindrome(ls)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}*/
		
//=================================================================================
		//System.out.println(new Assignment().getFirstPalindrome(ls));
		
	}
}
