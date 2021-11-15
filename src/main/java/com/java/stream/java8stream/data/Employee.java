package com.java.stream.java8stream.data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Employee {

	private String name;
	private BigDecimal salary;
	private String gender;
	private List<String> hobbies = new ArrayList<>();
	private Integer numberOfYearsOfService;
	private LocalDate birthDate;

	public Employee(String name, BigDecimal salary, String gender, List<String> hobbies, Integer numberOfYearsOfService,
			LocalDate birthDate) {
		super();
		this.name = name;
		this.salary = salary;
		this.gender = gender;
		this.hobbies = hobbies;
		this.numberOfYearsOfService = numberOfYearsOfService;
		this.birthDate = birthDate;
	}

	public Integer getNumberOfYearsOfService() {
		return numberOfYearsOfService;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}

}
