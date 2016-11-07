package com.pan.service.intf;

import com.pan.po.BasUser;

import java.util.List;

/**
 * Copyright (C), kyee 2016-2016
 * FileName: BasUserServiceIntf
 * Author:   panzheng
 * Date:     2016/11/6 21:12
 * Description: //ģ��Ŀ�ġ���������
 * History: //�޸ļ�¼
 * &lt;author&gt;      &lt;time&gt;      &lt;version&gt;    &lt;desc&gt;
 * �޸�������             �޸�ʱ��            �汾��                  ����
 */
public interface BasUserServiceIntf {

	public List<BasUser> getBasUserByHosnum(String hosnum);

	public int getBasUserCount(String hosnum);

}
