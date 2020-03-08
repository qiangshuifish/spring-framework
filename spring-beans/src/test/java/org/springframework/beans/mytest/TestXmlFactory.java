package org.springframework.beans.mytest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.SimpleBeanDefinitionRegistry;
import org.springframework.beans.factory.xml.DefaultDocumentLoader;
import org.springframework.beans.factory.xml.DocumentLoader;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import static org.springframework.core.testfixture.io.ResourceTestUtils.qualifiedResource;

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
public class TestXmlFactory {
	private static final Class<?> CLASS = TestXmlFactory.class;
	private static final Resource ROOT_CONTEXT = qualifiedResource(CLASS,"spring.xml");


	@Test
	public void testDefaultListableBeanFactory(){
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(ROOT_CONTEXT);

		((Apple)factory.getBean("apple")).print();
		((Apple)factory.getBean("testNameSpace")).print();
		((Apple)factory.getBean("factoryApple")).print();
		System.out.println(factory.getBean("&&factoryApple"));
	}

	@Test
	public void testDocumentLoader(){
		SimpleBeanDefinitionRegistry registry = new SimpleBeanDefinitionRegistry();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(registry);

		reader.loadBeanDefinitions(ROOT_CONTEXT);
		Environment environment = reader.getEnvironment();
		System.out.println(environment);
	}

	@Test
	public void test(){
		XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(ROOT_CONTEXT);
		((Apple) xmlBeanFactory.getBean("apple")).print();
		((Apple) xmlBeanFactory.getBean("apple2")).print();
		((Apple) xmlBeanFactory.getBean("appleAlias")).print();
	}
}
