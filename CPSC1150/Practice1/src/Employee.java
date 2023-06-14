
public class Employee {
	
	private int id;
	private String firstname;
	private String lastname;
	private String email;
	private double salary;
	public static final double RATE = .2;
	
	public Employee() {
		
	}
	
	public Employee (int id, String firstname, String lastname, String email, double salary) {
		this.setId(id);
		this.setFirstname(firstname);
		this.setLastname(lastname);
		this.setEmail(email);
		this.setSalary(salary);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	public double getBonus() {
		return salary * RATE;
	}
	
	public static double getRate() {
		return RATE;
	}

}
