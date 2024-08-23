package week1.assignments;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {

		int a[]={1,4,3,2,8,6,7};
		boolean found ;

		Arrays.sort(a);
			for(int i=1;i<a.length;i++)
			{
				found=false;
				for(int num:a)

				{
					if(num==i)
					{
						found=true;
						break;
					}
				}
				if(!found)
				{
					System.out.println(" Missing Element is: "+i);
				}
			}

		}
	}


