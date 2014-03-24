import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Stack;


public class Ch3_3 {
	
	//Ch3.3 imagine a stack of plates, if the stack gets too high.
	//implement push and pop
	class SetOfPlates {
		private ArrayList<Stack<Integer>> stacks;
		private int threshold;
		
		public SetOfPlates(int threshold){
			this.threshold=threshold;
			stacks = new ArrayList<Stack<Integer>>();
		}
		
		private Stack<Integer> getLastStack(){
			if (stacks.isEmpty()){
				return null;
			}else{
				return stacks.get(stacks.size()-1);
			}
		}
		
		public void push(int val){
			Stack<Integer> sk = getLastStack();
			if (sk==null){
				Stack<Integer> st = new Stack<Integer>();
				st.push(val);
				stacks.add(st);
			}else{
				 if (sk.size()==threshold){
					 Stack<Integer> st = new Stack<Integer>();
					 st.push(val);
					 stacks.add(st);
				 }else{
					 sk.push(val);
				 }
			}
		}
		
		public int pop(){
			Stack<Integer> sk = getLastStack();
			if (sk==null){
				throw new EmptyStackException();
			}
			int retval =sk.pop();
			if (sk.size()==0){
				stacks.remove(stacks.size()-1);
			}
			return retval;
		}
		
	}
	
	//Ch3.4
	
}
