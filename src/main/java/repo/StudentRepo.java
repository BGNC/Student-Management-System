package repo;

import entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.yaml.snakeyaml.events.Event;

public interface StudentRepo extends JpaRepository<Student,Long> {


}
