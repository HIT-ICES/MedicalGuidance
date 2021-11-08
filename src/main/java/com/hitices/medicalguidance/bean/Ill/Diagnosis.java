package com.hitices.medicalguidance.bean.Ill;

import com.hitices.medicalguidance.bean.Ill.IllNess;
import com.hitices.medicalguidance.bean.user.Doctor;
import com.hitices.medicalguidance.bean.user.Patient;

import java.util.Date;

/**
 * @author Lei
 * @version 0.1
 * @date 2021/11/07
 * 诊断单
 */
public class Diagnosis {

    // 病症
    private IllNess illNess;

    //患者
    private Patient patient;

    //医生信息
    private Doctor doctor;

    //医生给出的回执信息
    private Ans ans;

    // 回执时间
    private Date date;
}
