import java.util.PriorityQueue;

public class OriginQuestion {
//	public static class Point {
//		public double x;
//		public double y;
//	}

	// calculate all points distance to the origin, and add them to a max-heap
	// of size k
	// at the end all k closest points are in the heap
	public static Point[] closestk(Point myList[], int k) {
		Point[] retval= new Point[k];
		PriorityQueue<Point> heap = new PriorityQueue<Point>(k);
		for (Point point : myList) {
			if (heap.size() < k) {
				heap.offer(point);
			} else {
				if (compare(heap.peek(), point) < 0) {
					heap.poll();
					heap.offer(point);
				}
			}
		}
		// got heap
		for(int i=0;i<k;i++){
			retval[i]=heap.poll();
		}
		return myList;
	}

	public static int compare(Point a, Point b) {
		double distA = a.x * a.x + a.y * a.y;
		double distB = b.x * b.x + b.y * b.y;
		if (distA < distB) {
			return -1;
		} else if (distA > distB) {
			return 1;
		} else {
			return 0;
		}
	}
}