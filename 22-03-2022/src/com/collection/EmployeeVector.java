package com.collection;

import java.util.Iterator;
import java.util.Vector;

class Employee1
{
	int e_id;
	String e_name;
	float e_sal;
	String e_dep;
	public Employee1(int e_id, String e_name, float e_sal, String e_dep) 
	{
		super();
		this.e_id = e_id;
		this.e_name = e_name;
		this.e_sal = e_sal;
		this.e_dep = e_dep;
	}
	@Override
	public String toString() {
		return "Employee [e_id=" + e_id + ", e_name=" + e_name + ", e_sal=" + e_sal + ", e_dep=" + e_dep + "]";
	}
	
}

public class EmployeeVector 
{

	public static void main(String[] args)
	{
		Employee1 e1=new Employee1(121,"Thara",8976.5f,"tcs");
		Employee1 e2=new Employee1(122,"Divi",3246.5f,"tcs");
		Employee1 e3=new Employee1(123,"Devaki",9976.5f,"tcs");
		Employee1 e4=new Employee1(124,"dheja",3276.5f,"tcs");
		Vector<Employee1> list=new Vector<Employee1>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		//System.out.println(list);
		Iterator<Employee1> ie=list.iterator();
		while(ie.hasNext())
		{
			Employee1 eob=ie.next();
			System.out.println(eob.e_id+ " "+eob.e_name+ " "+eob.e_sal+" "+eob.e_dep);
		}
			

	}

}
