package edu.hyit.dm.app.model;

import lombok.Data;

@Data
public class MrDrugInfo {

    private String mrId;
    private DrugInfo drugInfo;
    private Integer  drugCount;
}
