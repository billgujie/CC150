import java.util.Stack;


public class arrayStack extends Stack<Integer>{
	int stacksize=100;
	int[] buffer = new int [stacksize*3];
	int[] stackPointer = {-1,-1,-1};
	
	public void push(int stackNum, int value) throws Exception{
		if (stackPointer[stackNum]+1>stacksize){
			throw new Exception("Out of space");
		}
		stackPointer[stackNum]++;
		buffer[absTopOfStack(stackNum)]=value;
	}
	
	public int pop(int stackNum) throws Exception{
		if (stackPointer[stackNum]==-1){
			throw new Exception("Empty Stack");
		}
		int retval = buffer[absTopOfStack(stackNum)];
		buffer[absTopOfStack(stackNum)]=0;
		stackPointer[stackNum]--;
		return retval;
	}
	
	public int peek(int stackNum) {
		return buffer[absTopOfStack(stackNum)];
	}
	
	public boolean isEmpty(int stackNum){
		return (stackPointer[stackNum]==-1);
	}
	
	int absTopOfStack(int stackNum){
		return stackNum*stacksize+stackPointer[stackNum];
	}
}
