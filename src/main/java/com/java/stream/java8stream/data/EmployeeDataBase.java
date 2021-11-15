package com.java.stream.java8stream.data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;


@Component
public class EmployeeDataBase {
	
    public  List<Employee> getAllEmployees(){
   
    	Employee employee1 = new Employee("Adam",new BigDecimal(5500), "male",Arrays.asList("swimming", "cricket","volleyball"),12,LocalDate.of(1977, 12, 28));
    	Employee employee2 = new Employee("Prasad",new BigDecimal(5600), "female",Arrays.asList("swimming", "boxing","volleyball"),10,LocalDate.of(1988, 12, 28));
    	Employee employee3 = new Employee("Dilk",new BigDecimal(5700), "male",Arrays.asList("swimming", "running","volleyball"),11,LocalDate.of(1980, 12, 28));
    	Employee employee4 = new Employee("Prasad",new BigDecimal(15800), "female",Arrays.asList("swimming", "walking","volleyball"),1,LocalDate.of(1997, 12, 28));
    	Employee employee5 = new Employee("Kasun",new BigDecimal(5900), "male",Arrays.asList("swimming", "badminton","volleyball"),12,LocalDate.of(1975, 12, 28));
    	Employee employee6 = new Employee("Randeer",new BigDecimal(10500), "female",Arrays.asList("swimming", "basketball","volleyball"),20,LocalDate.of(1970, 10, 28));

        return Arrays.asList(employee1,employee2,employee3,employee4,employee5,employee6);

    
    }
    	

}
