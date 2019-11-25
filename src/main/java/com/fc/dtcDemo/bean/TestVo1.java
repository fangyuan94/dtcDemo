package com.fc.dtcDemo.bean;

import com.fc.dtc.annotation.Translate;
import com.fc.dtc.annotation.TranslateProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;


/**
 * 测试返回结果集Demo
 * @author fangyuan
 *
 */
@Translate
@Getter
@Setter
public class TestVo1 implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8527981053862121515L;

	@TranslateProperty(encode=true,type="phone")
	private String phone;

	private String phone_mc;

	@TranslateProperty(encode=false,type="clothes")
	private String clothes_mc;

	private String clothes;

}
