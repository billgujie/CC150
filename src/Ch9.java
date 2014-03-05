
public class Ch9{

	//recursive method
	public static int countWays(int n){
		if (n<0){
			return 0;
		} else if (n==0){
			return 1;
		} else {
			return countWays(n-1) + countWays(n-2)+ countWays(n-3);
		}
		
	}
	
	//DP method
	public static int countWaysDP(int n, int[] map){
		if(n<0){
			return 0;
		} else if (n==0){
			return 1;
		}  else {
			map[n]=countWaysDP(n-1,map)+
					countWaysDP(n-2,map)+
					countWaysDP(n-3,map);
			return map[n];
		}
	}

}
