package org.fridgeguard;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "org.fridgeguard")
public class FridgeGuardApplication {

	public static void main(String[] args) throws Exception {
		new SpringApplication(FridgeGuardApplication.class).run(args);
	}
}
