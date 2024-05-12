package demo.api.Data.Persistence.Api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import demo.api.Data.Persistence.Api.entity.Assignment;
import demo.api.Data.Persistence.Api.entity.Course;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface AssignmentRepository extends JpaRepository<Assignment, Long> {
    List<Assignment> findByCourse(Course course);
    List<Assignment> findByTitleContaining(String keyword);
    List<Assignment> findByDeadlineAfter(LocalDateTime dateTime);
    List<Assignment> findByDeadlineBefore(LocalDateTime dateTime);
    List<Assignment> findByDeadlineBetween(LocalDateTime startDateTime, LocalDateTime endDateTime);
}
