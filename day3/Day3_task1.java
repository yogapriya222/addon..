package addon_day3;
   class Node {
	    int data;
	    Node next;

	    Node(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}

	public class Day3_task1 {
	    private Node head;

	    
	    public void addNode(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	        } else {
	            Node current = head;
	            while (current.next != null) {
	                current = current.next;
	            }
	            current.next = newNode;
	        }
	    }

	       public void traverse() {
	        Node current = head;
	        while (current != null) {
	            System.out.print(current.data + "-> ");
	            current = current.next;
	        }
	        System.out.println("null");
	    }

	    public static void main(String[] args) {
	    	Day3_task1  list = new Day3_task1 ();
	        list.addNode(10);
	        list.addNode(20);
	        list.addNode(30);
	        list.traverse(); 
	    }
	}


