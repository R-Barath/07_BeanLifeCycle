package in.barath.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.barath.beans.Motor;

public class AppTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Motor motor = context.getBean(Motor.class);
		motor.doWork();

		ConfigurableApplicationContext cctxt = (ConfigurableApplicationContext) context;
		cctxt.close();
	}
}
