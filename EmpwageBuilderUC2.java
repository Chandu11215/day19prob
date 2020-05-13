public class EmpwageBuilderUC2 {

   public static void main(String[] args) {
         //constants
          int isPresent = 1;
          int empRatePerHr = 20;
          int empHr = 8;
    double empCheck = Math.floor(Math.random() *10) %2;
    System.out.println(empCheck);
    if(empCheck == isPresent) {
          System.out.println("employee is Present");
          int perDaySalary = empRatePerHr * empHr;
          System.out.println("Employee per day Salary = "+perDaySalary);
     }          
else
          System.out.println("absent");
         
       }
   }

