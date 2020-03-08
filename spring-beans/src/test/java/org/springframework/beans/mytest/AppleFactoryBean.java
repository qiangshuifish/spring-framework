package org.springframework.beans.mytest;

import org.springframework.beans.factory.FactoryBean;

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
public class AppleFactoryBean implements FactoryBean<Apple> {
	@Override
	public Apple getObject() throws Exception {
		return new Apple(" Factory Apple ");
	}

	@Override
	public Class<?> getObjectType() {
		return Apple.class;
	}
}
