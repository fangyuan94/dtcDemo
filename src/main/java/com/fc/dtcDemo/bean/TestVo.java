package com.fc.dtcDemo.bean;

import com.fc.dtc.annotation.Translate;
import com.fc.dtc.annotation.TranslateProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;
import java.util.Map;


/**
 * 测试返回结果集Demo
 * @author fangyuan
 *
 */
/*
 *使用 @ApiModel 该对象转成json后的引用名称
 */
@Translate
@Getter
@Setter
public class TestVo  implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8527981053862121515L;

	
	@TranslateProperty(encode=true,type="sex")
	private String sex;

	private String sex_mc;

	@TranslateProperty(encode=false,type="car")
	private String car_mc;

	private String car;

	@TranslateProperty(translate=TestVo1.class)
	private TestVo1 test1;
	
	@TranslateProperty(translate=TestVo1.class)
	private List<TestVo1> test1s;
	
	@TranslateProperty(translate=TestVo1.class)
	private Map<String, TestVo1> mapTestVo1;

	
}
