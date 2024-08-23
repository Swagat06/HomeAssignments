package week1.assignments;

public class IsPrime {

	public static void main(String[] args) {
		int num =13;
		int temp=0;
		
		for(int i=2;i<=num-1;i++)
		{
			if(num%i==0)
			{
				temp=temp+1;
			}
		}
		if(temp>0)
		{
			System.out.println(num+": This is not prime number");
		}
		else
		{
			System.out.println(num+": This is prime number");
		}

	}

}
