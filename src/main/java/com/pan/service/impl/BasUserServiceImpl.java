package com.pan.service.impl;

import com.pan.mapper.BasUserMapper;
import com.pan.po.BasUser;
import com.pan.service.intf.BasUserServiceIntf;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Copyright (C), kyee 2016-2016
 * FileName: BasUserServiceImpl
 * Author:   panzheng
 * Date:     2016/11/6 21:15
 * Description: //ģ��Ŀ�ġ���������
 * History: //�޸ļ�¼
 * &lt;author&gt;      &lt;time&gt;      &lt;version&gt;    &lt;desc&gt;
 * �޸�������             �޸�ʱ��            �汾��                  ����
 */
@Service("basUserService")
public class BasUserServiceImpl implements BasUserServiceIntf
{

	@Resource
	private BasUserMapper basUserMapper;

	public List<BasUser> getBasUserByHosnum(String hosnum) {
		return this.basUserMapper.getBasUsersByHosnum(hosnum);
	}

	public int getBasUserCount(String hosnum) {
		return this.basUserMapper.getBasUserCount(hosnum);
	}
}

