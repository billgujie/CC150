import java.util.Stack;


public class Ch2 {
	
	//MeridianLink Test
	public Node Remove( Node firstNode, int[] removalRequests, int removalRequests_Length ) 
	{ 
		if (firstNode==null){
			return null;
		}
		Node head = firstNode;
		Node cur = firstNode;
		int node_count=0;
		for (int i=0; i< removalRequests_Length; i++){
			int target=removalRequests[i];
			while (node_count!=target-1){//run to the node before target node
				cur=cur.next;
				node_count++;
			}
			cur.next=cur.next.next;
			node_count++;
		}
		return head;
	} 
	
	
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
	//reversed order
    public Node addTwoNumbers(Node l1, Node l2) {
        int c=0;
        Node res = null;
        Node cur = null;
        Node i1 = l1;
        Node i2 = l2;
        while(i1!=null||i2!=null){
            int num1 = i1 == null? 0 : i1.data;
            int num2 = i2 == null? 0 : i2.data;
            int temp = num1+num2+c;
            if (temp>=10){c=1;}else{c=0;}
            if (res==null){
                res=new Node(temp%10);
                cur=res;
            }else{
                cur.next=new Node(temp%10);
                cur=cur.next;
            }
            i1 = i1 == null? null: i1.next;
            i2 = i2 == null? null: i2.next;
        }
        if (c==1){
            cur.next=new Node(1);
        }
        return res;
    }
    
    //2.5
    //follow up
    //forward order
    public Node addTwoNumbersFO(Node l1, Node l2) {
    	Node res=null;
    	//missing
    	return res;
    }
    
    //2.6
    
    public Node findLoopStart(Node root){
    	//hare and rabbit
    	Node hare = root;
    	Node turt = root;
    	
    	while(hare.next!=null && turt!=null){
    		turt=turt.next;
    		hare=hare.next.next;
    		if (turt==hare){
    			break; //found meeting point
    		}
    	}
    	
    	//error checking
    	if (turt==null||turt.next==null){
    		return null;
    	}
    	
    	hare=root;
    	while(hare!=turt){
    		hare=hare.next;
    		turt=turt.next;
    	}
    	//found entrance
    	return hare;
    }
    
    //2.7
    //odd list 1->2->2->3->2->2->1
    //even list  1->2->3->3->2->1
    //assume list length is not provided
    public boolean detectPalindrome(Node head){
    	Node slow=head;
    	Node fast=head;
    	Stack<Integer> s = new Stack<Integer>();
    	
    	while(fast!=null&&fast.next!=null){
    		s.push(slow.data);
    		slow=slow.next;
    		fast=fast.next.next;//X2 speed
    	}
    	if (fast!=null){
    		slow=slow.next;
    	}
    	
    	while(!s.empty()){
    		int val=s.pop().intValue();
    		int cur=slow.data;
    		if (cur!=val){
    			return false;
    		}
    		slow=slow.next;
    	}
    	return true;
    }
}
