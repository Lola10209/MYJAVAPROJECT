// import java.io.*;
public class lesson6dEmployee {
    String name;
    int age;
    String designation;
    double salary;
    /*  This is a constructor for this class employee. 
    note; every class must have its own constructor except it is not object oriented programming */
    // a constructor is paart of the method; public employee()--method
    public lesson6dEmployee(String name){
        this.name = name;
    }
// let is assign the age of the employee to the variable age
    public void empAge(int empAge){
        age = empAge;
    }

    //let us assign the desination to the variable
    public void empDesignation(String empDesig){
        designation = empDesig;
    }

    //let us assign the employee salary to the variable
    public void empSalary(double empSalary){
        salary = empSalary;
    }

    //print the employee details
    public void printEmployee(){
        System.out.println("Employee name: "+ name);
        System.out.println("Employee Age: " + age);
        System.out.println("Employee Designation: " + designation);
        System.out.println("Employee Salary: " + salary);
    }
}
// note, java does internal conversion. that helps convert result for int and string