package Level2;


public class Employee {

    public int employeeId;
    protected String department;
    private double salary;

    Employee(int employeeId , String department, double salary){
        this.employeeId = employeeId;
        this.department = department;
        this.salary = salary;
    }
    
    public void modifyslary(double newsalry){
        this.salary = newsalry;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }

    public double getSalary() {
        return salary;
    }


}

class Manager extends Employee {

    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    public void displayManagerDetails() {
        System.out.println("Manager Employee ID: " + employeeId); 
        System.out.println("Department: " + department);  
        
       
        System.out.println("Salary: " + getSalary()); // salary is private cant access in subclass 
    }
}

class emp{
    public static void main(String[] args) {
        Manager m1 = new Manager(101, "Hr", 1000000);
        m1.displayEmployeeDetails();
    }
}