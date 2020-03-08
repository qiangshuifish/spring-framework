package org.springframework.beans.mytest;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * <p></p>
 *
 * <PRE>
 * <BR>	修改记录
 * <BR>-----------------------------------------------
 * <BR>	修改日期			修改人			修改内容
 * </PRE>
 *
 * @author wenpengyuan
 * @version 1.0
 * @since 1.0
 */
public class TestJava {

	@Test
	public void test() {
		System.out.println("========= test =========");

		System.out.println("&factoryApple".substring("&".length()));

		Map<String,String> map = new HashMap<>();
		map.put("key1","value1");

		map.computeIfAbsent("key2",key -> map.put(key,"value2"));
		System.out.println(map.get("key2"));
	}
}
