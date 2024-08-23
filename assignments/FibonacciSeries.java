package week1.assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		
	   int range = 8;
       int a=0;
       int b=1;
       int c;
       
       System.out.print("FibonacciSeries= ");
       for(int i =1;i<=range;i++)
       {
    	   c=a+b;
    	   System.out.print(a+ ",");
    	   a=b;
    	   b=c;
       }
	}

}
