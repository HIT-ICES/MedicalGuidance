package com.hitices.medicalguidance.bean;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Lei
 * @version 0.1
 * @date 2021/11/03
 * 病人信息, 可以附带注册信息
 */

@Getter
@Setter
public class Patient {

    // 患者姓名
    private String patienName;

    //性别
    private int sex;

    //年龄
    private int old;

    //电话
    private String telephoneNumber;

    // 身份证号码
    private String idNumber;

    @Override
    public String toString() {
        return "";
    }
}
