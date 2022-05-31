package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee{
    int empid;
    String name;
    String email;
    long phoneno;
    String designation;
    double salary;

    public Employee(int empid, String name, String email, Long phoneno, String designation, double salary) {
        this.empid = empid;
        this.name = name;
        this.email = email;
        this.phoneno = phoneno;
        this.designation = designation;
        this.salary = salary;
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
                '}';
    }
}
public class Main {

    public static void main(String[] args) {
        ArrayList<Employee> emp=new ArrayList<>();
        emp.add(new Employee(1,"ramesh","ram@134",3494848494L,"Manager",70000.00));
        emp.add(new Employee(2,"shyam","shyam@345", 45939202L,"Senior Director",200000.00));
        emp.add(new Employee(3,"dibbyo","dibbyo@136",97547654738L,"Consultant",50000.00));
        emp.add(new Employee(5,"suvendu","suv@897",8154784438L,"Software Engineer",30000.00));

        System.out.println(""+emp);
        //finding sum of salary of all employees
        List<Integer> sal= Collections.singletonList(emp.stream().mapToInt(s ->( int) s.salary).sum());
        System.out.println("the sum of employees salary-"+sal);

        //Sorting employee by their name
       List<String> e= emp.stream().sorted(b-> b.name).forEach(System.out::println);
        System.out.println(""+n);

    }
}













