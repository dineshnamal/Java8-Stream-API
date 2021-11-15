package com.java.stream.java8stream;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.java.stream.java8stream.data.Employee;
import com.java.stream.java8stream.data.EmployeeDataBase;

@Component
public class StreamExamples {
	@Autowired
private EmployeeDataBase employeeDataBase;
	/**
	 * Returns First 10 numbers of Squars of multiplications of 3 and 5 related to 0 - 1000 
	 */
	
	public List<Integer> numberGenerate() {
		return IntStream.rangeClosed(0, 1000).filter(x-> x%3 == 0 || x%5 == 0 ).map(x->x*x).limit(10).boxed().collect(Collectors.toList());
	}
	
	
	/**
	 * Employee Group By Gender
	 * @return 
	 */
	public Map<String, List<Employee>> groupEmployeesByGender() {
		return employeeDataBase.getAllEmployees().stream().collect(Collectors.groupingBy(Employee::getGender));//x-> x.getGender()
	}
	
	
	/**
	 * Employee Group By Salary
	 * @return 
	 */
	public Map<String, List<Employee>> groupEmployeesBySalary() {
		return employeeDataBase.getAllEmployees().stream().collect(Collectors.groupingBy(e-> (e.getSalary().compareTo(new BigDecimal(10000)) > 1 ) ?"Executive":"Non-Executive"));//x-> x.getGender()
	}
}	

