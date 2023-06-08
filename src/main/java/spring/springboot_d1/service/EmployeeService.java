package spring.springboot_d1.service;

import spring.springboot_d1.model.Employee;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    private List<Employee> employees = new ArrayList<>();
    public EmployeeService(){
        employees.add(new Employee("1", "hsien long", "lee"));
        employees.add(new Employee("1", "Derrick", "Tan"));
        employees.add(new Employee("3", "maverick", "Tan"));
    }

    public List<Employee> getAllEmployees(){
        return this.employees;
    }
    public List<Employee> getEmployeesByLastName(String lastName){
        List<Employee> filteredEmployees = employees.stream().filter(emp -> emp.getLastName().equals(lastName)).toList();
        return filteredEmployees;
    }
}
