package ie.gmit;
/*
Conor Kenny
G003522227
Exam2 Employee Class
12/03/20
*/
public class Employee {

    private String name;
    private String phone;
    private String employeeId;
    private int Age;

    public Employee(String name, String phone, String employeeId, int age) {

        setName(name);
        setPhone(phone);
        setEmployeeId(employeeId);
        setAge(age);


    }

    public String getName() {
        return name;
    }
    //******************************************
    public void setName(String name){
        if(name.length()>3 && name.length()<25){
            this.name = name;
        }else{

            throw new IllegalArgumentException("Invalid Name");
        }
    }
    //******************************************
    public String getPhone() {
        return phone;
    }
    //******************************************
    public void setPhone(String phone) {
        if(phone.length() == 8){
            this.phone = phone;

        }else{

            throw new IllegalArgumentException("Invalid Phone");
        }

    }
    //******************************************

    public String getEmployeeId() {
        return employeeId;
    }
    //******************************************

    public void setEmployeeId(String employeeId){
        if(employeeId.length() == 5){
            this.employeeId = employeeId;
        }else{

            throw new IllegalArgumentException("Invalid ID");
        }
    }
    //******************************************

    public int getAge() {
        return Age;
    }
    //******************************************

    public void setAge(int age){
        if(age>16){
            Age = age;
        }else{
            throw new IllegalArgumentException("Invalid Age");
        }
    }
}
