
public class Node {
	Node next =null;
	int data;
	
	public Node(int d){
		data=d;
	}
	
	void appendToTail(int d){
		Node end = new Node(d);
		Node n = this;
		while(n.next!=null){
			n=n.next;
		}
		n.next=end;
	}
	
	void appendToTail(Node d){
		Node end = d;
		Node n = this;
		while(n.next!=null){
			n=n.next;
		}
		n.next=end;
	}
	
	@Override
	public String toString(){
		Node current = this;
		StringBuilder sb = new StringBuilder();
		while(current!=null){
			sb.append(current.data);
			current=current.next;
		}
		return sb.toString();
	}
}
