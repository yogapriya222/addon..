package addon_day1;
import java.util.Arrays;
import java.util.Scanner;

public class TASK__2 {
	
	
		public static void main(String[] args) {
			
		
	Scanner s =new Scanner(System.in);
		
		System.out.println(" array length:");
		int n = s.nextInt();
		int[] a =new int[n];
		int [] b=new int[n];
		System.out.println("Enter  elements:");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		
		System.out.println("A1");
		System.out.println(Arrays.toString(a));
		for(int i=0;i<n;i++)
		{
			b[i]=a[i];
		}
		System.out.println("A2");
		System.out.println(Arrays.toString(b));
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(b[j]<b[i])
				{
					int temp=b[j];
					b[j]=b[i];
					b[i]=temp;
				}
				
			}
		}
		System.out.println("Descending order");
		
	   
		System.out.println(Arrays.toString(b));
		}
		}


