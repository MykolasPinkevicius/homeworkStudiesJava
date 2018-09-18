package streams;

public class Salary {

	private Employee employee;
	private double paidSalary;
	
	public Salary(Employee employee, double paidSalary) {
		this.employee = employee;
	}
	
	public double getPaidSalary() {
		return paidSalary;
	}
	public Employee employee() {
		return employee;
	}
}
