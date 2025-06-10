package addon_day3;

public class Task2 {
   
      class Node {
	    int data;
	    Node next;

	      Node(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}

	
	    Node head;

	  
	    public void insertAtPosition(int data, int position) {
	        Node newNode = new Node(data);

	        if (position <= 0) {
	            System.out.println("Invalid position! Use 1 or higher.");
	            return;
	        }

	        if (position == 1 || head == null) {
	            newNode.next = head;
	            head = newNode;
	            return;
	        }

	        Node temp = head;
	        for (int i = 1; temp != null && i < position - 1; i++) {
	            temp = temp.next;
	        }

	        if (temp == null) {
	            System.out.println("Position out of bounds!");
	            return;
	        }

	        newNode.next = temp.next;
	        temp.next = newNode;
	    }

	  
	    public void traverse() {
	        Node temp = head;
	        if (temp == null) {
	            System.out.println("The linked list is empty.");
	            return;
	        }

	        System.out.print("Linked List: ");
	        while (temp != null) {
	            System.out.print(temp.data + " -> ");
	            temp = temp.next;
	        }
	        System.out.println("null");
	    }

	    public static void main(String[] args) {
	        Task2 list = new Task2();

	        
	        list.insertAtPosition(10, 1);
	        list.insertAtPosition(20, 2);
	        list.insertAtPosition(30, 3);
	        list.insertAtPosition(25, 3);
	        list.insertAtPosition(5, 1);  

	       
	        list.traverse();
	    }
	}

