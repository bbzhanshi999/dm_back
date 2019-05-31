package edu.hyit.dm.app.web;

import edu.hyit.dm.app.model.MedicalRecord;
import edu.hyit.dm.app.service.MedicalRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/mr")
public class MedicalRecordController {

    @Autowired
    MedicalRecordService medicalRecordService;

    @GetMapping("{id}")
    public MedicalRecord findById(@PathVariable("id") String id){
        return medicalRecordService.findById(id);
    }

    @PostMapping("")
    public MedicalRecord find(MedicalRecord medicalRecord){
        return medicalRecordService.find(medicalRecord);
    }

    @PostMapping("save")
    public void insert(@RequestBody MedicalRecord medicalRecord){
        medicalRecordService.save(medicalRecord);
    }
}
