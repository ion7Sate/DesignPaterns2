package Composite;

public class Developer extends Employee{
    public Developer(String name, int empId, Long salary) {
        super(name, empId, salary);
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder("Developer: ");
        builder.append(name);
        builder.append(" with ID: ");
        builder.append(empId);
        builder.append('\n');

        return builder.toString();
    }
}
