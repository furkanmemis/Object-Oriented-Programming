/**
 *
 * @author FM
 */
public class Employee {
    private String EmployeeName;
    private String EmployeeSurname;
    private int EmployeeID;
    private int Salary;

    public Employee(String EmployeeName, String EmployeeSurname, int EmployeeID,int Salary) {
        this.EmployeeName = EmployeeName;
        this.EmployeeSurname = EmployeeSurname;
        this.EmployeeID = EmployeeID;
        this.Salary = Salary;
    }

    public void  ShowInfo(){
        System.out.println("Name: "+getEmployeeName()
                +"\nSurname: "+getEmployeeSurname()
                +"\nID: "+getEmployeeID()
                +"\nSalary: "+getSalary());
    }
 
    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String EmployeeName) {
        this.EmployeeName = EmployeeName;
    }

    public String getEmployeeSurname() {
        return EmployeeSurname;
    }

    public void setEmployeeSurname(String EmployeeSurname) {
        this.EmployeeSurname = EmployeeSurname;
    }

    public int getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(int EmployeeID) {
        this.EmployeeID = EmployeeID;
    }
    
    public int getSalary(){
        return Salary;
    }
    
    public void setSalary(int Salary){
        this.Salary = Salary;
    }
    
}
