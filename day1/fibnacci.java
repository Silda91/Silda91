package week1.day1;

public class fibnacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x=5,fnum=0,snum=1,sum,i;
for(i=0;i<=x;i++)
{
System.out.println(fnum);	
sum=fnum+snum;
fnum=snum;
snum=sum;
}
	}

}
