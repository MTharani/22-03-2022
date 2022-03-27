package com.array;

import java.util.Collections;
import java.util.Vector;

public class MyVector {

	public static void main(String[] args) 
	{
	   Vector<String> list=new Vector<String>();
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

	}

}
