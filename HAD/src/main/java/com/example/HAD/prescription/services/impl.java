package com.example.HAD.prescription.services;

import com.example.HAD.prescription.bean.bean;
import com.example.HAD.prescription.bean.patientIDRes;
import com.example.HAD.prescription.dao.savedata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class impl implements Save{

    @Autowired
    savedata saved;
    @Override
public String savePres(bean obj) {

    bean Bean = new bean();

    Bean.setPatientId(obj.getPatientId());
    Bean.setPulse(obj.getPulse());
    Bean.setBloodPressure(obj.getBloodPressure());
    Bean.setDiagnosis(obj.getDiagnosis());
    Bean.setPrescription(obj.getPrescription());

    saved.save(Bean);

    return "sucess";
}

@Override
    public ResponseEntity<bean> showPres(patientIDRes object){
    bean Bean=new bean ();

    Bean= saved.findByPatientId(object.getPatientId());

    if(Bean!=null)
    {
        return new ResponseEntity<bean>(Bean, HttpStatus.OK);
    }
//    else
//        return new ResponseEntity<bean>(Bean, HttpStatus.BAD_REQUEST);


    return null;
}




}
