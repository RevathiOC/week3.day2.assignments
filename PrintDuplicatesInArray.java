package week3.day2Collections;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		List<Integer> arrList=new ArrayList<Integer>();
		Set<Integer> newList=new LinkedHashSet<Integer>();

		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int count=0;
		for(int i:arr)
		{
			arrList.add(i);
		}
		System.out.println(arrList);
		
		for(int j=0;j<arrList.size();j++)
		{
			for(int k=j+1;k<arrList.size()-1;k++)
			{
				if(arrList.get(j)==arrList.get(k))
				{
					newList.add(arrList.get(j));
					count=count+1;
				}
			}
		}
			if(count>0)
			{
				System.out.println("duplicateList:"+newList);
			}
		}
		
	}



