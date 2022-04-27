package week1.day2;
import java.util.Arrays;
public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,4,7,6,8};
		int i;
		Arrays.sort(arr);
		for (i=arr[0];i<=arr.length;i++)
		{
			if(i!=arr[i-1])
			{
				System.out.println("missing element is "+i);
				break;
			}
		}

	}

}
