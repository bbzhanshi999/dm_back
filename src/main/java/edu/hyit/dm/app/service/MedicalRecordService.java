package edu.hyit.dm.app.service;

import edu.hyit.dm.app.dao.MedicalRecordDao;
import edu.hyit.dm.app.model.MedicalRecord;
import edu.hyit.dm.app.model.MrDrugInfo;
import edu.hyit.dm.sys.base.BaseService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
public class MedicalRecordService extends BaseService<MedicalRecord,MedicalRecordDao> {

    @Transactional
    public void saveUnionDrugInfo(MedicalRecord medicalRecord) {
        medicalRecord.setUpdateTime(new Date());
        medicalRecord.preInsert();
        for(MrDrugInfo drugInfo:medicalRecord.getDrugList()){
            drugInfo.setMrId(medicalRecord.getId());
        }
        dao.insert(medicalRecord);
        dao.insertMrDrugBatch(medicalRecord.getDrugList());
    }
}
