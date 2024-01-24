/***********************************************************************
@Title:	TurkayElifHusnaTestEmployee.java
@Purpose:	To get familiar with usage of methods defined in a class
@Author:    Turkay Elif Hüsna 
@Date:   	14.01.2023
@Version:	1.0
************************************************************************/
package employee;

public class TestEmployee {
   public static void main(String[] args) {
       TurkayElifHusnaEmployee mehmet = new TurkayElifHusnaEmployee("Mehmet Turkay", 1, 155000, 48, "Entrepreneur", 7, 5);
       TurkayElifHusnaEmployee leyla = new TurkayElifHusnaEmployee("Leyla Turkay", 2, 80000, 30, "Doctor", 6, 10);

       System.out.println("Employee name is: " + mehmet.getName());
       mehmet.setName("Elif");
       System.out.println("Employee name is: " + mehmet.getName());

       System.out.println("Employee id is: " + mehmet.getId());
       mehmet.setId(13);
       System.out.println("Employee id is: " + mehmet.getId());

       System.out.println("Employee salary is: " + mehmet.getSalary());
       mehmet.setSalary(16996);
       System.out.println("Employee salary is: " + mehmet.getSalary());
   
       System.out.println("Employee age is: " + mehmet.getAge());
       mehmet.setAge(34);
       System.out.println("Employee age is: " + mehmet.getAge());
       
       System.out.println("Employee position is : " + mehmet.getPosition());
       mehmet.setPosition("CEO");
       System.out.println("Employee position is: " + mehmet.getPosition());
       
       System.out.println("Employee's SS Tax is: " + mehmet.getSsTax(mehmet.getsSTaxRate()));
       System.out.println("Employee's Health Fee is: " + mehmet.getHealthFee(mehmet.getHealthFeeRate()));
       System.out.println("Employee's Fed Tax is: " + mehmet.getFedTax());
       System.out.println("Employee's Insurance is: " + mehmet.getInsurance());
       System.out.println("Employee's Net Pay is: " + mehmet.getNetPay());
       
       System.out.println(" ");
       System.out.println("Employee name is: " + leyla.getName());
       leyla.setName("Suna");
       System.out.println("Employee name is: " + leyla.getName());
       
       System.out.println("Employee id is: " + leyla.getId());
       leyla.setId(99);
       System.out.println("Employee id is: " + leyla.getId());

       System.out.println("Employee salary is: " + leyla.getSalary());
       leyla.setSalary(78000);
       System.out.println("Employee salary is: " + leyla.getSalary());
       
       System.out.println("Employee age is: " + leyla.getAge());
       leyla.setAge(78);
       System.out.println("Employee age is: " + leyla.getAge());

       System.out.println("Employee position is : " + leyla.getPosition());
       leyla.setPosition("Manager");
       System.out.println("Employee position is: " + leyla.getPosition());

       System.out.println("Employee's SS Tax is: " + leyla.getSsTax(leyla.getsSTaxRate()));
       System.out.println("Employee's Health Fee is: " + leyla.getHealthFee(leyla.getHealthFeeRate()));
       System.out.println("Employee's Fed Tax is: " + leyla.getFedTax());
       System.out.println("Employee's Insurance is: " + leyla.getInsurance());
       System.out.println("Employee's Net Pay is: " + leyla.getNetPay());
   }
}
