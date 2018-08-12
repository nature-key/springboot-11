package com.springboot;

import com.springboot.MyApplicationEvent;
import com.springboot.MyApplicationListen;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootApplication{

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(SpringbootApplication.class);
//		app.addListeners(new MyApplicationListen());
		ConfigurableApplicationContext context = app.run(args);
		context.publishEvent(new MyApplicationEvent(new Object()));
		context.stop();
//		context.close();
	}
}
