package com.pan.controller;

import com.pan.po.BasUser;
import com.pan.service.intf.BasUserServiceIntf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Copyright (C), kyee 2016-2016
 * FileName: GetBasUserController
 * Author:   panzheng
 * Date:     2016/11/5 14:40
 * Description: //ģ��Ŀ�ġ���������
 * History: //�޸ļ�¼
 * &lt;author&gt;      &lt;time&gt;      &lt;version&gt;    &lt;desc&gt;
 * �޸�������             �޸�ʱ��            �汾��                  ����
 */
@Controller
public class GetBasUserController {

	@Autowired
	private BasUserServiceIntf basUserService;


	@RequestMapping(value = "/getBasUsers",method = RequestMethod.GET)
	public String getBasUser(@RequestParam("hosnum")String hosnum, ModelMap modelMap){

		List<BasUser> basUserList = basUserService.getBasUserByHosnum(hosnum);

		int basUserCount = basUserService.getBasUserCount(hosnum);

		modelMap.put("basUserCount",basUserCount);
		modelMap.put("basUsers",basUserList);

		return "basUsers";
	}

}

