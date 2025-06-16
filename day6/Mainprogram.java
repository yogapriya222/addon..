package addon_day6;
import java.util.Arrays;
public class Mainprogram {
            int []arr=new int[5];
      int rear;
       int front;
      public void Mainprogram()
      {
    	  rear=-1;
    	  front=-1;
      }
      public void enqueue(int num)
      {
    	  if(rear==4) {
    		  System.out.println("queue spaceout");
    	  }
    	  else
    	  {
    		  arr[++rear]=num;
    	  }
      }
      public void dequeue()
      {
    	  if(front==4)
    	  {
    		  System.out.println("stack empty");
    	  }
    	  else
    	  {
    		  arr[++front]=0;
    	  }
      }
      public void display()
      { for(int i=0;i<arr.length;i++)
      {
    	  System.out.println(arr[i]+" ");
      }
      }
      public static void main(String[] args)
      {
    	  Mainprogram sc=new Mainprogram();
    	  sc.enqueue(20);
    	  sc.enqueue(30);
    	  sc.enqueue(40);
    	  sc.enqueue(50);
    	  sc.enqueue(60);
    	  sc.display();
    	  sc.dequeue();
    	  sc.display();
    	  
      }
      }
