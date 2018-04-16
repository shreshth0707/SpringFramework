package beans;

import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessorClass implements BeanPostProcessor{

	@Override
	public Object postProcessAfterInitialization(Object bean,String beanName)
	{
		System.out.println("After initialization " + beanName);
		return bean;
		
	}
	
	@Override
	public Object postProcessBeforeInitialization(Object bean,String beanName)
	{
		System.out.println("before initialization " + beanName);
		return bean;
	}
}
