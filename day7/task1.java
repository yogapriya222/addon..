package addon_day7;

import java.util.Arrays;
import java.util.Scanner;
public class task1 {
public static void findbubble(int a[])
{
	System.out.println(Arrays.toString(a));
	for(int i=1;i<a.length;i++) {
		for(int j=0;j<a.length-i;j++) {
			if(a[j]>a[j+1])
			{
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				
			}
		}
	}
	System.out.println(Arrays.toString(a));}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a size");
		int s=sc.nextInt();
		int n[]=new int[s];
		for(int i=0;i<s;i++)
		{
			n[i]=sc.nextInt();
		}
		findbubble(n);
		
	}
		}

