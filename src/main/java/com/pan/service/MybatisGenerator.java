package com.pan.service;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Copyright (C), kyee 2016-2016
 * FileName: MybatisGenerator
 * Author:   panzheng
 * Date:     2016/11/5 10:51
 * Description: //模块目的、功能描述
 * History: //修改记录
 * &lt;author&gt;      &lt;time&gt;      &lt;version&gt;    &lt;desc&gt;
 * 修改人姓名             修改时间            版本号                  描述
 */
@Service
public class MybatisGenerator {

	public void generator(){
		try{
			System.out.println("begin");
			List<String> warnings = new ArrayList<String>();
			boolean overwrite = true;
			//指定逆向工程配置文件
			File configFile = new File("/Users/panzheng/developer/java/demo/MybatisDemo/src/main/resources/mybatis/generatorConfig.xml");
			ConfigurationParser cp = new ConfigurationParser(warnings);
			Configuration config = cp.parseConfiguration(configFile);
			DefaultShellCallback callback = new DefaultShellCallback(overwrite);
			MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,
					callback, warnings);
			myBatisGenerator.generate(null);

			System.out.println("Hello World!");
		}catch ( Exception e){

		}
	}

}

