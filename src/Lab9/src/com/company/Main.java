package Lab9.src.com.company;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

class Employee{
    int empid;
    String name;
    String email;
    long phoneno;
    String designation;
    double salary;
    LocalDate date;


    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(long phoneno) {
        this.phoneno = phoneno;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Employee(int empid, String name, String email, long phoneno, String designation, double salary, LocalDate date) {
        this.empid = empid;
        this.name = name;
        this.email = email;
        this.phoneno = phoneno;
        this.designation = designation;
        this.salary = salary;
        this.date = date;
    }

    public Employee(int empid, String ramesh, String email, long phoneno, String manager, double salary, Date date) {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneno=" + phoneno +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                ", date=" + date +
                '}';
    }


}
public class Main {

    public static void main(String[] args) {
        ArrayList<Employee> emp=new ArrayList<>();
        emp.add(new Employee(1,"ramesh","ram@134",3494848494L,"Manager",70000.00,LocalDate.parse("2022-02-21")));
        emp.add(new Employee(7,"shyam","shyam@345", 45939202L,"Senior Director",200000.00,LocalDate.parse("2022-04-15")));
        emp.add(new Employee(3,"dibbyo","dibbyo@136",97547654738L,"Consultant",50000.00,LocalDate.parse("2016-07-08")));
        emp.add(new Employee(9,"suvendu","suv@897",8154784438L,"Software Engineer",30000.00,LocalDate.parse("2021-04-30")));

      //  System.out.println(""+emp);
        //finding sum of salary of all employees
        List<Integer> sal= Collections.singletonList(emp.stream().mapToInt(s ->( int) s.salary).sum());
        System.out.println("the sum of employees salary ="+sal);

        //Sorting employee by their name
        System.out.println(" ");
        Comparator<Employee> compareByName = Comparator.comparing( Employee::getName );
       List<Employee> e= emp.stream().sorted(compareByName).collect(Collectors.toList());
        System.out.println("\t\t\t\t\t Sorting Employee by their name---------->");
        System.out.println(""+e);

        System.out.println(" ");
        //sorting employee by their id
        Comparator<Employee> CompareByid=Comparator.comparing(Employee::getEmpid);
        List<Employee> i= emp.stream().sorted(CompareByid).collect(Collectors.toList());
        System.out.println("\t\t\t\t\t Sorting Employee by their id---------->");
        System.out.println(" "+i);
    }
}













