package post_assingnment6;

public class post_assingnment_6 {
	
	
		class Node {
		    int data;
		    Node next;

		    Node(int data) {
		        this.data = data;
		        this.next = null;
		    }
		}

		
		    private Node top;

		    public post_assingnment_6() {
		        top = null;
		    }

		    public void push(int value) {
		        Node newNode = new Node(value);
		        newNode.next = top;
		        top = newNode;
		    }

		    public int pop() {
		        if (top == null) {
		            System.out.println("Stack Underflow");
		            return -1;
		        }
		        int value = top.data;
		        top = top.next;
		        return value;
		    }

		    public int peek() {
		        if (top == null) {
		            System.out.println("Stack is Empty");
		            return -1;
		        }
		        return top.data;
		    }

		    public void display() {
		        Node current = top;
		        System.out.print("Stack: ");
		        while (current != null) {
		            System.out.print(current.data + " ");
		            current = current.next;
		        }
		        System.out.println();
		    }

		    public static void main(String[] args) {
		    	post_assingnment_6 stack = new post_assingnment_6();
		        stack.push(10);
		        stack.push(20);
		        stack.push(30);
		        stack.display();
		        System.out.println("Popped: " + stack.pop());
		        System.out.println("Peek: " + stack.peek());
		        stack.display();
		    }
		}


