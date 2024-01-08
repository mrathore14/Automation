package com.metlife.employees;

public class EmployeeRunner {


    public static void main(String[] args) {

        Employee.setCompanyName("Metlife");

        Employee emp1 = new Employee(101);
        System.out.println(emp1);
        Employee emp2 = new Employee(102,"saul");
        System.out.println(emp2);
        Employee emp3 = new Employee(103.1);

        Employee[] employees=new Employee[3];
        employees[0]=emp1;
        employees[1]=emp2;
        employees[3]=emp3;

        System.out.println(emp2.empName);
        System.out.println(employees[1].empName);

        //emp1.empId = -101;
        emp1.empName = "john";
        //emp1.empSalary = -9000;
        emp1.setEmpSalary(9000);
//        emp1.empPerformance = "A";
        emp1.setEmpPerformance("A");

        //emp2.empId = 102;
        emp2.empName = "saul";
        //emp2.empSalary = 8000;
        emp2.setEmpSalary(-8000);
//        emp2.empPerformance = "B";
        emp2.setEmpPerformance("C");
//        (102,saul,8000,B,Metlife)

        //load third employee
//        (103,ken,6000,C,Metlife)

//        System.out.println(emp1);
//        System.out.println(emp1.empId);
//
//        System.out.println(emp2);
//        System.out.println(emp2.empId);

        emp1.displayEmployeeRecords();
        emp2.displayEmployeeRecords();
        emp3.displayEmployeeRecords();

        emp1.allocateBonus();
        emp2.allocateBonus();
//        emp3.allocateBonus();

        emp1.displayEmployeeRecords();
        emp2.displayEmployeeRecords();
//        emp3.displayEmployeeRecords();

        System.out.println(emp1.getEmpSalary());
//        System.out.println(emp1.getEmpId());
    }
}
