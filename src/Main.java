
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Ch2 solution = new Ch2();
		Node r1= new Node(7);
		Node r2= new Node(5);
		Node a= new Node(1);
		Node b= new Node(6);
		Node c= new Node(2);
		Node d= new Node(9);
		Node e= new Node(0);
		
		r1.appendToTail(a);
		r1.appendToTail(b);
		r2.appendToTail(d);
		r2.appendToTail(c);
		//root.appendToTail(e);

		System.out.println(r1.toString());
		System.out.println(r2.toString());
		
		System.out.println(solution.addTwoNumbers(r1, r2).toString());

	}

}
