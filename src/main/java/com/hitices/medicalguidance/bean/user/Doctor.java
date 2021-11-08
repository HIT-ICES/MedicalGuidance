package com.hitices.medicalguidance.bean.user;

import com.hitices.medicalguidance.bean.Ill.IllType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Lei
 * @version 0.1
 * @date 2021/11/07
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Doctor {

    // 医生姓名
    private String name;

    // 日期
    private String tel;

    // 身份证号码
    private String Number;

    // 医生的类别
    private IllType illType;
}
