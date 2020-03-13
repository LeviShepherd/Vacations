package vacations.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import vacations.beans.Vacation;
import vacations.beans.Destination;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public Vacation vacation() {
		Vacation bean = new Vacation("Levi Shepherd");
		return bean;
	}
	
	@Bean
	public Destination destination() {
		Destination bean = new Destination("Paris", "France", "Gold");
		return bean;
	}
}
