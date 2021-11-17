
import java.util.Scanner;

/**
 *
 * @author FM
 */
public class NewMain {

    public static void main(String[] args) {
        
        
        
        System.out.println("Welcome Employee System.");
        while(true){
            System.out.println("Admin(1)\nSoftware Engineer(2)\nEmployee(3)\nQuit(q)\nChoice department: ");
            Scanner Scanner = new Scanner(System.in);
            String DepartmentChoice = Scanner.nextLine();
        
            System.out.println("---------------------------------");
        
            if(DepartmentChoice.equals("q")){
                System.out.println("See you tomorrow..");
                break;
            }
            else if(DepartmentChoice.equals("1")){
                Admin admin = new Admin("Furkan","Memiş",3416,10000,3);
                while(true){
                    System.out.println("Show Info(1)\nMake Raise(2)\nSet Name(3)\nSet Surname(4)\nSet ID(5)\nSet Salary(6)\nSet Number Of People Responsible(7)\nQuit(q)");
                    Scanner ScannerAdmin = new Scanner(System.in);
                    String AdminChoice = ScannerAdmin.nextLine();
                    System.out.println("---------------------------------");
                    if(AdminChoice.equals("q")){
                        System.out.println("Exiting..");
                        System.out.println("---------------------------------");        
                        break;
                    }
                    else if(AdminChoice.equals("1")){
                        admin.ShowInfo();
                        System.out.println("---------------------------------");
                        continue;
                    }
                    else if(AdminChoice.equals("2")){
                        System.out.println("Enter Raise: ");
                        Scanner ScannerAdminRaise = new Scanner(System.in);
                        int Raise = ScannerAdminRaise.nextInt();
                        admin.MakeRaise(Raise);
                        System.out.println("---------------------------------");
                        continue;

                    }
                    else if(AdminChoice.equals("3")){
                        System.out.println("-Set Admin Name-");
                        System.out.println("Enter New Admin Name: ");
                        Scanner ScannerAdminName = new Scanner(System.in);
                        String NewAdminName = ScannerAdminName.nextLine();
                    
                        admin.setEmployeeName(NewAdminName);
                        System.out.println("Name: "+admin.getEmployeeName());
                        System.out.println("---------------------------------");
                        continue;
                        

                    }
                    else if(AdminChoice.equals("4")){
                        System.out.println("-Set Admin Suname-");
                        System.out.println("Enter New Admin Surname: ");
                        Scanner ScannerAdminSurname = new Scanner(System.in);
                        String NewAdminSurname = ScannerAdminSurname.nextLine();
                    
                        admin.setEmployeeSurname(NewAdminSurname);
                        System.out.println("Surname: "+admin.getEmployeeSurname());
                        System.out.println("---------------------------------");
                        continue;
                        
                    }
                    else if(AdminChoice.equals("5")){
                        System.out.println("-Set Admin ID-");
                        System.out.println("Enter New Admin ID: ");
                        Scanner ScannerAdminID = new Scanner(System.in);
                        int NewAdminID = ScannerAdminID.nextInt();
                    
                        admin.setEmployeeID(NewAdminID);
                        System.out.println("ID: "+admin.getEmployeeID());
                        System.out.println("---------------------------------");
                        continue;
                        
                    }
                    else if(AdminChoice.equals("6")){
                        System.out.println("-Set Admin Salary-");
                        System.out.println("Enter New Admin Salary: ");
                        Scanner ScannerAdminSalary = new Scanner(System.in);
                        int NewAdminSalary = ScannerAdminSalary.nextInt();
                    
                        admin.setSalary(NewAdminSalary);
                        System.out.println("Salary: "+admin.getSalary());
                        System.out.println("---------------------------------");
                        continue;
                        
                    }
                    else if(AdminChoice.equals("7")){
                        System.out.println("-Set Number Of People Responsible-");
                        System.out.println("Enter New Number Of People Responsible: ");
                        Scanner ScannerAdminNumberOfPeopleResponsible = new Scanner(System.in);
                        int NewNumberOfPeopleResponsible = ScannerAdminNumberOfPeopleResponsible.nextInt();
                    
                        admin.setNumberOfPeopleResponsible(NewNumberOfPeopleResponsible);
                        System.out.println("Number Of People Responsible: "+admin.getNumberOfPeopleResponsible());
                        continue;

                    }    
                }    
            }
            else if(DepartmentChoice.equals("2")){
                SoftwareEngineer  SoftEngi = new SoftwareEngineer("Zeynep","Otu",1634,20000,"Python, Java, C");
                while(true){
                System.out.println("Show Info(1)\nFormatting Operation System(2)\nSet Name(3)\nSet Surname(4)\nSet ID(5)\nSet Salary(6)\nSet Program Language(7)\nQuit(q)");
                Scanner ScannerSoftEngi = new Scanner(System.in);
                String SoftEngiChoice = ScannerSoftEngi.nextLine();
                System.out.println("---------------------------------");
                    
                if(SoftEngiChoice.equals("q")){
                    System.out.println("Exiting..");
                    System.out.println("---------------------------------");        
                    break;
                }
                else if(SoftEngiChoice.equals("1")){
                    SoftEngi.ShowInfo();
                    System.out.println("---------------------------------");
                    
                }
                else if(SoftEngiChoice.equals("2")){
                    System.out.println("Enter operating system: ");
                    Scanner ScannerSoftEngiOperatingSystem = new Scanner(System.in);
                    String SoftEngiOperatingSystem = ScannerSoftEngiOperatingSystem.nextLine();
                    
                    SoftEngi.OperatingSystemFormating(SoftEngiOperatingSystem);
                    System.out.println("---------------------------------");
                    
                }
                else if(SoftEngiChoice.equals("3")){
                    System.out.println("-Set New Software Engineer Name-");
                    System.out.println("Enter New Software Engineer Name: ");
                    Scanner ScannerSoftEngiName = new Scanner(System.in);
                    String SoftEngiNewName = ScannerSoftEngiName.nextLine();
                    
                    SoftEngi.setEmployeeName(SoftEngiNewName);
                    System.out.println("Name: "+SoftEngi.getEmployeeName());
                    System.out.println("---------------------------------");
                    
                }
                else if(SoftEngiChoice.equals("4")){
                    System.out.println("Set New Software Engineer Surname-");
                    System.out.println("Enter New Software Engineer Surname:");
                    Scanner ScannerSoftEngiSurname = new Scanner(System.in);
                    String SoftEngiNewSurname = ScannerSoftEngiSurname.nextLine();
                    
                    SoftEngi.setEmployeeSurname(SoftEngiNewSurname);
                    System.out.println("Surname: "+SoftEngi.getEmployeeSurname());
                    System.out.println("---------------------------------");

                }
                else if(SoftEngiChoice.equals("5")){
                    System.out.println("-Set New Software Engineer ID-");
                    System.out.println("Enter New Software Engineer ID: ");
                    Scanner ScannerSoftEngiID = new Scanner(System.in);
                    int SoftEngiNewID = ScannerSoftEngiID.nextInt();
                    
                    SoftEngi.setEmployeeID(SoftEngiNewID);
                    System.out.println("ID: "+SoftEngi.getEmployeeID());
                    System.out.println("---------------------------------");

                }
                else if(SoftEngiChoice.equals("6")){
                    System.out.println("-Set New Software Engineer Salary-");
                    System.out.println("Enter New Software Engineer Salary: ");
                    Scanner ScannerSoftEngiSalary = new Scanner(System.in);
                    int SoftEngiNewSalary = ScannerSoftEngiSalary.nextInt();
                    
                    SoftEngi.setSalary(SoftEngiNewSalary);
                    System.out.println("Salary: "+SoftEngi.getSalary());
                    System.out.println("---------------------------------");

                }
                else if(SoftEngiChoice.equals("7")){
                    System.out.println("-Set Program Language-");
                    System.out.println("Enter New Program Language: ");
                    Scanner ScannerSoftEngiProgramLanguage = new Scanner(System.in);
                    String SoftEngiProgrammingLanguage = ScannerSoftEngiProgramLanguage.nextLine();
                
                    SoftEngi.setProgrammingLanguage(SoftEngiProgrammingLanguage);
                    System.out.println("Programming Language: "+SoftEngi.getProgrammingLanguage());
                    System.out.println("---------------------------------");

                }
            }
        }
            else if(DepartmentChoice.equals("3")){
                Employee Employee = new Employee("Ahmet Akif","Memiş",1616,1000);
                while(true){
                    System.out.println("Show Info(1)\nSet Name(2)\nSet Surname(3)\nSet ID(4)\nSet Salary(5)\nQuit(q)");
                    Scanner ScannerEmployee = new Scanner(System.in);
                    String EmployeeChoice = ScannerEmployee.nextLine();
                    System.out.println("---------------------------------"); 
                    
                    if(EmployeeChoice.equals("q")){
                    System.out.println("Exiting..");
                    System.out.println("---------------------------------");        
                    break; 
                    }
                    else if(EmployeeChoice.equals("1")){
                        Employee.ShowInfo();
                        System.out.println("---------------------------------");
                    }
                    else if(EmployeeChoice.equals("2")){
                        System.out.println("-Set New Employee Name-");
                        System.out.println("Enter New Employee Name: ");
                        Scanner ScannerEmployeeName = new Scanner(System.in);
                        String EmployeeNewName = ScannerEmployeeName.nextLine();
                        
                        Employee.setEmployeeName(EmployeeNewName);
                        System.out.println("Name: "+Employee.getEmployeeName());
                        System.out.println("---------------------------------");
                    }
                    else if(EmployeeChoice.equals("3")){
                        System.out.println("-Set New Employee Surname-");
                        System.out.println("Enter New Employee Surname: ");
                        Scanner ScannerEmployeeSurname = new Scanner(System.in);
                        String EmployeeNewSurname = ScannerEmployeeSurname.nextLine();
                        
                        Employee.setEmployeeSurname(EmployeeNewSurname);
                        System.out.println("Surname: "+Employee.getEmployeeSurname());
                        System.out.println("---------------------------------");
                    }
                    else if(EmployeeChoice.equals("4")){
                        System.out.println("-Set New Employee ID-");
                        System.out.println("Enter New Employee ID: ");
                        Scanner ScannerEmployeeID = new Scanner(System.in);
                        int EmployeeNewID = ScannerEmployeeID.nextInt();
                        
                        Employee.setEmployeeID(EmployeeNewID);
                        System.out.println("ID: "+Employee.getEmployeeID());
                        System.out.println("---------------------------------");        
                    }
                    else if(EmployeeChoice.equals("5")){
                        System.out.println("-Set New Employee Salary-");
                        System.out.println("Enter New Employee Salary: ");
                        Scanner ScannerEmployeeSalary = new Scanner(System.in);
                        int EmployeeNewSalary = ScannerEmployeeSalary.nextInt();
                        
                        Employee.setSalary(EmployeeNewSalary);
                        System.out.println("Salary: "+Employee.getSalary());
                        System.out.println("---------------------------------"); 
                    }
                }
            }
        }
    }
}
