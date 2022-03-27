package com.array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class DemoIterating {

	public static void main(String[] args) 
	{
		ArrayList<Integer> ilist=new ArrayList<Integer>();
		for(int i=1; i<=10;i++) 
		{
			ilist.add(i);
		}
		System.out.println(ilist);
       
		//using Iterator-individual element display
		Iterator<Integer> it=ilist.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("for each loop");
		for(Integer i: ilist)
		{
			
			System.out.println(i);
		}
		System.out.println("forward list iterating");
		ListIterator<Integer> li=ilist.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		
		
		//list interator
		System.out.println("backward list iterating");
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
		
	}

}
