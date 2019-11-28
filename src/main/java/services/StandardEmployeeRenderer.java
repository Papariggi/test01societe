package services;

import models.Employee;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Class provides methods for console output of employees list.
 */
@Service("renderer")
public class StandardEmployeeRenderer implements EmployeeRender {

    private Set<Employee> employees = new HashSet<>();

    /**
     * Method outputs list of employees to console.
     */
    @Override
    public void render() {
        System.out.println("Employees (Department - FIO - Manager) :");
            employees.forEach(emp -> {
                Employee manager = new Employee();

                for (Employee employee : employees) {

                    if (employee.getUserId() == emp.getManagerId())
                        manager = employee;
                }

                if (manager != null) {
                    System.out.println(emp.getUserDepartment().getDepName() + " - " +
                            emp.getFio() + " - " + manager.getFio());
                } else {
                    System.out.println(emp.getUserDepartment().getDepName() + " - " +
                            emp.getFio() + " - " + emp.getFio());
                }
            });

    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }
}
