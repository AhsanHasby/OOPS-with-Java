package Practice;

public class EmployeeTest{

    public static void main(String[] args){
    	Employee em = new Employee("Tanjiro", 1234, 44000.000);
	System.out.println(em);
	
	Manager mg = new Manager("Zenitsu", 12345, 40000.000, "IT");
	System.out.println(mg);

	Executive ex = new Executive("Inosuke", 123456, 40000.000, "SWE", 60000.000);
	System.out.println(ex);
    }
}

class Employee{
	private String name;
	private int id;
	private double salary;
	public Employee(String name, int id, double salary){
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	@Override
	public String toString(){
		return "Employee Name: " + name + "\nID: " + id + "\nSalary: " + salary + "Tk";
	}
}

class Manager extends Employee{
	private String department;
	public Manager(String name, int id, double salary, String department){
		super(name, id, salary);
		this.department = department;
	}
	@Override
	public String toString(){
		return super.toString() + "\nDepartment : " + department;
	}
}

class Executive extends Manager {
	private double bonus;
	public Executive(String name, int id, double salary, String department, double bonus){
		super(name, id, salary, department);
		this.bonus = bonus;
	}
	public String toString(){
		return super.toString() + "\nBonus: " + bonus;
	}
}