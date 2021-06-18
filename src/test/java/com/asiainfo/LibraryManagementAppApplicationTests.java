package com.asiainfo;

import com.asiainfo.repository.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LibraryManagementAppApplicationTests {

	@Autowired
	private BookRepository bookRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void findAll(){
		System.out.println(bookRepository.findAll());
	}
}
