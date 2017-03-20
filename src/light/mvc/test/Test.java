/**
 * 
 */
package light.mvc.test;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sun.glass.ui.Application;

import light.mvc.model.demo.Tdemo;
import light.mvc.pageModel.sys.User;

/**
 * @author PBC
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context  = new ClassPathXmlApplicationContext(new String[]{"spring.xml"});
	    TestDemo t= context.getBean("testdemo",TestDemo.class);
		t.setName("test");

		System.out.println(t.getName());
		

	}

}
