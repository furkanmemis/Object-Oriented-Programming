/**
 *
 * @author FM
 */
public class SoftwareEngineer extends Employee{
    private String ProgrammingLanguage;

    public SoftwareEngineer(String EmployeeName, String EmployeeSurname, int EmployeeID, int Salary, String ProgrammingLanguage) {
        super(EmployeeName, EmployeeSurname, EmployeeID, Salary);
        this.ProgrammingLanguage = ProgrammingLanguage;
    }

    public void OperatingSystemFormating(String OP){// OP->Operating System
        System.out.println(super.getEmployeeName()+" is a loading "+OP);
    }
    
    @Override
    public void ShowInfo() {
        super.ShowInfo();
        System.out.println("Knows Language: "+this.ProgrammingLanguage);
    }

    public String getProgrammingLanguage() {
        return ProgrammingLanguage;
    }

    public void setProgrammingLanguage(String ProgrammingLanguage) {
        this.ProgrammingLanguage = ProgrammingLanguage;
    }

    @Override
    public void setSalary(int Salary) {
        super.setSalary(Salary); 
    }

    @Override
    public int getSalary() {
        return super.getSalary();
    }

    @Override
    public void setEmployeeID(int EmployeeID) {
        super.setEmployeeID(EmployeeID); 
    }

    @Override
    public int getEmployeeID() {
        return super.getEmployeeID();
    }

    @Override
    public void setEmployeeSurname(String EmployeeSurname) {
        super.setEmployeeSurname(EmployeeSurname); 
    }

    @Override
    public String getEmployeeSurname() {
        return super.getEmployeeSurname(); 
    }

    @Override
    public void setEmployeeName(String EmployeeName) {
        super.setEmployeeName(EmployeeName); 
    }

    @Override
    public String getEmployeeName() {
        return super.getEmployeeName(); 
    }
    
    
}
