package week2.day1;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		String str = "arira";
		char[] str1 = str.toCharArray();
		String rev = "";
		for(i=str1.length-1;i>=0;--i)
			
		{
			rev=rev+str.charAt(i);
			
		}
		if(str.equals(rev))
		{
			System.out.println("the string is a palindrome");
			
		}
		else
			
			System.out.println("the string is not a palindrome");

	}

}
