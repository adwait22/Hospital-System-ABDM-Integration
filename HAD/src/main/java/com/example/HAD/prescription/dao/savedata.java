package com.example.HAD.prescription.dao;
import com.example.HAD.prescription.bean.bean;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface savedata extends JpaRepository<bean, Integer> {

    bean findByPatientId(String requestId);


}
