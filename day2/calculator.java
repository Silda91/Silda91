package week1.day2;

public class calculator {

	public static void main(String[] args) {
		calculator obj= new calculator();
		
		int add= obj.add(3, 4, 1);
		System.out.println(add);
		
		int sub= obj.sub(9,2);
		System.out.println(sub);
		
		double mul= obj.mul(5,3);
		System.out.println(mul);
		
		float div= obj.div(6,2);
		System.out.println(div);
	}
		// TODO Auto-generated method stub
	public 	int add(int num1,int num2,int num3)
		{
			return num1+num2+num3;
		}
		
	public	int sub(int num1,int num2)
		{
			return num1-num2;
		}
	public	double mul(double num1,double num2)
		{
			return num1*num2;
		}
	public	float div(float num1,float num2)
		{
			return num1 / num2;
		}
	}


