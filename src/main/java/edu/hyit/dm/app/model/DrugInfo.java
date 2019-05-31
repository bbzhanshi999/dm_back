package edu.hyit.dm.app.model;

import edu.hyit.dm.sys.base.BaseModel;
import lombok.Data;

import java.util.List;

@Data
public class DrugInfo extends BaseModel {

    private String drugCode;
    private String drugName;
    private String unit;
    private Double price;

}
