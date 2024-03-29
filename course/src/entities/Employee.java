package entities;

public class Employee {
	private Integer id;
	private String name;
	private Double salary;
	
	public Employee() {
		
	}
	
	public Employee(Integer id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	// GET ID
	public Integer getId() {
		return this.id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	// GET NAME 
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	// GET SALARY
	public Double getSalary() {
		return this.salary;
	}
	
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	// Increase Salary
	
	public void increaseSalary(Double percentage) {
		this.salary += salary * percentage / 100.0;
	}
	@Override
	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", salary);	
	}
	
}
