package beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApplication {

	public static void main(String[] args) { 

	
	// default constructor will be called and initialization is done 
	// method 1
		Triangle t=new Triangle();
	//	this will create a new object.It won't be handled by spring 
	
/*  Traditionally we will do the below steps;
		point a=new point();
		a.x=0;
		a.y=0;
		t.setA(a);
		point b=new point();
		
		b.x=20;
		b.y=0;
		t.setB(b);
		t.setC(new point());
		t.draw();
		
		*/
		
		
	// Method 3 (xmlbeanFactory is depreciated)
	   ApplicationContext context=new ClassPathXmlApplicationContext(new String[]{"spring.xml"});
	    BeanFactory context2=(BeanFactory)context;
	    Triangle  t2=(Triangle) context2.getBean("triangle");
	    System.out.println("using ApplicationContext");
	    t2.draw();
	}

}
