package edu.hyit.dm.sys.base;

import edu.hyit.dm.sys.utils.IdGenerator;
import lombok.Data;

import java.util.Date;

@Data
public class BaseModel {

    private String id;

    private Date updateTime;

    private String delFlag;

    public void preInsert(){
        id = IdGenerator.genId();
        updateTime = new Date();
    }


    public void preUpdate() {
        updateTime = new Date();
    }
}
