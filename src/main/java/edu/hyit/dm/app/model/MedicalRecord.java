package edu.hyit.dm.app.model;


import edu.hyit.dm.sys.base.BaseModel;
import edu.hyit.dm.sys.utils.DateUtils;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class MedicalRecord extends BaseModel {

    private String name;
    private String gender;
    private String age;
    private String contract;
    private String payStatus;
    private Date payTime;
    private Double amount;
    private Double selfPaying;

    private Employee operator;
    private Department department;
    private Employee doctor;

    private List<MrDrugInfo> drugList;


    @Override
    public void preInsert() {
        Date updateTime =  new Date();
        this.setId(DateUtils.format(updateTime,"yyyyMMddHHmmss")+"_"+Math.round(Math.random()*100));
        this.setUpdateTime(updateTime);
    }
}
