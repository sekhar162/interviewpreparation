package com.demo.streams.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamObjectsCreation {
	public static void main(String[] args) {

		Stream<Long> longStream = Stream.of(4l, 7l, 3l, 6l, 8l, 9l, 7l, 8l, 1l, 2l);
		System.out.println("**********************************************************");
		System.out.println("min value in array");
		Long lg=	longStream.min(Comparator.comparingLong(Long:: valueOf)).get();
		System.out.println(lg);
		Long lg2=	longStream.min(Comparator.comparingLong(Long:: valueOf)).get();
		System.out.println(lg2);
		System.out.println("**********************************************************");
		
		System.out.println("**********************************************************");
		List<Integer> listOfIntegers = Arrays.asList(1, 3, 2, 4, 6, 5, 3, 2, 5);
		listOfIntegers.stream().forEach(System.out::println);
		System.out.println("**********************************************************");

		List<String> listOfCources = Arrays.asList("java", "java", "microservices", "hibernate", "jpa", "javaee","springboot");
		System.out.println("**********************************************************");

		listOfCources.stream().forEach(System.out::println);
	

		Employee emp1 = new Employee(1, "sekhar", 40000, 101);
		Employee emp2 = new Employee(2, "sravan", 50000, 101);
		Employee emp3 = new Employee(3, "pramod", 60000, 102);
		Employee emp4 = new Employee(4, "arun", 70000, 103);

		List<Employee> empList = new ArrayList<>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);

		empList.stream().forEach(System.out::println);
		System.out.println("**********************************************************");

		Set<String> setOfString = new HashSet<>(listOfCources);
		Stream<String> streamString = setOfString.stream();
		streamString.forEach(System.out::println);
		System.out.println("**********************************************************");

		Set<Integer> integerSet = new HashSet<Integer>(Arrays.asList(1, 3, 2, 4, 6, 5, 3, 2, 5));
		integerSet.stream().forEach(System.out::println);
		System.out.println("Employee salary is lessthan 50000 ");

		empList.stream().filter(e -> e.getSalary() < 50000)
				.forEach(System.out::println);
		System.out.println("**********************************************************");
		System.out.println("list of cources in ascending order using sorted()");
		listOfCources.stream().sorted().forEach(System.out::println);;
		System.out.println("**********************************************************");
		
		System.out.println("list of cources in ascending order using comparator()");
		listOfCources.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
		System.out.println("**********************************************************");
		
		System.out.println("list of cources in ascending order using lambda expression()");
		listOfCources.stream().sorted((c1,c2)-> c1.compareTo(c2)).forEach(System.out::println);
		System.out.println("**********************************************************");

		System.out.println("list of cources in descending order using comparator()");
		listOfCources.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		System.out.println("**********************************************************");
		
		System.out.println("list of cources in descending order using lambda expression()");
		listOfCources.stream().sorted((c1,c2)-> c2.compareTo(c1)).forEach(System.out::println);
		System.out.println("**********************************************************");

	
       System.out.println("sort list of employees based on their salary in ascending order using lambda expression()");
	   empList.stream().sorted((c1,c2)-> (int) (c1.getSalary() - c2.getSalary())).forEach(System.out::println);
	   System.out.println("**********************************************************");
	 
		
		System.out.println("sort list of employees based on their salary in ascending order using Comparator");
		empList.stream().sorted(Comparator.comparingLong(Employee::getSalary)).collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("**********************************************************");

		System.out.println("sort list of employees based on their salary in descending order using Comparator");
		empList.stream().sorted(Comparator.comparingLong(Employee::getSalary).reversed()).collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("**********************************************************");
		
		
		
			System.out.println("sort list of employees based on their name in ascending order using Comparator");
			empList.stream().sorted(Comparator.comparing(Employee::getEmpName)).forEach(System.out::println);
			System.out.println("**********************************************************");

			System.out.println("sort list of employees based on their name in descending order using Comparator");
			empList.stream().sorted(Comparator.comparing(Employee::getEmpName).reversed()).collect(Collectors.toList()).forEach(System.out::println);
			System.out.println("**********************************************************");
			
			
			
		
	}
}


class Employee {
	private int id;
	private String empName;
	private long salary;
	private int dept;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public int getDept() {
		return dept;
	}

	public void setDept(int dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + ", salary=" + salary + ", dept=" + dept + "]";
	}

	public Employee(int id, String empName, long salary, int dept) {
		super();
		this.id = id;
		this.empName = empName;
		this.salary = salary;
		this.dept = dept;
	}

}