package com.hitices.medicalguidance.controller;

import com.hitices.common.MResponse;
import com.hitices.medicalguidance.bean.user.Patient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Lei
 * @version 0.1
 * @date 2021/11/03
 */
@RequestMapping("/api/v1/patientCotroller")
public class PatientController {

    //注册病人信息
    @PostMapping("registerPatient")
    public MResponse addPatientInfo(@RequestBody Patient patient){
        try {
            MResponse m = MResponse.successMResponse();

            return m;
        }catch (Exception e){
            return MResponse.failedMResponse();
        }
    }


    @PostMapping("getMyPatientIll")
    public MResponse getMyPatientIll(){
        try {
            MResponse m = MResponse.successMResponse();

            return m;
        }catch (Exception e){
            return MResponse.failedMResponse();
        }
    }

}
