package com.example.HAD.prescription.controller;

import com.example.HAD.AbhaIDRequest;
import com.example.HAD.PatientDemographicBean;
import com.example.HAD.login.bean.loginbean;
import com.example.HAD.prescription.bean.bean;
import com.example.HAD.prescription.bean.patientIDRes;
import com.example.HAD.prescription.dao.savedata;
import com.example.HAD.prescription.services.Save;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class pres {

    @Autowired
    Save SavePres;



    @CrossOrigin (origins = "*")
    @PostMapping("/savepres")
    public String Savepres (@RequestBody bean object) {

        return SavePres.savePres(object);

    }


    @CrossOrigin(origins = "*")
    @PostMapping("/get-pres")
    public ResponseEntity<bean> getdempgraphic(@RequestBody patientIDRes object) {

        return SavePres.showPres(object);
    }

}
