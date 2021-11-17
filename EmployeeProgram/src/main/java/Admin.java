/**
 *
 * @author FM
 */
public class Admin extends Employee{
    private int NumberOfPeopleResponsible;

    public Admin(String EmployeeName, String EmployeeSurname, int EmployeeID, int Salary, int NumberOfPeopleResponsible) {
        super(EmployeeName, EmployeeSurname, EmployeeID, Salary);
        this.NumberOfPeopleResponsible = NumberOfPeopleResponsible;
    }
    public void ShowInfo(){
        super.ShowInfo();
        System.out.println("Number Of People Responsible: "+this.NumberOfPeopleResponsible);
    }
    public void MakeRaise(int Raise){
        System.out.println("Admin "+super.getEmployeeName()+" maked "+Raise+" $ raise");
    }
    
    public void setNumberOfPeopleResponsible(int NumberOfPeopleResponsible){
        this.NumberOfPeopleResponsible = NumberOfPeopleResponsible;
    }
    
    public int getNumberOfPeopleResponsible(){
        return this.NumberOfPeopleResponsible;
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
