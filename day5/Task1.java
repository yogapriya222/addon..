package addon_day5;

public class Task1 {
	


	class Node {
	    int data;
	    Node next;

	    public Node(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}

	
	    private Node tail = null;

	  
	    public void insert(int data) {
	        Node newNode = new Node(data);
	        if (tail == null) {
	            tail = newNode;
	            tail.next = tail; 
	        } else {
	            newNode.next = tail.next; 
	            tail.next = newNode;
	            tail = newNode; 
	        }
	    }

	    public void display() {
	        if (tail == null) {
	            System.out.println("List is empty.");
	            return;
	        }
	        Node temp = tail.next; 
	        do {
	            System.out.print(temp.data + " <--> ");
	            temp = temp.next;
	        } while (temp != tail.next);
	        System.out.println("head value");    }

	    public static void main(String[] args) {
	        Task1 cll = new Task1();
	        cll.insert(10);
	        cll.insert(20);
	        cll.insert(30);
	        cll.insert(40);

	        System.out.println("Circular Linked List:");
	        cll.display();
	    }
	}