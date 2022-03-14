package week3.day2Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Here is the input
				Integer [] arr = {1,2,3,4,7,6,8};
				List<Integer> lst=new ArrayList<>();
				Collections.addAll(lst,arr);
				// Sort the array	
				Collections.sort(lst);
				// loop through the array (start i from arr[0] till the length of the array)
				for(int i=1;i<lst.size();i++)
				{
					if(i!=lst.get(i-1))
						{
							System.out.println("missing element is"+i);
							break;
						}
					}

}}
					// check if the iterator variable is not equal to the array values respectively
					
						// print the number
						
						// once printed break the iteration
						
						
				
	


