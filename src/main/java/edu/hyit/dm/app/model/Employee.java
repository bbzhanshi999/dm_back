package edu.hyit.dm.app.model;

import edu.hyit.dm.sys.base.BaseModel;
import lombok.Data;

@Data
public class Employee extends BaseModel {
    private String username;
    private String password;
    private String name;
    private String phone;

    private Department department;
}
