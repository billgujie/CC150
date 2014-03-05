
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Ch2 solution = new Ch2();
		Node root= new Node(5);
		Node a= new Node(4);
		Node b= new Node(3);
		Node c= new Node(2);
		Node d= new Node(1);
		Node e= new Node(0);
		
		root.appendToTail(a);
		root.appendToTail(b);
		root.appendToTail(c);
		root.appendToTail(d);
		root.appendToTail(e);

		System.out.println(root.toString());
		
		System.out.println(solution.partition(root, 2).toString());

	}

}
