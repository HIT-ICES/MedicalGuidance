package com.hitices.medicalguidance.bean.Ill;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * @author Lei
 * @version 0.1
 * @date 2021/11/07
 *
 * 医生的回执单
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Ans {


    // 诊断结果
    private String result;

    // 使用那些药物
    private List<String> medicine;

    //做那些检查
    private List<String> check;
}
