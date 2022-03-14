package week3.day2Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Pseudo Code
		
		 * a) Declare An array for {3,2,11,4,6,7};	 
		 * b) Declare another array for {1,2,8,4,9,7};
		 * c) Declare for loop iterator from 0 to array length
		 * d) Declare a nested for another array from 0 to array length
		 * e) Compare Both the arrays using a condition statement
		 
		 *  f) Print the first array (shoud match item in both arrays)
		 */
		
		
		List<Integer> lst1=new ArrayList<Integer>();
		List<Integer> lst2=new ArrayList<Integer>();
		Integer[] arr1= {3,2,11,4,6,7};
		Integer[] arr2= {1,2,8,4,9,7};
		Collections.addAll(lst1,arr1);
		System.out.println("list1: "+lst1);
		Collections.addAll(lst2,arr2);
		System.out.println("list2 :"+lst2);
		String output=" ";
		
		for(int i=0;i<lst1.size();i++)
		{
			for(int j=0;j<lst2.size();j++)
			{
				if(lst1.get(i)==lst2.get(j))
				{
					output=output+" "+lst1.get(i).toString();
					
				}
				
			}
		}
		System.out.println("items matched"+output);
		
		
		
	}

}
