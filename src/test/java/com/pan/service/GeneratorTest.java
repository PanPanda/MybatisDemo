package com.pan.service;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by panzheng on 2016/11/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class GeneratorTest {

	@Autowired
	private MybatisGenerator generatorPO;

	@Test
	public void generator() throws Exception {

		generatorPO.generator();
	}

}