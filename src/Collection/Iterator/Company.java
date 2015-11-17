package Collection.Iterator;

import java.util.Iterator;

/**
 * Created by Сергей on 16.11.2015.
 */
public class Company implements Iterable<Employee> {
    private Employee[] employees = new Employee[0];

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    @Override
    public Iterator<Employee> iterator() {
        return new ArrayIterator<>(employees);
    }
}
