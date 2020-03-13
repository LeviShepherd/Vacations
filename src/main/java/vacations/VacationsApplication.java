package vacations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import vacations.beans.Destination;
import vacations.beans.Vacation;
import vacations.repository.VacationsRepository;

@SpringBootApplication
public class VacationsApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(VacationsApplication.class, args);
	}
	
	@Autowired
	VacationsRepository repo;

	@Override
	public void run(String... args) throws Exception {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(vacations.controller.BeanConfiguration.class);
		
		//Using an existing bean
		Vacation v = appContext.getBean("vacation", Vacation.class);
		v.setDate("2020-04-04");
		repo.save(v);
		
		//Creating a bean to use - not managed by Spring
		Vacation a = new Vacation("Jim Bob", "123-456-7890", "2020-06-04");
		Destination b = new Destination("Nassau", "Bahamas", "Platinum");
		a.setDestination(b);
		repo.save(a);
		
		List<Vacation> myVacations = repo.findAll();
		for(Vacation vacations: myVacations) {
			System.out.println(vacations.toString());
		}
		
		((AbstractApplicationContext) appContext).close();
	}

}
