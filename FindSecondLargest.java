package week3.day2Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Here is the input
				//int[] data = {3,2,11,4,6,7};

				
				/*
				 Pseudo Code:
				 1) Arrange the array in ascending order
				 2) Pick the 2nd element from the last and print it
				 */
				
			Integer [] data= {3,2,11,4,6,7};
		List<Integer> lst=new ArrayList<Integer>();
			//Set<Integer> lst=new HashSet<Integer>();
			Collections.addAll(lst,data);
			
			Collections.sort(lst);
			System.out.println(lst);
		
		System.out.println("second largest no is: "+lst.get(lst.size()-2));
				
	}

}
