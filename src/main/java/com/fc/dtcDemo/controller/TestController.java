package com.fc.dtcDemo.controller;

import com.fc.dtc.utils.DataTransformationUtils;
import com.fc.dtcDemo.bean.TestVo;
import com.fc.dtcDemo.bean.TestVo1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class TestController {

    @Autowired
    private DataTransformationUtils dataTransformationUtils;

    @GetMapping("test")
    @ResponseBody
    public TestVo test() {

        TestVo tv = new TestVo();

        tv.setSex("1");
        tv.setCar_mc("奔驰");

        TestVo1 tv1 = new TestVo1();

        tv1.setPhone("0");
        tv1.setClothes_mc("阿迪达斯");
        tv.setTest1(tv1);

        Map<String, TestVo1> m1 = new HashMap<>();

        m1.put("test", tv1);
        tv.setMapTestVo1(m1);

        List<TestVo1> tv1s = new ArrayList<>();
        tv1s.add(tv1);
        tv.setTest1s(tv1s);

        tv = dataTransformationUtils.transformationData(tv, TestVo.class, TestVo.class);

        return tv;

    }

    @GetMapping("test1")
    @ResponseBody
    public TreeSet test1(){
        return dataTransformationUtils.getDictionaryByType("sex");
    }

}
