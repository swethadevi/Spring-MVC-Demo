package com.stackroute.domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Student1 {
    public static void main(String args[]){
        ResultSet resultSet1, resultSet2, resultSet3;
        Statement stmt;
        try{
            //Resister Driver with driver manager service
            Class.forName("com.mysql.jdbc.Driver");
            //System.out.println("Driver loaded");//create connection
            //here db1 is database name, root is username and root123 is password
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/db1","swethadevi","swetha@123");


            //create statement object
            stmt=con.createStatement();
            resultSet1=stmt.executeQuery("select * from customers");


            stmt=con.createStatement();
            resultSet3= stmt.executeQuery("select * from student ");


            stmt=con.createStatement();
            resultSet2=stmt.executeQuery("select * from student");


            System.out.println("***ResultSet2***");
            while(resultSet2.next()){

                System.out.println("resultset2(((" +resultSet2.getString(1)+" *** "+resultSet2.getString(2));
            }


            System.out.println("***RESULT SET 1***");
            while(resultSet1.next())
            {

                System.out.println(resultSet1.getInt(2)+"  "+resultSet1.getString(1));
            }


            while(resultSet3.next()) {
                System.out.println("****Final Result set 3****\n" + resultSet3.getString(1) + "  " + resultSet3.getInt(2) + "  " + resultSet3.getString(3) + " " + resultSet3.getString(4));
            }

            con.close();
        }catch(Exception e){ System.out.println(e);}
    }

}