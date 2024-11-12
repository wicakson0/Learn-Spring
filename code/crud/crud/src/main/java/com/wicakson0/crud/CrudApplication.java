package com.wicakson0.crud;

import com.wicakson0.crud.model.Student;
import com.wicakson0.crud.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class CrudApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(CrudApplication.class, args);

		// Obtain the StudentService bean from the Spring context
		StudentService studentServiceInstance = context.getBean(StudentService.class);

		studentServiceInstance.saveEntity(new Student("Joko", 17));
		studentServiceInstance.saveEntity(new Student("Budi", 20));
		studentServiceInstance.saveEntity(new Student("Adi", 21));

		studentServiceInstance.deleteEntity(1L);

		studentServiceInstance.updateEntity(2L, "Budi", 27);

		List<Student> studentList = studentServiceInstance.findAllEntities();
		System.out.println(studentList);
	}

}
