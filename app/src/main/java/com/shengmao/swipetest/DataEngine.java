package com.shengmao.swipetest;

import java.util.ArrayList;
import java.util.List;


public class DataEngine {

    public static List<NormalModel> loadNormalModelDatas() {
        List<NormalModel> datas = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            if (i % 4 == 0) {
                datas.add(new NormalModel("标题" + i, "我是短的描述" + i));
            } else {
                datas.add(new NormalModel("标题" + i, "我是很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长的描�?" + i));
            }
        }
        return datas;
    }

}