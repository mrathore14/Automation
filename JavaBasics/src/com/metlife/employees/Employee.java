package com.metlife.employees;

public class Employee {
    private int empId;
    public String empName;

    private String empPerformance;
    private static String companyName;

    private static int counter=1;

    private double empSalary;

    public static String getCompanyName() {
        return companyName;
    }

    public static void setCompanyName(String companyName) {
        Employee.companyName = companyName;
    }

    //getter
//    public int getEmpId()
//    {
//        return empId;
//    }
    //getter method //return the value//read
    public double getEmpSalary()
    {
        return this.empSalary;
    }

    //setter method //set the value//write
    public void setEmpSalary(double empSalary)
    {
        if(empSalary>=5000)
        {
            this.empSalary=empSalary;
        }
    }

//    public Employee()
//    {
//        empId=counter;
//        counter=counter+1;
//        System.out.println("object created");
//        System.out.println("launch browser");
//    }
    public Employee(int empId)
    {
        if(empId>100)
        {
            this.empId=empId;
            System.out.println(this);
        }
        else {
            System.out.println("Default value is set!!");
        }
    }

    public Employee(int empId,String empName)
    {
        this.empId=empId;
        this.empName=empName;
    }

    public Employee(String empName,int empId)
    {
        this.empId=empId;
        this.empName=empName;
    }
    public Employee(double empId)
    {

    }


    public void displayEmployeeRecords() {

        System.out.println("Employee Id: " + this.empId);
        System.out.println(empName);
        System.out.println(empSalary);
        System.out.println(getEmpPerformance());
        System.out.println(Employee.getCompanyName());
        System.out.println("-------------------------");
    }

    public void allocateBonus() {
        if (getEmpPerformance().equalsIgnoreCase("a")) {
            //increase salary by 5000
            empSalary = empSalary + 5000;
        } else if (getEmpPerformance().equalsIgnoreCase("b")) {
            //increase salary by 3000
            empSalary = empSalary + 3000;
        } else {
            empSalary = empSalary + 1000;
        }
    }

    public String getEmpPerformance() {
        return empPerformance;
    }

    public void setEmpPerformance(String empPerformance) {
        this.empPerformance = empPerformance;
    }
}

