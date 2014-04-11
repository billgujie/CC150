
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Ch2 solution = new Ch2();
		Node r1= new Node(1);
		//Node r2= new Node(5);
		Node a= new Node(2);
		Node b= new Node(3);
		Node c= new Node(4);
		Node d= new Node(5);
		Node e= new Node(6);
		Node f= new Node(7);
		
		r1.appendToTail(a);
		r1.appendToTail(b);
		r1.appendToTail(c);
		r1.appendToTail(d);
		r1.appendToTail(e);
		r1.appendToTail(f);
		
		int removalRequests[]={6};
		
		System.out.println(r1.toString());
		System.out.println(solution.Remove(r1, removalRequests, removalRequests.length).toString());

		
		

	}

}
