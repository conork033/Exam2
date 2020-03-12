package ie.gmit;
/*
Conor Kenny
G003522227
Exam2 EmployeeTest Class
12/03/20
*/

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EmployeeTest {

    private Employee myEmployee;

    @BeforeEach
    void init(){
        myEmployee = new Employee("Conor","08576791","12345",23);
    }

    @Test
    void testConstuctor(){
        assertEquals("Conor",myEmployee.getName());
        assertEquals("08576791",myEmployee.getPhone());
        assertEquals("12345",myEmployee.getEmployeeId());
        assertEquals(23,myEmployee.getAge());

    }

    @Test
      void nameFail(){
        Exception e = assertThrows(IllegalArgumentException.class,()->myEmployee = new Employee(" ","08576791","12345",23));
            assertEquals("Invalid Name",e.getMessage());//invalid Name entry
    }

    @Test
    void phoneFail(){
        Exception e = assertThrows(IllegalArgumentException.class,()->myEmployee = new Employee("Conor"," ","12345",23));
        assertEquals("Invalid Phone",e.getMessage());//invalid Phone entry
    }

    @Test
    void employeeIdFail(){
        Exception e = assertThrows(IllegalArgumentException.class,()->myEmployee = new Employee("Conor","08576791"," ",23));
        assertEquals("Invalid ID",e.getMessage());//invalid Id entry
    }

    @Test
    void ageFail(){
        Exception e = assertThrows(IllegalArgumentException.class,()->myEmployee = new Employee("Conor","08576791","12345",10));
        assertEquals("Invalid Age",e.getMessage());//invalid Age entry
    }

}
