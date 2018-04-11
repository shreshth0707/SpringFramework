package beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApplication {

	public static void main(String[] args) { 

	
	// method 1
		Triangle t=new Triangle();
	//	this will create a new object.It won't be handled by spring 
		t.draw();
		
	// method 2 
		/*
		BeanFactory factory=new XmlBeanFactory(new FileSystemResource("spring.xml"));
		Triangle t1=(Triangle)factory.getBean("triangle");
		System.out.println("using xmlBeanFactory");
		t1.draw();
	  */	
		
	// Method 3 (xmlbeanFactory is depreciated)
	   ApplicationContext context=new ClassPathXmlApplicationContext(new String[]{"spring.xml"});
	    BeanFactory context2=(BeanFactory)context;
	    Triangle  t2=(Triangle) context2.getBean("triangle");
	    System.out.println("using ApplicationContext");
	    t2.draw();
	}

}
