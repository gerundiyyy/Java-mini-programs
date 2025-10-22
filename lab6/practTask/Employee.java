package lab6;

public class Employee extends Person {
    public Employee(String name) {
        super();
    }

    public String getFIO() {
        return "y name is " + super.getFIO();
    }

    public static void main(String[] args) {
        Employee emp = new Employee(null);
        emp.setFIO("Иван");
        System.out.println(emp.getFIO());
    }
}