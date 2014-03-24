
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
//		Ch2 solution = new Ch2();
//		Node r1= new Node(1);
//		//Node r2= new Node(5);
//		Node a= new Node(2);
//		Node b= new Node(2);
//		Node c= new Node(3);
//		Node d= new Node(2);
//		Node e= new Node(2);
//		Node f= new Node(1);
//		
//		r1.appendToTail(a);
//		r1.appendToTail(b);
//		//r1.appendToTail(c);
//		r1.appendToTail(d);
//		r1.appendToTail(e);
//		r1.appendToTail(f);
//
//		
//		System.out.println(r1.toString());
//		//System.out.println(r2.toString());
//		
//		System.out.println(solution.detectPalindrome(r1));
		//OriginQuestion a = new OriginQuestion();
		Point[] list = new Point[9];
		list[0]=new Point(1,1);
		list[1]=new Point(1, 3);
		list[2]=new Point(-1, 1);
		list[3]=new Point(-1, 3);
		list[4]=new Point(1, -1);
		list[5]=new Point(3, -1);
		list[6]=new Point(-1, -1);
		list[7]=new Point(-1, 3);
		list[8]=new Point(2, 2);
		
		Point[] result = OriginQuestion.closestk(list, 3);
		int y=0;
		
		

	}

}
