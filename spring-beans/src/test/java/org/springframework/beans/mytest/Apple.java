package org.springframework.beans.mytest;

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
public class Apple {

	private String name;

	public Apple() {
	}

	public Apple(String name) {
		this.name = name;
	}

	public void print(){
		System.out.println("I am Apple：" + this.name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
