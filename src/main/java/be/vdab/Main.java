package be.vdab;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("container.xml")){
			
			context.getBean("teller1", Teller.class).verhoog();
			context.getBean("teller1", Teller.class).verhoog();
			Teller teller2 = context.getBean("teller2", Teller.class);
			teller2.verhoog();
			context.getBean("teller2", Teller.class).verhoog();
		}
	}

}
