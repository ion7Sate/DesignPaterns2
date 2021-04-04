package Composite;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee{
    private List<Employee> employees = new ArrayList<>();

    public Manager(String name, int  empId, Long salary) {
        super(name, empId, salary);
    }

    @Override
    public void add(Employee employee){
        employees.add(employee);
    }

    @Override
    public void remove(Employee employee){
        employees.remove(employee);
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder("Manager: ");
        builder.append(name);
        builder.append(" with ID: ");
        builder.append(empId);
        builder.append('\n');


        builder.append("Employees:");
        builder.append('\n');
        employees
                .forEach(employee -> builder.append(employee.toString()));


        return builder.toString();
    }
}
