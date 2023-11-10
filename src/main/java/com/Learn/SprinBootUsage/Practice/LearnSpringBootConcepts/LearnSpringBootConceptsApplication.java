package com.Learn.SprinBootUsage.Practice.LearnSpringBootConcepts;

import com.Learn.SprinBootUsage.Practice.LearnSpringBootConcepts.Components.TestSpringComponent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

import javax.sound.midi.Soundbank;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class LearnSpringBootConceptsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext =
				SpringApplication.run(LearnSpringBootConceptsApplication.class, args);
		TestSpringComponent component = applicationContext.getBean(TestSpringComponent.class);
		System.out.println(component.getMessgage());
		System.out.println(component.getNewMessage());
	}

}
