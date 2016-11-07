package com.pan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Copyright (C), kyee 2016-2016
 * FileName: ShowHelloController
 * Author:   panzheng
 * Date:     2016/11/6 21:46
 * Description: //模块目的、功能描述
 * History: //修改记录
 * &lt;author&gt;      &lt;time&gt;      &lt;version&gt;    &lt;desc&gt;
 * 修改人姓名             修改时间            版本号                  描述
 */
@Controller
public class ShowHelloController {

	@RequestMapping(value = "/showHello",method = RequestMethod.GET)
	public String showHello(){

		return "showHello";
	}
}

