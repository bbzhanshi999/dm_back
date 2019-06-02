package edu.hyit.dm.app.dao;


import edu.hyit.dm.app.model.MedicalRecord;
import edu.hyit.dm.app.model.MrDrugInfo;
import edu.hyit.dm.sys.base.BaseDao;

import java.util.List;

public interface MedicalRecordDao extends BaseDao<MedicalRecord> {
    void insertMrDrugBatch(List<MrDrugInfo> drugList);
}
