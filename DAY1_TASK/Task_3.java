package addon_day1;
import java.util.*;
public class Task_3 {
	public static void main(String[] args) {
		//insert
	   int num[]=new int[20];
	Scanner sc=new Scanner(System.in);
	   System.out.println("Enter ur array size");
	   int size=sc.nextInt();

	   for(int i=0;i<size;i++){
	       num[i]=sc.nextInt();
	   
	   }
	   for(int i=0;i<size;i++){
	       System.out.print(num[i]);
	   }
	   System.out.println(Arrays.toString(num));
	   System.out.println("Enter ur value");
	   int newval=sc.nextInt();
	   System.out.println("Enter the position");
	   int pos=sc.nextInt();
	   for(int n=size;n>=pos-1;n--)
	   {
	       num[n]=num[n-1];
	   }
	   num[pos-1]=newval;
	   size++;
	   System.out.println(Arrays.toString(num));
	   
	 //delete
	   	int a[]=new int[20];
	   	System.out.println("enter a size");
	   	int siz=sc.nextInt();
	   	for(int i=0;i<siz;i++)
	   	{
	   		a[i]=sc.nextInt();
	   		
	   	}
	   	for(int i=0;i<siz;i++)
	   	{
	   		System.out.println(a[i]);
	   	}
	   	System.out.println("enter a delete pos");
	   	int delpos=sc.nextInt();
	   	for(int mypos=delpos-1;mypos<siz;mypos++)
	   	{
	   		a[mypos]=a[mypos+1];
	   	}
	   	siz--;
	   	System.out.println(Arrays.toString(a));
	   	
	   	//update
	   	System.out.println(" position for update value");
		int pos2=sc.nextInt();
		a[pos2-1]=sc.nextInt();	
		for(int i=0;i<size;i++){
		       System.out.print(a[i]);
		       System.out.print(" ");

	
	   }}
	   
	         
	   }



