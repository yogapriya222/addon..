package addon_day1;
import java.util.Arrays;
public class Twopointers {
	public static void main(String[] args)
	{
		int a[]= {4,2,10,7,5,3,7,8};
		System.out.println(Arrays.toString(a));
	Arrays.sort(a);
	
	int firsst=0;
	int last=a.length-1;
	int temp;
	
	while(firsst<last)
	{
		temp=a[firsst];
		a[firsst]=a[last];
		a[last]=temp;
		firsst++;
		last--;
		
	}
	System.out.println(Arrays.toString(a));
	
	
	
	}
}
