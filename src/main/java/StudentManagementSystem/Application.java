package StudentManagementSystem;

import entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import repo.StudentRepo;

@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Autowired
	private StudentRepo studentRepo;
	@Override
	public void run(String... args) throws Exception {

		Student student = new Student("firstName","lastName","email@outlook.com.tr");

		studentRepo.save(student);
		/**
		 * save the database
		 */

	}
}
