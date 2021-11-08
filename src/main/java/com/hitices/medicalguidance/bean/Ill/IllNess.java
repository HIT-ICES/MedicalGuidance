package com.hitices.medicalguidance.bean.Ill;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

/**
 * @author Lei
 * @version 0.1
 * @date 2021/11/03
 * 病理单字
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class IllNess {

    // 门诊类型
    private IllType illType;

    // 时间
    private Date date;

    // 地点
    private String location;

    //症状
    private Symptom symptom;

}
