package com.collection;

import java.util.Iterator;
import java.util.LinkedList;



class Employee
{
	int e_id;
	String e_name;
	float e_sal;
	String e_dep;
	public Employee(int e_id, String e_name, float e_sal, String e_dep) 
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
public class EmployeeLinked {

	public static void main(String[] args)
	{
		Employee e1=new Employee(121,"Thara",8976.5f,"tcs");
		Employee e2=new Employee(122,"Divi",3246.5f,"tcs");
		Employee e3=new Employee(123,"Devaki",9976.5f,"tcs");
		Employee e4=new Employee(124,"dheja",3276.5f,"tcs");
		LinkedList<Employee> list=new LinkedList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		//System.out.println(list);
		Iterator<Employee> ie=list.iterator();
		while(ie.hasNext())
		{
			Employee eob=ie.next();
			System.out.println(eob.e_id+ " "+eob.e_name+ " "+eob.e_sal+" "+eob.e_dep);
		}
			

		}

	}


