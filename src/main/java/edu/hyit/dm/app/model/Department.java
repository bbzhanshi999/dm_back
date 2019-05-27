package edu.hyit.dm.app.model;

import edu.hyit.dm.sys.base.BaseModel;
import lombok.Data;

@Data
public class Department extends BaseModel {

    private String departName;
    private String departCode;
}
