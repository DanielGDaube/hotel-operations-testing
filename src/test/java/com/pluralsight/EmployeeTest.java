package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
@Test
    public void punchIn_NewEmployee_HoursWorkedIsZero(){
    //Arrange
    Employee employee = new Employee(234,"Bob","lights",14.50);

    //Act
    employee.punchIn(15.50);

    //Assert
    assertEquals(0, employee.getHoursWorked());
}

    @Test
    public void punchOut_WorkingEmployee_HoursWorkedIsZero(){
        //Arrange
        Employee employee = new Employee(234,"Bob","lights",14.50);
        employee.punchIn(15.50);

        //Act
        employee.punchOut(23);

        //Assert
        assertEquals(7.5, employee.getHoursWorked());
    }
}