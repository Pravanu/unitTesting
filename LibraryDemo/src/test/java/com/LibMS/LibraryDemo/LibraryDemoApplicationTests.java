package com.LibMS.LibraryDemo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.LibMS.LibraryDemo.bean.Library;
import com.LibMS.LibraryDemo.repository.LibRepo;

@SpringBootTest
class LibraryDemoApplicationTests {

	@Autowired
	private LibRepo libRepo;
	
	@Test
	void testSave() {
		
		Library lib =new Library("101","523","Pravanu");
		Library savedLib= libRepo.save(lib);
		
		assertNotNull(savedLib);
		
	}
	
	void testIsMemberExistById() {
		
//		Library lib = new Library("102","589","Rahul");
//		libRepo.save(lib);
		Boolean actualRes=libRepo.existsById("101");
		
		assertThat(actualRes).isTrue();
	}

}
