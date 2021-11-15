package com.java.stream.Java8Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.java.stream.java8stream.StreamExamples;
import com.java.stream.java8stream.data.Employee;

@SpringBootTest
class Java8StreamApplicationTests {

	@Autowired
	private StreamExamples streamExamples;

	@Test
	void contextLoads() {
	}

	@Test
	public void testNumberGenerate() {
		List<Integer> numbers = streamExamples.numberGenerate();
		assertEquals(10, numbers.size());

	}

	@Test
	public void testEmployeeGroupByGender() {
		Map<String, List<Employee>> empMapByGender = streamExamples.groupEmployeesByGender();
		assertEquals(2, empMapByGender.keySet().size());
	}

	@Test
	public void testEmployeeGroupByCategory() {
		Map<String, List<Employee>> empMapByEmpCategory = streamExamples.groupEmployeesBySalary();
		assertEquals(2, empMapByEmpCategory.keySet().size());

	}

}
