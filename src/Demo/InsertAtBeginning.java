package Demo;
public class InsertAtBeginning {
	static class Node {
		int data;
		Node next;
		Node (int data ){
			this.data = data;

}
	}
	Node head = null;
	//Insert at beginning
	void InsertAtBeginning(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
		
	}
	//Display linked list
	void display () {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " -> ");
			current = current.next;
		}
		System.out.println("null");
		
	}
	public static void main(String[] args) {
		InsertAtBeginning list = new InsertAtBeginning ();
		list.InsertAtBeginning(30);
		list.InsertAtBeginning(20);
		list.InsertAtBeginning(10);
		list.InsertAtBeginning(5);
		list.display();
	}
}
