package edu.hyit.dm.app.service;

import edu.hyit.dm.app.dao.EmployeeDao;
import edu.hyit.dm.app.model.Employee;
import edu.hyit.dm.sys.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService extends BaseService<Employee,EmployeeDao> {
    public Employee findByUsername(String username) {
        Employee employee = new Employee();
        employee.setUsername(username);
        return dao.find(employee);
    }
}
