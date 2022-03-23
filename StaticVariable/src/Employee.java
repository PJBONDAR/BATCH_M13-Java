public class Employee {

   
   private static double salary;// salary  variable is a private static variable

   public static final String DEPARTMENT = "Development "; // DEPARTMENT is a constant

   public static void main(String args[]) {
      salary = 1000;
      System.out.println(DEPARTMENT + "average salary:" + salary);
   }
}
