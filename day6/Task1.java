package addon_day6;

public class Task1 {
	int mystack[]=new int[5];
	int top=-1;
	public void push(int num)
	{
		if(top==4)
		{
			System.out.println("stack overflow");
			}
		else {
			mystack[++top]=num;
		}
	}
	  public void pop() 
	  {
		  if(top<0)
		  {
			  System.out.println("underflow");
		  }
		  else
		  {
			  System.out.println("\npoped out:"+mystack[top]);
			  --top;
		  }}
		  public void display()
		  {
			  for(int i=0;i<mystack.length;i++)
			  {
				  System.out.print(mystack[i]+" ");
			  }
		  }
		  public static void main(String[] args)
		  {
			  Task1 sc=new Task1();
			  sc.push(20);
			  sc.push(30);
			  sc.push(40);
			  sc.push(50);
			  sc.push(60);
			  sc.display();
			  sc.pop();
			  
	  }
	}