package week2.day1;

public class FindType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "@@ welcome $$4 ";
		char[] sarr =str.toCharArray();
		int letter=0,space=0,num=0,specialchar=0,i;
		for(i=0;i<str.length()-1;i++)
		{
			if(Character.isLetter(sarr[i]))
				{
				//letter=0;
				letter= letter+1;
				}
				else if(Character.isDigit(sarr[i]))
				{
					//num=0;
			num=num+1;
				}
			else if(Character.isSpaceChar(sarr[i]))
				{
				//space=0;
				
				space=space+1;
				}
				else
					specialchar=specialchar+1;
		}
		System.out.println("letter :" + letter);
		System.out.println("space :" + space);
		System.out.println("number :" + num);
		System.out.println("special chara :" + specialchar);


	}

}
