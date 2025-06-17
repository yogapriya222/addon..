package addon_day9;

import java.util.Arrays;
import java.util.Scanner;
public class task1 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a size:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("target value:");
		int target=sc.nextInt();
		int left=0;
		int right=arr.length;
		int mid;
		while(left<right)
		{
		mid=(left+right)/2;
		if(arr[mid]<target)
		{
		left=mid+1;	
		}
		else if(arr[mid]>=target)
		{
			right=mid;
		}
		try
		{
			if(((arr[left]|(arr[left]))>=target))
			{
				System.out.println("low bound found at index"+left+"and value "+arr[left]);
			}
			else if(target>(arr[left]|arr[right]))
			{
				System.out.println("out of bound");
			
			}
		}
		catch(Exception e)
		{
			System.out.println("out of bounds,no low bounds");
		
            
}}}}
