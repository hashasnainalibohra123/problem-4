package com.dp.solution;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;

class History implements Comparable<History>{
	int rank;
	int desination;
	public int compareTo(History h) {
		return h.rank<this.rank;
	}
}
class Employee
{
	String name;
	int current rank;
	String currentDesignation;
	
	//setter and getter
	SortedSet<History> previousDesignation;
	
	@Override
	public boolean equals(Employee obj) {
		return obj.name.equalsIgnoreCase(this.name) && obj.currentDesignation.equals(this.currentDesignation);
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
}

public class Problem4 {
	static HashSet<Employee> listOfCurrentOrgEmployee;
	public static void main(String args[])
	{
		 listOfCurrentOrgEmployee = new HashSet();
		//sort the list based on  rank;
		//Rank is associated with the desination
		
		
		
		Employee emp = new Employee();
		emp.name = "test";
		emp.currentDesignation = "Program- manager"
		//new employee emp
		saveToOrg(emp);
		
		getTheHisty(emp);
	}
	public boolean saveToOrg(Employee emp)
	{
		History his =new History();
		his.rank = 1;
		his.desination = emp.currentDesignation;
		if(Objects.nonNull(emp.previousDesignation))
		{
			//this will add based on rank
			emp.previousDesignation.add(his);
		}
		else
		{
			emp.previousDesignation = new NavigableSortedSet()
			emp.previousDesignation.add(his);		
		}
		if(!listOfCurrentOrgEmployee.contains(emp))
		{
			listOfCurrentOrgEmployee.add(emp);
		}
	}
	public boolean promot(Employee emp,String newDesignation)
	{
		History his =new History();
		his.rank = his.rank + 1;
		his.desination = emp.currentDesignation;
		emp.previousDesignation.add(his);
		
		emp.currentDesignation = newDesignation;
		
	}
	public List<History> getTheHisty(int count, Employee emp)
	{
		//5 4 3 2 1
		//get last 2  --  4 3
		List historyList =  new ArrayList();
		emp.previousDesignation
	}
	
}
