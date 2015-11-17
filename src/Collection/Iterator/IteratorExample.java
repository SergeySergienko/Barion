package Collection.Iterator;

import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by Сергей on 16.11.2015.
 */
public class IteratorExample {
    public static void main(String[] args) {
        Company company = new Company();
        Employee[] employees = {new Employee("Valera"), new Employee("Tanya"), new Employee("Eibog")};
        company.setEmployees(employees);

        for (Employee emp : company) {
            System.out.println(emp.getName());
        }

        Iterator<Employee> iter = company.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
