package spring.springboot_d1.controller;

import spring.springboot_d1.model.Employee;
import spring.springboot_d1.service.EmployeeService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// RequestMapping
// GetMapping (Retrieve list/single objects)
// PostMapping (Update an existing object)
// DeletMapping (Delete an object from a list/db)

@Controller
@RequestMapping(path="/employees")
public class EmployeeController {

    @Autowired
    EmployeeService empSvc;

    // public EmployeeController(){
    //     empSvc = new EmployeeService();
    // }
    
    @GetMapping(value = "/list")
    public @ResponseBody List<Employee> getAllEmployees(){
        return empSvc.getAllEmployees();
    }

    @GetMapping(value = "/filteredList")
    public @ResponseBody List<Employee> getEmployeesByLastName(){
        return empSvc.getEmployeesByLastName("Tan");
    }
}
