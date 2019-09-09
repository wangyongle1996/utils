package com.wangyongle.util;

import org.junit.Test;

import com.wangyongle.util.StringUtil;

public class StringUtilTest {
	@Test
	public void testGenerateChineseName() {
		String name = StringUtil.generateChineseName();
		System.out.println(name);
	}
	@Test
	public void testRandomChineseString() {
		String name = StringUtil.randomChineseString();
		System.out.println(name);
	}
	@Test
	public void testRandomChineseString2() {
		String name = StringUtil.randomChineseString(3);
		System.out.println(name);
	}
	

}
