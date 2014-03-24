import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class amazon {

	public static List<Integer> intersection(List<Integer> a, List<Integer> b) {
		int sizeA = a.size();
		int sizeB = b.size();
		int i=0,j=0;
		List<Integer> retval;
		if (a==null||b==null){
			return null;
		}
		if (sizeA==0 || sizeB==0){
			return null;
		}
		retval=new ArrayList<Integer>();
		Collections.sort(a);
		Collections.sort(b);
		
		//sorted, begin linear scan
		while(i<sizeA && j<sizeB){
			if (a.get(i) > b.get(j)){
				j++;
			}else if (a.get(i)<b.get(j)){
				i++;
			}else{
				retval.add(a.get(i));
				i++;
				j++;
			}
		}
		
		return retval;
	}
}
