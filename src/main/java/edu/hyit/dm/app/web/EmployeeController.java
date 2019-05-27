package edu.hyit.dm.app.web;

import edu.hyit.dm.app.model.Employee;
import edu.hyit.dm.app.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/api/login")
    public Employee login(Employee credential,HttpSession httpSession){
        Employee principal = employeeService.findByUsername(credential.getUsername());
        if (principal!=null) {
            httpSession.setAttribute("principal",principal);
            return principal;
        }
        return null;
    }

}
