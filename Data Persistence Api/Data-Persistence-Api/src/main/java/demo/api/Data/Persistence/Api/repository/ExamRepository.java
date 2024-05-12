package demo.api.Data.Persistence.Api.repository;

import demo.api.Data.Persistence.Api.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import demo.api.Data.Persistence.Api.entity.Exam;
import demo.api.Data.Persistence.Api.constants.ExamStatus;
import demo.api.Data.Persistence.Api.constants.ExamFormat;
import demo.api.Data.Persistence.Api.constants.ExamType;
import demo.api.Data.Persistence.Api.entity.Semester;
import demo.api.Data.Persistence.Api.entity.Session;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ExamRepository extends JpaRepository<Exam, Long> {
    // Custom query to find exams by title
    List<Exam> findByTitle(String title);

    // Custom query to find exams by exam date after a certain LocalDateTime
    List<Exam> findByExamDateAfter(LocalDateTime dateTime);
    // Custom query to find exams by course
    List<Exam> findByCourse(Course course);
    // Custom query to find exams by exam date before a certain LocalDateTime
    List<Exam> findByExamDateBefore(LocalDateTime dateTime);

    // Custom query to find exams by exam date between two LocalDateTime values
    List<Exam> findByExamDateBetween(LocalDateTime startDateTime, LocalDateTime endDateTime);

    // Custom query to find exams by semester
    List<Exam> findBySemester(Semester semester);

    // Custom query to find exams by session
    List<Exam> findBySession(Session session);

    // Custom query to find exams by exam type
    List<Exam> findByExamType(ExamType examType);

    // Custom query to find exams by exam status
    List<Exam> findByStatus(ExamStatus status);

    // Custom query to find exams by exam format
    List<Exam> findByExamFormat(ExamFormat examFormat);

    // Add more custom query methods as needed...
}
