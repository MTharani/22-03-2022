package com.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class MyLinked {

	public static void main(String[] args)
	{
		//LinkedList
		LinkedList<Integer> iob=new LinkedList<Integer>();
		iob.add(456);
		iob.add(786);
		iob.add(756);
		iob.add(651);
		iob.add(3, 1111);
		System.out.println(iob);
		
		LinkedList<Integer> iob1=new LinkedList<Integer>();
		iob1.add(786);
		iob1.add(222);
		System.out.println(iob.containsAll(iob1));
		System.out.println(iob.addAll(iob1));
		System.out.println(iob);
		Collections.sort(iob);
		System.out.println(iob);
		
		//String array list
		LinkedList<String> list= new LinkedList<String>();
		list.add("divi");
		list.add("devi");
		list.add("seetha");
		list.add("zhara");
		list.add(1, "devaki");
		System.out.println(list);
		Collections.sort(list);
		System.out.println("before shuffle:"+list);
		Collections.shuffle(list);
		System.out.println("after shuffle:"+list);
		Collections.shuffle(list);
		System.out.println("2 time shuffle"+list);
		
		//float
		LinkedList<Float> fob=new LinkedList<Float>();
		fob.add(56.3f);
		fob.add(78.2f);
		fob.add(75.6f);
		fob.add(6.1f);
		fob.add(3, 11.11f);
		System.out.println(fob);


	}

}
