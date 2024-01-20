// import java.io.*;
public class lesson6employeeRun {
    public static void main (String[] args){
        // creating an object using a constructor  example of an object staff1
       lesson6dEmployee staff1 = new lesson6dEmployee("John Cena");
       lesson6dEmployee staff2 = new lesson6dEmployee("John Segun Pedro");
       // calling the constructor; e.g; pubic void employee(){}.

      //calling the method for each objests
      staff1.empAge(29);
      staff1.empDesignation("Accountant");
      staff1.empSalary(200000);
      staff1.printEmployee();

      staff2.empAge(29);
      staff2.empDesignation("Lab Scientist");
      staff2.empSalary(350000);
      staff2.printEmployee();
    }
}
