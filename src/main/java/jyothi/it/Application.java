package jyothi.it;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import jyothi.it.service.PersonService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		PersonService bean = context.getBean(PersonService.class);
		bean.savePerson();
		bean.getPerson();
	    bean.getPassport();
int i=10;
int j=20;
int age =40;
		
	}
}
