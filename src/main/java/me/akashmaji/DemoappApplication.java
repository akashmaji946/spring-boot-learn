package me.akashmaji;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
//@PropertySource("./props/application.properties")
public class DemoappApplication {

	public static void main(String[] args) {
		var container = SpringApplication.run(DemoappApplication.class, args);
		MyApp app = container.getBean(MyApp.class);
		
		System.out.println(app.getAppName());
		System.out.println(app.getAppVersion());
	}

}
