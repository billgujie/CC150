import java.util.Stack;
public class Ch3_2 extends Stack<Integer>{
	/**
	 * design a stack which, in addition t push and pop, also has a function min which returns the minimum element?
	 * push, pop and min should all operatore in O(1) time
	 *
	 */
	private Stack<Integer> smin;
	
	public Ch3_2(){
		smin = new Stack<Integer>();
	}
	
	public void push(int a){
		super.push(a);
		if (a<min()){
			smin.push(a);
		}
	}
	
	public Integer pop(){
		int val = super.pop();
		if (val==min()){
			smin.pop();
		}
		return val;
	}
	public int min(){
		if (smin.isEmpty()){
			return Integer.MAX_VALUE;
		}else{
			return smin.peek();
		}
	}
}
