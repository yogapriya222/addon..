package addon_day4;

public class Task2 {
	
			 Node head;

			    class Node {
			        int data;
			        Node next;
			        Node prev;

			        Node(int val) {
			            data = val;
			            next = null;
			            prev = null;
			        }
			    }

			    public Task2() {
			        head = null;
			    }

			    public void display() {
			        Node temp = head;
			        while (temp != null) {
			            System.out.print(temp.data + " ");
			            temp = temp.next;
			        }
			        System.out.println();
			        
			    }
			    void insertAtBeginning(int data) {
			        Node newNode = new Node(data);
			        if (head == null) {
			            head = newNode;
			            return;
			        }
			        newNode.next = head;
			        head.prev = newNode;
			        head = newNode;
			    }
			    
			    void insertAtMiddle(int data) {
			        if (head == null) {
			           
			            insertAtBeginning(data);
			            return;
			        }

			        Node slow = head;
			        Node fast = head;

			    
			        while (fast.next != null && fast.next.next != null) {
			            slow = slow.next;
			            fast = fast.next.next;
			        }

			       
			        Node newNode = new Node(data);

			        newNode.next = slow.next;
			        newNode.prev = slow;

			        if (slow.next != null) {
			            slow.next.prev = newNode;
			        }

			        slow.next = newNode;
			    }
			    void insertAtEnd(int data) {
			        Node newNode = new Node(data);
			        if (head == null) {
			            head = newNode;
			            return;
			        }
			        Node temp = head;
			        while (temp.next != null) {
			            temp = temp.next;
			        }
			        temp.next = newNode;
			        newNode.prev = temp;
			    }


			    public static void main(String[] args) {
			        Task2 list = new Task2();
			        list.insertAtEnd(90);
			        list.insertAtEnd(70);
			        list.insertAtBeginning(50);
			        list.insertAtBeginning(10);
			        list.display(); 

			        list.insertAtMiddle(60);
			        list.display();  
			    }
		}




