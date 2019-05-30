package edu.hyit.dm.app.web;

import edu.hyit.dm.app.model.Department;
import edu.hyit.dm.app.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/department/")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("find")
    public List<Department> find(@RequestBody Department department){
        return departmentService.findList(department);
    }
}
