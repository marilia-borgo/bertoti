package composity.pattern;

// transformar em interface
abstract class Employee {
    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    public abstract void showDetails();
}