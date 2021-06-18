package com.asiainfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author 24
 */

@SpringBootApplication
public class LibraryManagementAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryManagementAppApplication.class, args);
	}

}
