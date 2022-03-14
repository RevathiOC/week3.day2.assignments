package week3.day2Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Intersection {

	public static void main(String[] args) {
		// using set
		Set<Integer> st1=new HashSet<Integer>();
		Set<Integer> st2=new HashSet<Integer>();
		Integer[] arr1= {3,2,11,4,6,7};
		Integer[] arr2= {1,2,8,4,9,7};
		Collections.addAll(st1,arr1);
		System.out.println("set1: "+st1);
		Collections.addAll(st2,arr2);
		System.out.println("set2 :"+st2);
		st1.retainAll(st2);
		System.out.println(st1);

	}

}
