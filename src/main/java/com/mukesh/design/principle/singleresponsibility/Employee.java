package com.mukesh.design.principle.singleresponsibility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Employee {
    private Integer id;
    private String name;
    private Double salary;
    private CalculationSalary calculationSalary;

    public Employee(){

    }

    public static void main(String[] args) {
        Employee employee = new Employee();

        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.save(employee);
    }
    //private Connection connection;

    /*public Double calculateSalary(){
        // Calculate Tx and return salary
        return 0d;
    }

    public void save() throws SQLException {
        this.connection = DriverManager.getConnection(""); // this is very costly operation to create for each instance
        Statement stmt = this.connection.createStatement();
        String sqlQuery = "";
        //rest code
    }*/

}
