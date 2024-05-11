package demo.api.Data.Persistence.Api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import demo.api.Data.Persistence.Api.entity.Enrollment;
import demo.api.Data.Persistence.Api.entity.User;
import demo.api.Data.Persistence.Api.entity.Course;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {
    // Custom query to find enrollments by user
    List<Enrollment> findByUser(User user);

    // Custom query to find enrollments by course
    List<Enrollment> findByCourse(Course course);

    // Custom query to find enrollments by enrollment date after a certain LocalDateTime
    List<Enrollment> findByEnrollmentDateAfter(LocalDateTime dateTime);

    // Custom query to find enrollments by enrollment date before a certain LocalDateTime
    List<Enrollment> findByEnrollmentDateBefore(LocalDateTime dateTime);

    // Custom query to find enrollments by enrollment date between two LocalDateTime values
    List<Enrollment> findByEnrollmentDateBetween(LocalDateTime startDateTime, LocalDateTime endDateTime);

    // Add more custom query methods as needed...
}
