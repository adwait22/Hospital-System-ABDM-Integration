package com.example.HAD.prescription.services;

import com.example.HAD.prescription.bean.bean;
import com.example.HAD.prescription.bean.patientIDRes;
import org.springframework.http.ResponseEntity;

public interface Save {

    String savePres(bean obj);

    ResponseEntity<bean> showPres(patientIDRes object);
}
