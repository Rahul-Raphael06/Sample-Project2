package spring_demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Tester {
     public static void main(String[] args) {
      
//    	ClassPathResource resource=new ClassPathResource("spring_demo/myconfiguration.xml");
//        BeanFactory factory=new XmlBeanFactory(resource);
//      
//        Mobile mobile=factory.getBean(Mobile.class);
//        System.out.println(mobile);
//        
//        Laptop laptop=factory.getBean(Laptop.class);
//        System.out.println(laptop);	
    	 
    	 ApplicationContext context=new ClassPathXmlApplicationContext("spring_demo/myconfiguration.xml");
    	 System.out.println(context.getBean("mobile"));
    	 System.out.println(context.getBean("mobile"));
    	 System.out.println(context.getBean("mobile"));
    	 System.out.println(context.getBean("mobile"));
    	 
    	 System.out.println(context.getBean("laptop"));	
//    	 System.out.println(context.getBean(Laptop.class));
    	 
    	
    	 
    	 
	}

}
