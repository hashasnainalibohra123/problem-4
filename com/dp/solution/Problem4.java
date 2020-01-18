package com.dp.solution;

import java.util.ArrayList;
import java.util.HashSet;

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
	String SortedSet<History> previousDesignation;
	
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
		
		//new employee emp
		saveToOrg(emp);
		listOfCurrentOrgEmployee.add(e)
		Employee emp = new Employee();
		getTheHisty(emp);
	}
	public boolean saveToOrg(emp)
	{
		if(listOfCurrentOrgEmployee.contains(emp))
		{
			listOfCurrentOrgEmployee.add(emp);
		}
	}
	public List<History> getTheHisty()
	{
		
	}
	
}
