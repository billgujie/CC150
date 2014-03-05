
public class Ch2 {
	//2.1
	public void deleteDups(Node root){
		if (root==null||root.next==null){
			return;
		}
		
		Node head = root;
		
		while(head!=null){
			Node runner = head;
			while(runner.next!=null){
				if (runner.next.data==head.data){
					runner.next=runner.next.next;
				}else{
					runner=runner.next;
				}
			}
			head=head.next;
		}
	}
	
	//2.2
	public int kthToLast(Node root, int k){
		Node head = root;
		Node tail = root;
		
		// get spaced out
		for (int i=0; i<k;i++){
			tail=tail.next;
		}
		
		while (tail!=null){
			head=head.next;
			tail=tail.next;
		}
		
		return head.data;
	}
	
	//2.3
	public void deleteNode(Node t){
		if (t==null||t.next==null){
			return;
		}
		t.data=t.next.data;
		t.next=t.next.next;
	}
	
	//2.4
	public Node partition(Node root, int x){
		Node p1=null;
		Node p1end=null;
		Node p2=null;
		Node p2end=null;
		
		while(root!=null){
			if(root.data<x){
				if (p1==null){
					p1=root;
					p1end=p1;
				}else{
					p1end.next=root;
					p1end=p1end.next;
				}
			}else{
				if (p2==null){
					p2=root;
					p2end=p2;
				}else{
					p2end.next=root;
					p2end=p2end.next;
				}
			}
			root=root.next;
		}
		p2end.next=null;
		p1end.next=p2;
		return p1;
	}
	
	//2.5
	
}
