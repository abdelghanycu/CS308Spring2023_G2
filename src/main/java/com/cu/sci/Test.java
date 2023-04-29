package com.cu.sci;

import com.cu.sci.dao.DBEmployee;
import com.cu.sci.models.Employee;
import java.util.Date;

public class Test {

  public static void main(String[] args) {
//    System.out.println("sadf");
//
    DBEmployee db = new DBEmployee();
//    for (Employee employee : db.get()) {
//      System.out.println(employee);
//    }

//    System.out.println(db.get(101));

    Employee employee = new Employee();
    employee.setFirstName("mona");
    employee.setLastName("mona");
    employee.setEmail("mona@gmail.com");
    employee.setJobId("SH_CLERK");
    employee.setSalary(145214);
    employee.setDepartmentId(50);
    employee.setHireDate(new Date());

    System.out.println(db.insert(employee));

  }
}
