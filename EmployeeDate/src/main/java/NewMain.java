import java.util.*;

/**
 *
 * @author FM
 */
public class NewMain {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        
        System.out.print("Enter Name:");
        String name = scan.nextLine();
        System.out.print("Enter Last Name:");
        String lastName = scan.nextLine();
        System.out.print("Enter Birth Day:");
        int birthday = scan.nextInt();
        System.out.print("Enter Birth Month:");
        int birthmonth = scan.nextInt();
        System.out.print("Enter Birth Year:");
        int birthyear = scan.nextInt();
        System.out.print("Enter Hire Day:");
        int hireday = scan.nextInt();
        System.out.print("Enter Hire Month:");
        int hiremonth = scan.nextInt();
        System.out.print("Enter Hire Year:");
        int hireyear = scan.nextInt();
        
        Date birthDay = new Date(birthyear,birthmonth,birthday);
        Date hireDay = new Date(hireyear,hiremonth,hireday);
        
        Employee employee = new Employee(name,lastName,birthDay,hireDay);
        
        System.out.println(employee);
        
        
    }
    
}
