package addon_day1;
import java.util.Scanner;

import java.util.Arrays;
public class Task_2 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print(""
	        		+ "number of elements: ");
	        int n = sc.nextInt();
	        int[] arr = new int[n];

	        System.out.println("Enter the elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        Arrays.sort(arr);
	        int min = arr[0];
	        int max = arr[n - 1];
	        System.out.println("Min: " + min);
	        System.out.println("Max: " + max);

	   
	    }
	
		
 
	}


