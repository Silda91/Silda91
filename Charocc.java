package week2.day1;

public class Charocc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = "Welcome To Chenni";
char[] str1 = str.toCharArray();
int c=0,i;
for(i=0;i<str1.length;i++)
{
	if(str1[i]== 'c'|| str1[i]=='C')
	{
		c=c+1;
		
	}
}
	System.out.println(" c in the string :- "+c);
}
	}


