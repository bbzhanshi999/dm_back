package edu.hyit.dm.app.web;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import edu.hyit.dm.app.model.Employee;
import edu.hyit.dm.app.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/api/login")
    public Employee login(@RequestBody Employee credential, HttpSession httpSession){
        Employee principal = employeeService.findByUsername(credential.getUsername());
        if (principal!=null) {
            httpSession.setAttribute("principal",principal);
            return principal;
        }
        return null;
    }

    @PostMapping("/api/employee/find")
    public PageInfo<Employee> find(Employee employee, Integer pageNum, Integer pageSize){
/**/
        return employeeService.page(employee, pageNum, pageSize);

    }

    @PostMapping("/api/employee/save")
    public String save(@RequestBody Employee employee){
        employeeService.save(employee);
        return "{\"status\":\"success\"}";
    }

}
