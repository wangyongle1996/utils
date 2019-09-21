package com.wangyongle.util.test;

import org.junit.Test;

import com.wangyongle.common.utils.StringUtil;

public class StringUtilTest {
//	(1)测试StringUtil工具类中toHtml()方法，传一段文本进去，输出带html标签的文本。（4分）
	@Test
	public void testToHtml() {
		String src = "9月5日一大早，又有了新情况。\r\n" + 
				"上午9点多，传出中美经贸高级别磋商牵头人通话的消息。\r\n" + 
				"9月5日上午，中共中央政治局委员、国务院副总理、中美全面经济对话中方牵头人刘鹤应约与美国贸易代表莱特希泽、财政部长姆努钦通话。";
		String html = StringUtil.toHtml(src);
		System.out.println(html);
	}
//	测试StringUtil工具类中的是否为中国地区手机号码isPhone()工具方法。
	@Test
	public void testIsPhoneNumber() {
//		传一次合法的手机号码，测试通过（4分）。
//		String number = "15312312312";
//		传一个非法的手机号码测试不通过（4分）
		String number = "12312312312";
		boolean b = StringUtil.isPhoneNumber(number);
		if (b) {
			System.out.println("该手机号合法");
		} else {
			System.out.println("该手机号非法");
		}
	}
//	测试StringUtil工具类中的是否为邮箱isEmail()工具方法。
	@Test
	public void testIsEmail() {
//		传一个非法的邮箱测试不通过（4分）。
//		String email = "123123.com";
//		传一次合法的邮箱，测试通过（4分）。
		String email = "123@123.com";
		
		boolean b = StringUtil.isEmail(email);
		if (b) {
			System.out.println("该改邮箱合法");
		} else {
			System.out.println("该邮箱非法");
		}
	}
}
