package com.array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

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
	class MySortCompare implements Comparator<Employee>
	{

		@Override
		public int compare(Employee o1, Employee o2) {
			if(o1.e_id>o2.e_id)
			return 1;
			else if(o1.e_id<o2.e_id)
			return -1;
			else
				return 0;
			}
		}
		
class MysortSal implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.e_sal>o2.e_sal)
			return 1;
			else if(o1.e_sal<o2.e_sal)
			return -1;
			else
		return 0;
	}
	
}
class Mysortname implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.e_name.compareTo(o2.e_name);
	}
	
}


public class MainEmployee {

	public static void main(String[] args) 
	{
		Employee e1=new Employee(124,"Thara",8976.5f,"tcs");
		Employee e2=new Employee(122,"Divi",3246.5f,"tcs");
		Employee e3=new Employee(121,"Devaki",9976.5f,"tcs");
		Employee e4=new Employee(123,"dheja",3276.5f,"tcs");
		ArrayList<Employee> list=new ArrayList<Employee>();
	list.add(e1);
	list.add(e2);
	list.add(e3);
	list.add(e4);
	System.out.println(list);
	System.out.println("Before sorting");
	Iterator<Employee> ie=list.iterator();
	while(ie.hasNext())
	{
		Employee eob=ie.next();
		System.out.println(eob.e_id+ " "+eob.e_name+ " "+eob.e_sal+" "+eob.e_dep);
	}
	
	System.out.println("After Sorting");
	Collections.sort(list,new MySortCompare());
	Iterator<Employee> ie1=list.iterator();{
	while(ie1.hasNext())
	{
		Employee eob1=ie1.next();
		System.out.println(eob1.e_id+ " "+eob1.e_name+ " "+eob1.e_sal+" "+eob1.e_dep);
	}
	}
	System.out.println("After Sorting salary");
	Collections.sort(list,new MysortSal());
	Iterator<Employee> ie2=list.iterator();{
	while(ie2.hasNext())
	{
		Employee eob2=ie2.next();
		System.out.println(eob2.e_id+ " "+eob2.e_name+ " "+eob2.e_sal+" "+eob2.e_dep);
	}
	}
	System.out.println("After Sorting name");
	Collections.sort(list,new Mysortname());
	Iterator<Employee> ie3=list.iterator();{
	while(ie3.hasNext())
	{
		Employee eob3=ie3.next();
		System.out.println(eob3.e_id+ " "+eob3.e_name+ " "+eob3.e_sal+" "+eob3.e_dep);
	}
	}
	
	
     
	}

}



