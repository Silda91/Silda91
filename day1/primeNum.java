package week1.day1;

public class primeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int input=7,i;
boolean flag= false;
for(i=2;i<=input/2;i++)
{
	if(input % i==0) {
		flag=true;
		break;
		
	}
	}
if(!flag)
	System.out.println(input +"is a prime number");
else
	System.out.println(input +"is  not a prime number");

	}

}
